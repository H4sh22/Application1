package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NewActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);

        TextView messageText = findViewById(R.id.textView);
        messageText.setTextSize(26);
        messageText.setPadding(16, 16, 16, 16);

        Object myObject = (Object) getIntent().getSerializableExtra("myObject");
        if (myObject != null) {
            messageText.setText("Name: " + myObject.getName() + "\nAge: " + myObject.getAge());
        }

        Button button_next = findViewById(R.id.button3);
        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewActivity.this, NewActivity2.class);
                startActivity(intent);
            }
        });
        Button button_prev = findViewById(R.id.button2);
        button_prev.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}


