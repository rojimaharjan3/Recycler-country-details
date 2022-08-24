package com.example.recyclercountrydetails;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CountriesDetailAdapter extends RecyclerView.Adapter<CountriesDetailAdapter.ViewHolder> {

    Context context;
    ArrayList<Model> contentList = new ArrayList<>();

    CountriesDetailAdapter(Context context , ArrayList<Model> contents){
        this.context = context;
        contentList = contents;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_adapter, parent ,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.t1.setText(contentList.get(position).getName());
        holder.t2.setText(contentList.get(position).getCode());
        holder.img.setImageResource(contentList.get(position).getImage());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DescriptionActivity.class);

                //pass data to the description activity
                intent.putExtra("Country Name",contentList.get(position).getName()); //string name ("Header") deko kina bhaney uta descriptionactivity maa yei string key name use garna parxa
                intent.putExtra("Image",contentList.get(position).getImage());
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return contentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView t1 , t2;
        ImageView img;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            t1=itemView.findViewById(R.id.country_name);
            t2=itemView.findViewById(R.id.country_code);//get reference of layout adapter.xml
            img=itemView.findViewById(R.id.flag_image);
            cardView = itemView.findViewById(R.id.card_view);

        }
    }
}


