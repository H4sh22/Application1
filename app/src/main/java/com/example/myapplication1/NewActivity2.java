package com.example.myapplication1;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;



import androidx.appcompat.app.AppCompatActivity;

public class NewActivity2 extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button button_next = findViewById(R.id.button5);
        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewActivity2.this, NewActivity3.class);
                startActivity(intent);
            }
        });
        Button button_prev = findViewById(R.id.button4);
        button_prev.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
