package com.example.recyclercountrydetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DescriptionActivity extends AppCompatActivity {

    TextView countryname;
    ImageView flagimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        countryname=findViewById(R.id.display_country);
        flagimage=findViewById(R.id.flag_image);

        Intent i = getIntent();
        String country = i.getExtras().getString("Country Name");
        int image = i.getExtras().getInt("Image");

        countryname.setText(country);
        flagimage.setImageResource(image);

    }
}