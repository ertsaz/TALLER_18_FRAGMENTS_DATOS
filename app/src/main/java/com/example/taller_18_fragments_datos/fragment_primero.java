package com.example.taller_18_fragments_datos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class fragment_primero extends Fragment {
    private EditText et1;
    private Button bt1, bt2;
    private TextView tv1;

    public fragment_primero() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_primero, container, false);
        et1 =view.findViewById(R.id.et1);
        bt1 =view.findViewById(R.id.btn1);
        bt2 =view.findViewById(R.id.btn2);

        bt1.setOnClickListener(v -> {
            tv1 = getActivity().findViewById(R.id.tv1);
            tv1.setText(et1.getText().toString());
        });

        bt2.setOnClickListener(v -> tv1.setText(""));

        return view;
    }
}