package com.example.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button start = findViewById(R.id.startButton);
        Button stop = findViewById(R.id.stopButton);

        start.setOnClickListener(v -> {
            Intent startIntent = new Intent(this, MusicService.class);
            startService(startIntent);
        });

        stop.setOnClickListener(v -> {
            Intent startIntent = new Intent(this, MusicService.class);
            stopService(startIntent);
        });

    }
}