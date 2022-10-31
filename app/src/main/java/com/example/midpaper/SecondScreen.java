package com.example.midpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondScreen extends AppCompatActivity {
ImageView img;
    ImageView Star;
TextView title,Des,Arthur,countStar;
String Title,des,rating,arthur;
int image,star;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        img = findViewById(R.id.image);
        title = findViewById(R.id.title);
        countStar = findViewById(R.id.ratingcount);
        Star = findViewById(R.id.rating);
        Des = findViewById(R.id.description);
        Arthur = findViewById(R.id.arthur);
        getData();
        setData();

    }
    private void getData(){
        if(getIntent().hasExtra("image")&&getIntent().hasExtra("title")&&getIntent().hasExtra("rating")&&getIntent().hasExtra("Arthur")&&getIntent().hasExtra("star")&&getIntent().hasExtra("description")){

            image = getIntent().getIntExtra("image",1);
            Title = getIntent().getStringExtra("title");
            des = getIntent().getStringExtra("description");
            star = getIntent().getIntExtra("star",1);
            arthur = getIntent().getStringExtra("Arthur");
            rating = getIntent().getStringExtra("rating");



        }
        else {
            Toast.makeText(this, "No Data", Toast.LENGTH_SHORT).show();
        }
    }
    private void setData (){
        img.setImageResource(image);
        title.setText(Title);
        Arthur.setText(arthur);
        Des.setText(des);
        Star.setImageResource(star);
        countStar.setText(rating);

    }
}