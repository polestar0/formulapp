package com.example.formulae_iit;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ListView list;
    ArrayList<String> arrnames = new ArrayList<>();

   ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("     PHYSICS    ");
        ActionBar actionBar;
        actionBar = getSupportActionBar();


        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#0C79AA"));
        actionBar.setBackgroundDrawable(colorDrawable);


        list = findViewById(R.id.listview);
        arrnames.add("kinematics equations");
        arrnames.add("Power Formula");
        arrnames.add("Celsius Formula");
        arrnames.add("Velocity");
        arrnames.add("Acceleration");
        arrnames.add("Newton's law");
        arrnames.add("Momentum");
        arrnames.add("Reynolds number formula");
        arrnames.add("Kinetic Energy Formula");
        arrnames.add("Mass Formula");
        arrnames.add("Impulsive Force ");
        arrnames.add("Gravitational potential enegery");
        arrnames.add("Elastic Potential Energy");
        arrnames.add("Weight");
        arrnames.add("Projectile Motion Formula");
        arrnames.add("Work Done");
        arrnames.add("Torque Formula");
        arrnames.add("Wave Formula");






        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrnames);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){

                    String str ="https://firebasestorage.googleapis.com/v0/b/trail2-ff40f.appspot.com/o/chemistry%2Fkinematics%20equations.jpg?alt=media&token=6bc633af-11a2-46af-a63c-2ae3c8fbf590";//Retrieved url as mentioned above
                    openImageActivity(str);

                }
                if(position == 1){

                    String str ="https://firebasestorage.googleapis.com/v0/b/trail2-ff40f.appspot.com/o/chemistry%2Fpower%20formula.jpg?alt=media&token=c068cf7a-6eb4-4c39-acd7-fe72b4978447";//Retrieved url as mentioned above
                    openImageActivity(str);

                }
                if(position == 2){
                   String str = "https://firebasestorage.googleapis.com/v0/b/trail2-ff40f.appspot.com/o/chemistry%2Fcelsius%20formula.jpg?alt=media&token=25303362-f61e-4eac-b57f-69d31e06d460";
                    openImageActivity(str);

                }
                if(position == 3){
                    String str = "https://firebasestorage.googleapis.com/v0/b/trail2-ff40f.appspot.com/o/chemistry%2Fvelocity.jpg?alt=media&token=c191382e-7219-438e-a941-0c5bc97e8f51";
                    openImageActivity(str);

                } if(position == 4){
                    String str = "https://firebasestorage.googleapis.com/v0/b/trail2-ff40f.appspot.com/o/chemistry%2Facceleration.jpg?alt=media&token=10038e3a-3b7b-4c3c-a397-ce0e7a8b2158";
                    openImageActivity(str);

                }
                if(position == 5){
                    String str = "https://firebasestorage.googleapis.com/v0/b/trail2-ff40f.appspot.com/o/chemistry%2FNewton%20law.jpg?alt=media&token=566f1113-00b2-4b2f-b375-eac0132cec43";
                     openImageActivity(str);

                } if(position == 6){
                    String str = "https://firebasestorage.googleapis.com/v0/b/trail2-ff40f.appspot.com/o/chemistry%2Fmomentum.jpg?alt=media&token=263b55c0-a28d-4c89-a403-0304284af043";
                    openImageActivity(str);

                }
                if(position == 7){
                    String str = "https://firebasestorage.googleapis.com/v0/b/trail2-ff40f.appspot.com/o/chemistry%2FReynolds%20number%20formula.jpg?alt=media&token=d2ec92a3-1974-437d-9cec-01f21025c0a6";
                    openImageActivity(str);

                }
                if(position == 8){
                    String str = "https://firebasestorage.googleapis.com/v0/b/trail2-ff40f.appspot.com/o/chemistry%2Fkinetics%20energy%20formula.jpg?alt=media&token=0213c5a5-ddd2-46c0-a223-03c463fd972d";
                    openImageActivity(str);

                }
                if(position == 9){
                    String str = "https://firebasestorage.googleapis.com/v0/b/trail2-ff40f.appspot.com/o/chemistry%2Fmass%20formula.jpg?alt=media&token=6dbbe5d9-ba46-44b9-8c53-dc75a557b4f5";
                    openImageActivity(str);

                }
                if(position == 10){
                    String str = "https://firebasestorage.googleapis.com/v0/b/trail2-ff40f.appspot.com/o/chemistry%2Fimpulsive%20force.jpg?alt=media&token=d613ed2a-793c-4404-a203-7282bcfc06ef";
                    openImageActivity(str);

                }
                if(position == 11){
                    String str = "https://firebasestorage.googleapis.com/v0/b/trail2-ff40f.appspot.com/o/chemistry%2Fgravitational%20potential%20energy.jpg?alt=media&token=746a3368-e2ca-419e-8601-2f1cd6e499e4";
                    openImageActivity(str);

                }
                if(position == 12){
                    String str = "https://firebasestorage.googleapis.com/v0/b/trail2-ff40f.appspot.com/o/chemistry%2Felastic%20potential%20energy%20formula.jpg?alt=media&token=6b4b7473-3bce-4105-9129-6bfa9caca719";
                    openImageActivity(str);

                }
                if(position == 13){
                    String str = "https://firebasestorage.googleapis.com/v0/b/trail2-ff40f.appspot.com/o/chemistry%2Fweight.jpg?alt=media&token=ef63a02c-12de-4720-ae3a-ed8f5c1156cb";
                    openImageActivity(str);

                }
                if(position == 14){
                    String str = "https://firebasestorage.googleapis.com/v0/b/trail2-ff40f.appspot.com/o/chemistry%2Fprojectile%20motion%20formula.jpg?alt=media&token=9daf4abb-5a1f-4d5b-b236-4bc17ca3fbbf";
                    openImageActivity(str);

                }
                if(position == 15){
                    String str = "https://firebasestorage.googleapis.com/v0/b/trail2-ff40f.appspot.com/o/chemistry%2Fwork%20done.jpg?alt=media&token=0bdd4f02-a223-4409-81b6-a649d2395ce3";
                    openImageActivity(str);

                }if(position == 16){
                    String str = "https://firebasestorage.googleapis.com/v0/b/trail2-ff40f.appspot.com/o/chemistry%2Ftorque%20formula.jpg?alt=media&token=5a8a8925-c0d4-4ce5-a603-39c790820c25";
                    openImageActivity(str);

                }
                if(position == 17){
                    String str = "https://firebasestorage.googleapis.com/v0/b/trail2-ff40f.appspot.com/o/chemistry%2Fwave%20formula.jpg?alt=media&token=f8d4a453-dba4-40e8-b83c-f4e17ae511bb";
                    openImageActivity(str);

                }





            }
        });
    }
    private void openImageActivity(String  imageResId) {
        Intent intent = new Intent(MainActivity2.this, phy1.class);
        intent.putExtra("imageResId", imageResId);
        startActivity(intent);
    }
}