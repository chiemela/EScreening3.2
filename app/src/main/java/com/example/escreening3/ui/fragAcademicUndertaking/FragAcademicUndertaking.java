package com.example.escreening3.ui.fragAcademicUndertaking;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.escreening3.R;

public class FragAcademicUndertaking extends Fragment{
    private FragAcademicUndertakingViewModel fragAcademicUndertakingViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        fragAcademicUndertakingViewModel =
                ViewModelProviders.of(this).get(FragAcademicUndertakingViewModel.class);
        View root = inflater.inflate(R.layout.fragment_academic_undertaking, container, false);
        final TextView textView = root.findViewById(R.id.text_fragOne);
        fragAcademicUndertakingViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
