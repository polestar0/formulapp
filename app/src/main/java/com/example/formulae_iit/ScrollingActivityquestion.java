package com.example.formulae_iit;


import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ScrollingActivityquestion extends AppCompatActivity {

    private RadioGroup optionsRadioGroup;
    private RadioButton option2RadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_scrolling);


        // Find the RadioGroup and the second RadioButton
        optionsRadioGroup = findViewById(R.id.optionsRadioGroup);
        option2RadioButton = findViewById(R.id.option2RadioButton);

        // Set a listener for the RadioGroup
        optionsRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // Get the checked RadioButton
                RadioButton checkedRadioButton = findViewById(checkedId);

                // Check if the second RadioButton is selected
                if (checkedRadioButton == option2RadioButton) {

                    // Show a toast message indicating the correct answer
                    Toast.makeText(ScrollingActivityquestion.this, "Correct!", Toast.LENGTH_SHORT).show();
                } else {
                    // Show a toast message indicating an incorrect answer
                    Toast.makeText(ScrollingActivityquestion.this, "Incorrect!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
