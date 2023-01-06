package com.program.feluxej.ui.proposals;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProposalsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ProposalsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is proposals fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}