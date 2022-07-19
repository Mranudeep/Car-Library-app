package com.example.carlibrary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarsListAdapter extends RecyclerView.Adapter<CarsListAdapter.viewholder> {
    ArrayList<CarslistObject> carslistObjects;
    Context context;

    public CarsListAdapter(ArrayList<CarslistObject> carslistObjects, Context context) {
        this.carslistObjects = carslistObjects;
        this.context = context;
    }

    @NonNull
    @Override
    public CarsListAdapter.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recycler_view_item,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarsListAdapter.viewholder holder, int position) {

       CarslistObject object=carslistObjects.get(position);
       if (carslistObjects.size()==0){
           holder.nocars.setVisibility(View.VISIBLE);
       }else {
           holder.fuel.setText(object.getFueltype());
           holder.image.setImageResource(object.getCarimage());
           holder.brand.setText(object.getCarbrand());
       }


    }

    @Override
    public int getItemCount() {
        return carslistObjects.size();
    }

    public class viewholder extends RecyclerView.ViewHolder{
         ImageView image;
         TextView brand,fuel,nocars;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.carimage);
            brand=itemView.findViewById(R.id.brand);
            fuel=itemView.findViewById(R.id.fuel);
            nocars=itemView.findViewById(R.id.nocars);
        }
    }
}
