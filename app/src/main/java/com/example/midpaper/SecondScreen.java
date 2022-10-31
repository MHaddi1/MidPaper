package com.example.midpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class SecondScreen extends AppCompatActivity {
ImageView img;
int image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        img = findViewById(R.id.image);
        getData();
        setData();

    }
    private void getData(){
        if(getIntent().hasExtra("image")){

            image = getIntent().getIntExtra("image",1);


        }
        else {
            Toast.makeText(this, "No Data", Toast.LENGTH_SHORT).show();
        }
    }
    private void setData (){
        img.setImageResource(image);

    }
}