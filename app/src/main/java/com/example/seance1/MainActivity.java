package com.example.seance1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button t1;
    Button b2;
    TextView t;
    EditText t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        t1 = findViewById(R.id.t1);
        b2 = findViewById(R.id.b2);
        t = findViewById(R.id.t);
        t2 = findViewById(R.id.t2);
        setContentView(R.layout.activity_main);


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText("Bonjour");
            }
        });

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText("Bonsoir");
            }
        });

    }
}