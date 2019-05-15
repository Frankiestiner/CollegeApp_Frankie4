package com.fwhite.collegeapp_frankie;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


    public class SiblingFragment extends Fragment {
        private EditText firstEdit, lastEdit, occupationEdit;
        private TextView occupationText;
        private Button mSubmitButton;
        private Guardian mGuardian;


        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_guardian, container, false);

            Sibling mSibling = new Sibling("Isaiah", "White");

            occupationText = (TextView) rootView.findViewById(R.id.occupationText);
            firstEdit = (EditText) rootView.findViewById(R.id.firstEdit);
            lastEdit = (EditText) rootView.findViewById(R.id.lastEdit);
            occupationEdit = (EditText) rootView.findViewById(R.id.occupationEdit);
            mSubmitButton = (Button) rootView.findViewById(R.id.submitButton);
            return rootView;
        }
    }
