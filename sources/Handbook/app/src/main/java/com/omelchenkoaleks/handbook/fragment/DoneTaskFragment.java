package com.omelchenkoaleks.handbook.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.omelchenkoaleks.handbook.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class DoneTaskFragment extends TaskFragment {

    public DoneTaskFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_done_task, container, false);

        mRecyclerView = rootView.findViewById(R.id.rvDoneTasks);

        mRecyclerView.setLayoutManager(mLayoutManager);

        mLayoutManager = new LinearLayoutManager(getActivity());



        return rootView;
    }

}
