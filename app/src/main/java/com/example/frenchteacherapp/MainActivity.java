package com.example.frenchteacherapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button blackBtn, greenBtn, purpleBtn, redBtn, yellowBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blackBtn = findViewById(R.id.blackbtn);
        greenBtn = findViewById(R.id.greenBtn);
        purpleBtn = findViewById(R.id.purpleBtn);
        redBtn = findViewById(R.id.redBtn);
        yellowBtn = findViewById(R.id.yellowBtn);

       blackBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
      purpleBtn.setOnClickListener(this);
     redBtn.setOnClickListener(this);
      yellowBtn.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        // find the button by id and play the correct sound

        int clickedBtnId = v.getId();
        if (clickedBtnId == R.id.blackbtn){
            playsound(R.raw.black);
        } else if (clickedBtnId == R.id.greenBtn) {
            playsound(R.raw.green);
        } else if (clickedBtnId == R.id.purpleBtn) {
             playsound(R.raw.purple);
        } else if (clickedBtnId == R.id.redBtn) {
            playsound(R.raw.red);
        } else if (clickedBtnId == R.id.yellowBtn) {
            playsound(R.raw.yellow);

        }


    }

    public void playsound(int id){
        MediaPlayer mediaPlayer = MediaPlayer.create(
                this,
                id
        );
        mediaPlayer.start();

    }

}