package ru.mirea.lavrukhin.dialog2;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

public class MyProgressDialogFragment extends DialogFragment {
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        ProgressDialog pd = new ProgressDialog(getActivity());
        pd.setMessage("loading");

        return pd;
    }
}
