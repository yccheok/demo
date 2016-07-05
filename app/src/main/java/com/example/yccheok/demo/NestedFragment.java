package com.example.yccheok.demo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by yccheok on 6/7/2016.
 */
public class NestedFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public NestedFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        android.util.Log.i("CHEOK", "NestedFragment onCreate " + getArguments().getInt(ARG_SECTION_NUMBER));
    }

    public static NestedFragment newInstance(int sectionNumber) {
        NestedFragment fragment = new NestedFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nested, container, false);
        TextView textView = (TextView) view.findViewById(R.id.text_view);
        textView.setText("Fragment " + getArguments().getInt(ARG_SECTION_NUMBER));
        return view;
    }

}
