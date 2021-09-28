package com.chuyennt.fookorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Intro extends AppCompatActivity {
    private Button start_bt;
    private EditText intro_editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        //Get UI references
        start_bt = (Button) findViewById(R.id.start_button);
        intro_editText = (EditText) findViewById(R.id.intro_editText);
        //Listen the event of the button Get Started
        start_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create Intent to start MainActivity
                Intent intent = new Intent(Intro.this, MainActivity.class);
                intent.putExtra("NAME_USER",intro_editText.getText());
                startActivity(intent);
            }
        });
    }
}