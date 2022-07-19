package com.example.carlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
    
import java.util.ArrayList;

public class HomePage extends AppCompatActivity {
    JSONArray Mainarray;
    Button textView;
    ArrayList<String> brand =new ArrayList<>();
    ArrayList<String> fuel =new ArrayList<>();
    ArrayList<String> color =new ArrayList<>();
    ListView brandList,Fuelist,colorlsit;
    LinearLayout LinearBrand,LinearFuel,LinearColor;
    TextView brandS,FuelS,colorS;
    ImageView branddrop,fueldrop,colordrop;
    BrandAdapter badapter;
    FuelAdapter fadapter;
    ColorAdapter cadapter;
    String BrandSelected,ColorSelected,FuelSelected;
    Button filtered,DsplayAllcars;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        brandList=findViewById(R.id.brandlist);
        Fuelist=findViewById(R.id.Fuellist);
        colorlsit=findViewById(R.id.Colorlist);
        LinearBrand=findViewById(R.id.linearBrand);
        LinearColor=findViewById(R.id.linearcolor);
        LinearFuel=findViewById(R.id.linearFuel);
        brandS=findViewById(R.id.brandnameSelected);
        FuelS=findViewById(R.id.fueltypeSelected);
        colorS=findViewById(R.id.colorSelected);
        branddrop=findViewById(R.id.branddropDown);
        fueldrop=findViewById(R.id.FueltypeDrop);
        colordrop=findViewById(R.id.colordrop);
        filtered=findViewById(R.id.btn_filtered);
        DsplayAllcars=findViewById(R.id.allcars);
        brand.add("Audi");
        brand.add("Toyoto");
        brand.add("Kia");
        brand.add("Honda");
        brand.add("Hyundai");
        fuel.add("petrol");
        fuel.add("diesel");
        color.add("blue");
        color.add("black");
        color.add("red");

        badapter =new BrandAdapter(HomePage.this,brand);
        brandList.setAdapter(badapter);
        fadapter =new FuelAdapter(HomePage.this,fuel);
        Fuelist.setAdapter(fadapter);
        cadapter =new ColorAdapter(HomePage.this,color);
        colorlsit.setAdapter(cadapter);

