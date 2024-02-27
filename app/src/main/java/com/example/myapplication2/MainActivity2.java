package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText e1;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
         e1=(EditText) findViewById(R.id.e1);

         btn=(Button) findViewById(R.id.btn);
         btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int s1 = Integer.parseInt(e1.getText().toString());
                if(s1<=7 && s1 >= 1){
                    Intent intent = new Intent(MainActivity2.this,MainActivity2B.class);
                    intent.putExtra("value", s1);
                    startActivity(intent);
                }else {
                   Toast.makeText(MainActivity2.this, "Enter number range between 1-7", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}