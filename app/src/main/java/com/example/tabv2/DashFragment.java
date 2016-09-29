package com.example.tabv2;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DashFragment extends Fragment {

    TextView fragViewRPM;
    EditText tkt;
    public DashFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v;
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_dash, container, false);

        //print RPM
        fragViewRPM = (TextView)v.findViewById(R.id.viewRPM);
        tkt = (EditText)getActivity().findViewById(R.id.setRPM);
        String msg = tkt.getText().toString();
        fragViewRPM.setText(msg);

        return v;
    }

}
