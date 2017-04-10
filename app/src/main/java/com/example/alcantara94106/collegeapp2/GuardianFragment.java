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

public class GuardianFragment extends android.support.v4.app.Fragment {
    private TextView mFirstName;
    private EditText mEditFirstName;
    private TextView mLastName;
    private EditText mEditLastName;
    private Button mSubmitButton;
    private String occupation;

    //private FamilyMember daddy; //#9, probably incorrect
    //daddy.setFirstName("Bob");

    public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle bundle){
        super.onCreateView(inflater, group, bundle);
        View rootView = inflater.inflate(R.layout.fragment_guardian, group, false);

        mSubmitButton = (Button) rootView.findViewById(R.id.guardianSubmitButton);
        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFirstName.setText(mEditFirstName.getText());
                mLastName.setText(mEditLastName.getText());
            }
        });

        mFirstName = (TextView)rootView.findViewById(R.id.guardianFirstNameView);
        mLastName = (TextView)rootView.findViewById(R.id.guardianLastNameView);

        mEditFirstName = (EditText)rootView.findViewById(R.id.guardianEditFirstNameView);
        mEditLastName = (EditText)rootView.findViewById(R.id.guardianEditLastNameView);

        mFirstName.setText("Mommy");
        mLastName.setText("Cena");

        return rootView;
    }

}
