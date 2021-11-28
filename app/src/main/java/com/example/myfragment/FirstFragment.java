package com.example.myfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfragment.adapter.FirstFrAdapter;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    private RecyclerView res;
    private FirstFrAdapter frAdapter;
    private ArrayList<String> list = new ArrayList<>();


    public void loadData(){
        for (int i = 0; i < 20; i++) {
            list.add("item"+i);
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_first,container,false);

        res = view.findViewById(R.id.res);
        loadData();
        frAdapter = new FirstFrAdapter(list,getContext());
        res.setAdapter(frAdapter);
        return view;
    }
}

