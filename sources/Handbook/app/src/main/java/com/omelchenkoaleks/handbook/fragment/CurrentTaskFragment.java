package com.omelchenkoaleks.handbook.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.omelchenkoaleks.handbook.R;
import com.omelchenkoaleks.handbook.adapter.CurrentTaskAdapter;
import com.omelchenkoaleks.handbook.model.ModelTask;


/**
 * A simple {@link Fragment} subclass.
 */
public class CurrentTaskFragment extends TaskFragment {

    public CurrentTaskFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_current_task, container, false);

        mRecyclerView = rootView.findViewById(R.id.rvCurrentTasks);

        mLayoutManager = new LinearLayoutManager(getActivity());

        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new CurrentTaskAdapter(this);
        mRecyclerView.setAdapter(mAdapter);

        return rootView;
    }
}
