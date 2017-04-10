package com.example.alcantara94106.collegeapp2;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by pikir on 4/9/2017.
 */

public class DatePickerFragment extends DialogFragment {
    @Override
    onCreateDialog(Bundle bundle){
        View v = LayoutInflater.from(getActivity())
                .inflate(R.layout.dialog_date_of_birth, null);
        return new AlertDialog.Builder(getActivity())
                .setView(v)
                .setTitle("Date of Birth")
                .setPositiveButton("Done", null)
                .create();
    }
}
