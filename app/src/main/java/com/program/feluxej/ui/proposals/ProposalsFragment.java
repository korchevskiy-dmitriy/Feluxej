package com.program.feluxej.ui.proposals;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.program.feluxej.databinding.FragmentProposalsBinding;

public class ProposalsFragment extends Fragment {

    private FragmentProposalsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ProposalsViewModel proposalsViewModel =
                new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(ProposalsViewModel.class);

        binding = FragmentProposalsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textProposals;
        proposalsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}