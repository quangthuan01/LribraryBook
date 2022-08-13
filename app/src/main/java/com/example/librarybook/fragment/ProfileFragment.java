package com.example.librarybook.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.librarybook.R;

public class ProfileFragment extends Fragment {

    private Context context;

    @Override
    public void onAttach(@NonNull Context _context) {
        super.onAttach(_context);
        this.context = _context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.fragment_profile,container,false);


        return view;
    }
}