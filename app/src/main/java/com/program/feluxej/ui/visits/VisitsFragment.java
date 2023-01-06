package com.program.feluxej.ui.visits;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.program.feluxej.databinding.FragmentVisitsBinding;

public class VisitsFragment extends Fragment {

    private FragmentVisitsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        VisitsViewModel visitsViewModel =
                new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(VisitsViewModel.class);

        binding = FragmentVisitsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        final TextView textView = binding.textVists;
//        visitsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}