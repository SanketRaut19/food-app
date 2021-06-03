package com.example.foodapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Signup_tab extends Fragment {

    EditText email, password, con_password, mob_no;
    Button button;
    float v;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.signup_tab, container, false);

        email = root.findViewById(R.id.signup_email);
        password = root.findViewById(R.id.signup_password);
        con_password = root.findViewById(R.id.signup_con_password);
        mob_no = root.findViewById(R.id.signup_number);
        button = root.findViewById(R.id.signup_button);

        email.setTranslationY(800);
        password.setTranslationY(800);
        con_password.setTranslationY(800);
        mob_no.setTranslationY(800);
        button.setTranslationY(800);

        email.setAlpha(v);
        password.setAlpha(v);
        con_password.setAlpha(v);
        mob_no.setAlpha(v);
        button.setAlpha(v);

        email.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(300).start();
        password.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
        con_password.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
        mob_no.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(700).start();
        button.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(900).start();

        return root;
    }
}