        Mainarray= new JSONArray();
        try {
            JSONObject object1 =new JSONObject();
            object1.put("brandname","Audi");
            object1.put("color","blue");
            object1.put("fuel","petrol");
            object1.put("image",R.drawable.audibl1);
            Mainarray.put(object1);

            JSONObject object2 =new JSONObject();
            object2.put("brandname","Audi");
            object2.put("color","blue");
            object2.put("fuel","diesel");
            object2.put("image",R.drawable.audibl2);
            Mainarray.put(object2);

            JSONObject object3 =new JSONObject();
            object3.put("brandname","Audi");
            object3.put("color","red");
            object3.put("fuel","diesel");
            object3.put("image",R.drawable.audir1);
            Mainarray.put(object3);
            JSONObject object4 =new JSONObject();
            object4.put("brandname","Audi");
            object4.put("color","red");
            object4.put("fuel","diesel");
            object4.put("image",R.drawable.audir2);
            Mainarray.put(object4);
            JSONObject object5 =new JSONObject();
            object5.put("brandname","Audi");
            object5.put("color","black");
            object5.put("fuel","diesel");
            object5.put("image",R.drawable.audib1);
            Mainarray.put(object5);
            JSONObject object6 =new JSONObject();
            object6.put("brandname","Audi");
            object6.put("color","black");
            object6.put("fuel","petrol");
            object6.put("image",R.drawable.audib2);
            Mainarray.put(object6);
            JSONObject object7 =new JSONObject();
            object7.put("brandname","Toyoto");
            object7.put("color","blue");
            object7.put("fuel","diesel");
            object7.put("image",R.drawable.toyotobl1);
            Mainarray.put(object7);
            JSONObject object8 =new JSONObject();
            object8.put("brandname","Toyoto");
            object8.put("color","blue");
            object8.put("fuel","petrol");
            object8.put("image",R.drawable.toyotobl2);
            Mainarray.put(object8);
            JSONObject object9 =new JSONObject();
            object9.put("brandname","Toyoto");
            object9.put("color","black");
            object9.put("fuel","diesel");
            object9.put("image",R.drawable.toyotob1);
            Mainarray.put(object9);
            JSONObject object10 =new JSONObject();
            object10.put("brandname","Toyoto");
            object10.put("color","black");
            object10.put("fuel","diesel");
            object10.put("image",R.drawable.toyotob2);
            Mainarray.put(object10);
            JSONObject object11 =new JSONObject();
            object11.put("brandname","Toyoto");
            object11.put("color","red");
            object11.put("fuel","diesel");
            object11.put("image",R.drawable.toyotor1);
            Mainarray.put(object11);
            JSONObject object12 =new JSONObject();
            object12.put("brandname","Toyoto");
            object12.put("color","red");
            object12.put("fuel","petrol");
            object12.put("image",R.drawable.toyotor2);
            Mainarray.put(object12);
            JSONObject object13 =new JSONObject();
            object13.put("brandname","Honda");
            object13.put("color","blue");
            object13.put("fuel","diesel");
            object13.put("image",R.drawable.hondabl1);
            Mainarray.put(object13);
            JSONObject object14 =new JSONObject();
            object14.put("brandname","Honda");
            object14.put("color","blue");
            object14.put("fuel","diesel");
            object14.put("image",R.drawable.hondabl2);
            Mainarray.put(object14);
            JSONObject object15 =new JSONObject();
            object15.put("brandname","Honda");
            object15.put("color","black");
            object15.put("fuel","diesel");
            object15.put("image",R.drawable.hondab1);
            Mainarray.put(object15);
            JSONObject object16 =new JSONObject();
            object16.put("brandname","Honda");
            object16.put("color","black");
            object16.put("fuel","petrol");
            object16.put("image",R.drawable.hondab2);
            Mainarray.put(object16);
            JSONObject object17 =new JSONObject();
            object17.put("brandname","Honda");
            object17.put("color","red");
            object17.put("fuel","diesel");
            object17.put("image",R.drawable.hondar1);
            Mainarray.put(object17);
            JSONObject object18 =new JSONObject();
            object18.put("brandname","Honda");
            object18.put("color","red");
            object18.put("fuel","diesel");
            object18.put("image",R.drawable.hondar2);
            Mainarray.put(object18);
            JSONObject object19 =new JSONObject();
            object19.put("brandname","Kia");
            object19.put("color","blue");
            object19.put("fuel","diesel");
            object19.put("image",R.drawable.kiabl1);
            Mainarray.put(object19);
            JSONObject object20 =new JSONObject();
            object20.put("brandname","Kia");
            object20.put("color","blue");
            object20.put("fuel","petrol");
            object20.put("image",R.drawable.kiabl2);
            Mainarray.put(object20);
            JSONObject object21 =new JSONObject();
            object21.put("brandname","Kia");
            object21.put("color","red");
            object21.put("fuel","diesel");
            object21.put("image",R.drawable.kiar1);
            Mainarray.put(object21);


            JSONObject object22 =new JSONObject();
            object22.put("brandname","Kia");
            object22.put("color","red");
            object22.put("fuel","diesel");
            object22.put("image",R.drawable.kiar2);
            Mainarray.put(object22);

            JSONObject object23 =new JSONObject();
            object23.put("brandname","Kia");
            object23.put("color","black");
            object23.put("fuel","petrol");
            object23.put("image",R.drawable.kiab1);
            Mainarray.put(object23);

            JSONObject object24 =new JSONObject();
            object24.put("brandname","Kia");
            object24.put("color","black");
            object24.put("fuel","diesel");
            object24.put("image",R.drawable.kiab2);
            Mainarray.put(object24);

            JSONObject object25 =new JSONObject();
            object25.put("brandname","Hyundai");
            object25.put("color","blue");
            object25.put("fuel","diesel");
            object25.put("image",R.drawable.hyundaibl1);
            Mainarray.put(object25);

            JSONObject object26 =new JSONObject();
            object26.put("brandname","Hyundai");
            object26.put("color","blue");
            object26.put("fuel","petrol");
            object26.put("image",R.drawable.hyundaibl2);
            Mainarray.put(object26);

            JSONObject object27 =new JSONObject();
            object27.put("brandname","Hyundai");
            object27.put("color","black");
            object27.put("fuel","diesel");
            object27.put("image",R.drawable.hyundaib1);
            Mainarray.put(object27);

            JSONObject object28 =new JSONObject();
            object28.put("brandname","Hyundai");
            object28.put("color","black");
            object28.put("fuel","diesel");
            object28.put("image",R.drawable.hyundaib2);
            Mainarray.put(object28);

            JSONObject object29 =new JSONObject();
            object29.put("brandname","Hyundai");
            object29.put("color","red");
            object29.put("fuel","petrol");
            object29.put("image",R.drawable.hyundair1);
            Mainarray.put(object29);

            JSONObject object30 =new JSONObject();
            object30.put("brandname","Hyundai");
            object30.put("color","red");
            object30.put("fuel","red");
            object30.put("image",R.drawable.hyundair2);
            Mainarray.put(object30);

            SharedPreferences sharedPreferences=getSharedPreferences("Carslist",MODE_PRIVATE);
            SharedPreferences.Editor editor=sharedPreferences.edit();
            editor.putString("array",Mainarray.toString());
            editor.apply();
            Log.e("array",Mainarray.toString());

           // Mainarray.put(object1);
        } catch (JSONException e) {
            e.printStackTrace();
        }


