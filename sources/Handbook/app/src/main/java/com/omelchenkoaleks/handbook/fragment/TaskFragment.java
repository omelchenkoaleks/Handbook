package com.omelchenkoaleks.handbook.fragment;

import android.app.Fragment;
import android.support.v7.widget.RecyclerView;

import com.omelchenkoaleks.handbook.adapter.CurrentTaskAdapter;
import com.omelchenkoaleks.handbook.model.ModelTask;

public abstract class TaskFragment extends Fragment {

    protected RecyclerView mRecyclerView;

    protected RecyclerView.LayoutManager mLayoutManager;

    protected CurrentTaskAdapter mAdapter;

    public void addTask(ModelTask newTask) {
        int position = -1;

        for (int i = 0; i < mAdapter.getItemCount(); i++) {
            if (mAdapter.getItem(i).isTask()) {
                ModelTask task = (ModelTask) mAdapter.getItem(i);
                if (newTask.getDate() < task.getDate()) {
                    position = i;
                    break;
                }
            }
        }

        if (position != -1) {
            mAdapter.addItem(position, newTask);
        } else {
            mAdapter.addItem(newTask);
        }
    }
}
