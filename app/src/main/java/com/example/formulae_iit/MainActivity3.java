package com.example.formulae_iit;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    ListView list;
    ArrayList<String> arrnames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setTitle("   Math    ");

        // changing title bar color
        ActionBar actionBar;
        actionBar = getSupportActionBar();


        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#5B389A"));
        actionBar.setBackgroundDrawable(colorDrawable);
        //


        list = findViewById(R.id.math);
        arrnames.add("photon and electron");
        arrnames.add("topic2");
        arrnames.add("topic3");
        arrnames.add("topic4");
        arrnames.add("topic5");
        arrnames.add("topic6");
        arrnames.add("topic7");
        arrnames.add("topic8");
        arrnames.add("topic9");
        arrnames.add("topic10");
        arrnames.add("topic11");
        arrnames.add("topic12");
        arrnames.add("topic13");
        arrnames.add("topic13");
        arrnames.add("topic13");
        arrnames.add("topic13");arrnames.add("topic13");
        arrnames.add("topic13");
        arrnames.add("topic13");
        arrnames.add("topic13");
        arrnames.add("topic13");
        arrnames.add("topic13");
        arrnames.add("topic13");




        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrnames);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){

                     String str ="https://firebasestorage.googleapis.com/v0/b/trail2-ff40f.appspot.com/o/chemistry%2Fphotons%20and%20electrons.jpg?alt=media&token=045fe3d8-44e3-4a45-b7c6-653c929addac";//Retrieved url as mentioned above
                     openImageActivity(str);

                }
                if(position == 1){

                    String str ="https://firebasestorage.googleapis.com/v0/b/trail2-ff40f.appspot.com/o/chemistry%2Fphotons%20and%20electrons.jpg?alt=media&token=045fe3d8-44e3-4a45-b7c6-653c929addac";//Retrieved url as mentioned above
                    openImageActivity(str);

                }
                if(position == 2){

                    String str ="https://firebasestorage.googleapis.com/v0/b/trail2-ff40f.appspot.com/o/chemistry%2Fphotons%20and%20electrons.jpg?alt=media&token=045fe3d8-44e3-4a45-b7c6-653c929addac";//Retrieved url as mentioned above
                    openImageActivity(str);

                }
                if(position == 3){

                    String str ="https://firebasestorage.googleapis.com/v0/b/trail2-ff40f.appspot.com/o/chemistry%2Fphotons%20and%20electrons.jpg?alt=media&token=045fe3d8-44e3-4a45-b7c6-653c929addac";//Retrieved url as mentioned above
                    openImageActivity(str);

                } if(position == 4){

                    String str ="https://firebasestorage.googleapis.com/v0/b/trail2-ff40f.appspot.com/o/chemistry%2Fphotons%20and%20electrons.jpg?alt=media&token=045fe3d8-44e3-4a45-b7c6-653c929addac";//Retrieved url as mentioned above
                    openImageActivity(str);

                }
                if(position == 5){

                    String str ="https://firebasestorage.googleapis.com/v0/b/trail2-ff40f.appspot.com/o/chemistry%2Fphotons%20and%20electrons.jpg?alt=media&token=045fe3d8-44e3-4a45-b7c6-653c929addac";//Retrieved url as mentioned above
                    openImageActivity(str);

                } if(position == 6){

                    String str ="https://firebasestorage.googleapis.com/v0/b/trail2-ff40f.appspot.com/o/chemistry%2Fphotons%20and%20electrons.jpg?alt=media&token=045fe3d8-44e3-4a45-b7c6-653c929addac";//Retrieved url as mentioned above
                    openImageActivity(str);

                }



            }
        });
    }
    private void openImageActivity(String  imageResId) {
        Intent intent = new Intent(MainActivity3.this, phy1.class);
        intent.putExtra("imageResId", imageResId);
        startActivity(intent);
    }
}