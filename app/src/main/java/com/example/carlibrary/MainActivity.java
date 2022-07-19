package com.example.carlibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button signin, register;
    Fragment fragment1;
    Fragment fragment2;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fragment1 =new signinFragment();
        fragment2 =new RegistrationFragment();
        signin=findViewById(R.id.signinView);
        register=findViewById(R.id.RegistrationView);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.viewpager, fragment1);
        fragmentTransaction.commit();

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              FragmentManager fm = getSupportFragmentManager();
               FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.viewpager, fragment1);
                fragmentTransaction.commit();
            }

        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.viewpager, fragment2);
                fragmentTransaction.commit();


            }


        });


    }
}