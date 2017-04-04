package com.example.alcantara94106.collegeapp2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


/**
 * Created by alcantara94106 on 3/2/2017.
 */

public class ProfileFragment extends android.support.v4.app.Fragment {
    private TextView mFirstName;
    private EditText mEditFirstName;
    private TextView mLastName;
    private EditText mEditLastName;


    public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle bundle){
        super.onCreateView(inflater, group, bundle);
        View rootView = inflater.inflate(R.layout.fragment_profile, group, false);

        mFirstName = (TextView)rootView.findViewById(R.id.profileFirstNameView);
        mLastName = (TextView)rootView.findViewById(R.id.profileLastNameView);

        mEditFirstName = (EditText)rootView.findViewById(R.id.profileEditFirstNameView);
        mEditLastName = (EditText)rootView.findViewById(R.id.profileEditLastNameView);

        mFirstName.setText("Bob");
        mLastName.setText("Genericname");

        return rootView;
    }


}
