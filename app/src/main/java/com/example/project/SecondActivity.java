package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.project.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // hitta knappen för att komma tillbaka till MainActivity
        Button button = findViewById(R.id.backButton);

        // skapa clicklistener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // skapa en intent för att öppna MainActivity
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);


                // starta MainActivity
                startActivity(intent);
            }
        });
    }
}