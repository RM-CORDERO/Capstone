//Capstone Project

package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

public class LogInActivity extends AppCompatActivity {

    private TextView message;
    private int counter = 0;


    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = findViewById(R.id.clickCounter);
        ImageView star = findViewById(R.id.imageView);

        //define and attach click listener
        star.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                tapStar();
            }

        });
        Button btn = findViewById(R.id.accessButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cambia SecondActivity.class por el nombre de tu segunda actividad
                Intent intent = new Intent(LogInActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

    }

    private void tapStar(){

        counter++;
        String countAsText;

        switch (counter){
            case 1:
                countAsText = "once";
                break;

            case 2:
                countAsText = "twice";
                break;

            default:
                countAsText = String.format("%d times",counter);

        }
        message.setText(String.format("You touched the droid %s", countAsText));
    }
}
