package com.example.carlibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class CarList extends AppCompatActivity {
    RecyclerView recyclerView;
    CarsListAdapter adapter;
    String brandSelected,colorSelected,fuelSelected;
    JSONArray MainArray;
    ArrayList<CarslistObject> carslistObjects;
      TextView nocars;
      ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_list);
        recyclerView=findViewById(R.id.recyclerView);
        nocars=findViewById(R.id.nocars);
        back=findViewById(R.id.backicon);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        carslistObjects=new ArrayList<>();
        SharedPreferences sharedPreferences1=getSharedPreferences("Carslist",MODE_PRIVATE);
        String array=sharedPreferences1.getString("array","");
        try {
            MainArray =new JSONArray(array);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        SharedPreferences sharedPreferences=getSharedPreferences("filteredList",MODE_PRIVATE);
        brandSelected=sharedPreferences.getString("brand","");
        colorSelected=sharedPreferences.getString("color","");
        fuelSelected=sharedPreferences.getString("fuel","");
        if (sharedPreferences.contains("brand")&&sharedPreferences.contains("fuel")&&sharedPreferences.contains("color")){
            for (int i=0;i<MainArray.length();i++){
                try {
                    JSONObject object =MainArray.getJSONObject(i);
                    if (object.getString("brandname").matches(brandSelected)&&object.getString("fuel").matches(fuelSelected)&&object.getString("color").matches(colorSelected)) {
                        CarslistObject object1=new CarslistObject(object.getString("brandname"),object.getString("fuel"),object.getString("color"),object.getInt("image"));
                        carslistObjects.add(object1);

                    }else {
                      //  Toast.makeText(getApplicationContext(), "No cars Found", Toast.LENGTH_SHORT).show();
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }else {
            for (int i=0;i<MainArray.length();i++){
                try {
                    JSONObject object =MainArray.getJSONObject(i);
                    CarslistObject object1=new CarslistObject(object.getString("brandname"),object.getString("fuel"),object.getString("color"),object.getInt("image"));
                    carslistObjects.add(object1);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            }
        if (carslistObjects.size()==0){
            nocars.setVisibility(View.VISIBLE);
            recyclerView.setVisibility(View.GONE);
        }else {
            recyclerView.setLayoutManager(linearLayoutManager);
            adapter=new CarsListAdapter(carslistObjects,this);
            recyclerView.setAdapter(adapter);
        }

        }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
