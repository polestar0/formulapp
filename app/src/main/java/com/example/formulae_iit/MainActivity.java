package com.example.formulae_iit;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {
    private TextView quoteTextView;

    private String quoteText = "Imagination is more important than knowledge";
    private int typingDelay = 50; // Delay between typing each character

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();



        setContentView(R.layout.activity_main);

        quoteTextView = findViewById(R.id.textView3);

        // Start typing animation
        startTypingAnimation();

        // Delayed transition to the HomeActivity after 3 seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Home_Activity.class);
                startActivity(intent);
                finish(); // Optional: finish the splash screen activity
            }
        }, 4000); // 3000 milliseconds = 3 seconds
    }

    private void startTypingAnimation() {
        final int[] charIndex = {0};
        final Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                quoteTextView.setText(quoteText.substring(0, charIndex[0]++));

                if (charIndex[0] <= quoteText.length()) {
                    handler.postDelayed(this, typingDelay);
                }
            }
        }, typingDelay);
    }
}





