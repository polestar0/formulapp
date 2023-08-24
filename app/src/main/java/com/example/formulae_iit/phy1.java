package com.example.formulae_iit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class phy1 extends AppCompatActivity {
    ImageView IMG1;
   // ImageView IMG2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phy1);

        IMG1 = findViewById(R.id.imageView1);
        button = findViewById(R.id.button2);


    //    IMG2 = findViewById(R.id.imageView2);


        // we will get the default FirebaseDatabase instance
       // String url="https://firebasestorage.googleapis.com/v0/b/trail2-ff40f.appspot.com/o/chemistry%2Fphotons%20and%20electrons.jpg?alt=media&token=045fe3d8-44e3-4a45-b7c6-653c929addac";//Retrieved url as mentioned above
        String  url = getIntent().getStringExtra("imageResId");

        Glide.with(getApplicationContext()).load(url).into(IMG1);
       // Glide.with(getApplicationContext()).load(url).into(IMG2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform actions when the button is clicked
                Intent intent = new Intent(phy1.this, ScrollingActivityquestion.class);
                startActivity(intent);
            }
        });

    }
}