package com.example.viewmodelwithfragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewmodelwithfragments.databinding.FragmentUserBinding;

import java.util.ArrayList;
import java.util.List;


public class UserFragment extends Fragment {


    FragmentUserBinding binding;

    SharedViewModel sharedViewModel;

    List<SharedViewModel> sharedViewModelList = new ArrayList<>();

    public UserFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding =FragmentUserBinding.inflate(inflater, container, false);

        binding.submitBtnId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//
//                String usernameStr = binding.usernameId.getText().toString();
//                String emailStr = binding.emailId.getText().toString();
//
//                Bundle bundle = new Bundle();
//                bundle.putString("UserName",usernameStr);
//                bundle.putString("Email",emailStr);
//
//                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//                RecyclerFragment recyclerFragment = new RecyclerFragment();
//                recyclerFragment.setArguments(bundle);
//
//                fragmentTransaction.replace(R.id.fragmentTwoId,recyclerFragment);
//                fragmentTransaction.commit();

                sharedViewModel = ViewModelProviders.of(getActivity()).get(SharedViewModel.class);
                sharedViewModel.init();
                sharedViewModel.sendMessage(sharedViewModel.getMessage().getValue());


            }
        });

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);





    }
}