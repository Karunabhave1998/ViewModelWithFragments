package com.example.viewmodelwithfragments;

import static com.example.viewmodelwithfragments.databinding.FragmentRecyclerBinding.inflate;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewmodelwithfragments.databinding.FragmentRecyclerBinding;

import java.util.ArrayList;
import java.util.List;


public class RecyclerFragment extends Fragment {

    FragmentRecyclerBinding binding;



    public RecyclerFragment() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       binding=  FragmentRecyclerBinding.inflate(inflater, container, false);










       return binding.getRoot();
    }
}