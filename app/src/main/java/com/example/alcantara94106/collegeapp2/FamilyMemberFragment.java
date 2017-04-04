package com.example.alcantara94106.collegeapp2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * Created by alcantara94106 on 3/2/2017.
 */

public class FamilyMemberFragment extends android.support.v4.app.Fragment {
    private TextView mFirstName;
    private EditText mEditFirstName;
    private TextView mLastName;
    private EditText mEditLastName;
    private Button mSubmitButton;

    private FamilyMember daddy; //#9, probably incorrect
    //daddy.setFirstName("Bob");




    public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle bundle){
        super.onCreateView(inflater, group, bundle);
        View rootView = inflater.inflate(R.layout.fragment_family_member, group, false);

        mSubmitButton = (Button) rootView.findViewById(R.id.familyMemberSubmitButton);
        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFirstName.setText(mEditFirstName.getText());
                mLastName.setText(mEditLastName.getText());
            }
        });

        mFirstName = (TextView)rootView.findViewById(R.id.familyMemberFirstNameView);
        mLastName = (TextView)rootView.findViewById(R.id.familyMemberLastNameView);

        mEditFirstName = (EditText)rootView.findViewById(R.id.familyMemberEditFirstNameView);
        mEditLastName = (EditText)rootView.findViewById(R.id.familyMemberEditLastNameView);

        mFirstName.setText("John");
        mLastName.setText("Cena");

        return rootView;
    }

}
