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

public class signinFragment extends Fragment {

    EditText username,password;
    Button signin;



    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
     //  return super.onCreateView(inflater, container, savedInstanceState);

        View view =inflater.inflate(R.layout.signin_fragment,container,false);
        username =view.findViewById(R.id.username);
        password=view.findViewById(R.id.password);
        signin=view.findViewById(R.id.signinbutton);


      signin.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view1){
              Toast.makeText(getActivity(), "signin successful", Toast.LENGTH_SHORT).show();
              Intent intent =new Intent(getActivity(),HomePage.class);
              startActivity(intent);
          }
      });






        return view;
    }
}