        textView=findViewById(R.id.textview);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),service.class);
                startActivity(intent);
            }

        });
        fueldrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (String.valueOf(LinearFuel.getVisibility()).matches("8")){
                    LinearFuel.setVisibility(View.VISIBLE);
                }else {
                    LinearFuel.setVisibility(View.GONE);
                }

               // Toast.makeText(getApplicationContext(), String.valueOf(LinearFuel.getVisibility()), Toast.LENGTH_SHORT).show();
            }
        });
        branddrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (String.valueOf(LinearBrand.getVisibility()).matches("8")){
                    LinearBrand.setVisibility(View.VISIBLE);
                }else {
                    LinearBrand.setVisibility(View.GONE);
                }
               // Toast.makeText(getApplicationContext(), String.valueOf(LinearBrand.getVisibility()), Toast.LENGTH_SHORT).show();
            }
        });
        colordrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (String.valueOf(LinearColor.getVisibility()).matches("8")){
                    LinearColor.setVisibility(View.VISIBLE);
                }else {
                    LinearColor.setVisibility(View.GONE);
                }
              //  Toast.makeText(getApplicationContext(), String.valueOf(LinearColor.getVisibility()), Toast.LENGTH_SHORT).show();
            }
        });

        brandList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              String position = adapterView.getItemAtPosition(i).toString();
                Log.e("position",String.valueOf(position));
              brandS.setText(position);
              LinearBrand.setVisibility(View.GONE);

            }
        });
        colorlsit.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String position = adapterView.getItemAtPosition(i).toString();
                Log.e("position",String.valueOf(position));
                colorS.setText(position);
                LinearColor.setVisibility(View.GONE);

            }
        });
        Fuelist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String position = adapterView.getItemAtPosition(i).toString();
                Log.e("position",String.valueOf(position));
                FuelS.setText(position);
                LinearFuel.setVisibility(View.GONE);

            }
        });
        filtered.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // BrandSelected,ColorSelected,FuelSelected;
                BrandSelected=brandS.getText().toString();
                ColorSelected=colorS.getText().toString();
                FuelSelected=FuelS.getText().toString();
                if (BrandSelected.isEmpty()||ColorSelected.isEmpty()||FuelSelected.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please Select all Filters to proceed.", Toast.LENGTH_SHORT).show();
                }else {
                    SharedPreferences sharedPreferences=getSharedPreferences("filteredList",MODE_PRIVATE);
                    SharedPreferences.Editor editor=sharedPreferences.edit();
                    editor.putString("brand",BrandSelected);
                    editor.putString("color",ColorSelected);
                    editor.putString("fuel",FuelSelected);
                    editor.apply();
                    Intent intent=new Intent(getApplicationContext(),CarList.class);
                    startActivity(intent);
                }
            }
        });
        DsplayAllcars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences=getSharedPreferences("filteredList",MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.clear();
                editor.apply();
                Intent intent=new Intent(getApplicationContext(),CarList.class);
                startActivity(intent);
            }
        });




    }
    public class BrandAdapter extends BaseAdapter{
        Context context;
        ArrayList<String> Brand;
        TextView textView;

        public BrandAdapter(Context context, ArrayList<String> brand) {
            this.context = context;
            Brand = brand;
        }

        @Override
        public int getCount() {
            return Brand.size();
        }

        @Override
        public Object getItem(int i) {
            return Brand.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view =LayoutInflater.from(context).inflate(R.layout.list_item,viewGroup,false);
            textView=view.findViewById(R.id.textview);

                textView.setText(Brand.get(i));




            return view;
        }
    }
    public class FuelAdapter extends BaseAdapter{
        Context context;
        ArrayList<String> Brand;
        TextView textView;

        public FuelAdapter(Context context, ArrayList<String> brand) {
            this.context = context;
            Brand = brand;
        }

        @Override
        public int getCount() {
            return Brand.size();
        }

        @Override
        public Object getItem(int i) {
            return Brand.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view =LayoutInflater.from(context).inflate(R.layout.list_item,viewGroup,false);
            textView=view.findViewById(R.id.textview);

            textView.setText(Brand.get(i));



            return view;
        }
    }
    public class ColorAdapter extends BaseAdapter{
        Context context;
        ArrayList<String> Brand;
        TextView textView;

        public ColorAdapter(Context context, ArrayList<String> brand) {
            this.context = context;
            Brand = brand;
        }

        @Override
        public int getCount() {
            return Brand.size();
        }

        @Override
        public Object getItem(int i) {
            return Brand.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view =LayoutInflater.from(context).inflate(R.layout.list_item,viewGroup,false);
            textView=view.findViewById(R.id.textview);
                textView.setText(Brand.get(i));

            return view;
        }
    }
}
