package com.example.carlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class RegistrationFragment extends Fragment {
    EditText username,password,confirm,firstname,lastname;
    Button Register;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view2 =inflater.inflate(R.layout.registration_fragment,container,false);

        username =view2.findViewById(R.id.username);
        password=view2.findViewById(R.id.password);
        confirm=view2.findViewById(R.id.confirmpass);
        firstname=view2.findViewById(R.id.firstname);
        lastname=view2.findViewById(R.id.lastname);
        Register=view2.findViewById(R.id.register);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "registration successful", Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(getActivity(),MainActivity.class);
                startActivity(intent);
            }
        });

        return view2;
    }
}
