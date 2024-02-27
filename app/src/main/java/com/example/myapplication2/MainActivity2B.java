package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Switch;

import java.util.ArrayList;

public class MainActivity2B extends AppCompatActivity {

//    ListView lst ;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_b);
        ListView lst = findViewById(R.id.lst);
        ImageView img = findViewById(R.id.img);
        int i;
        String bicks[] = {
                "bullet","classic","defender","gt","himaliyan","hunter","thunderbird"
        };
        ArrayList<String>bicklist = new ArrayList<>();
        int s2 = getIntent().getExtras().getInt("value");

        for(i =0;i<=s2-1;i++){
            bicklist.add(bicks[i]);
        }

        ArrayAdapter<String> arr  = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,bicklist);
        lst.setAdapter(arr);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               img.setVisibility(View.VISIBLE);
               switch (position){
                   case 0: img.setImageResource(R.drawable.bullet);
                   break;
                   case 1: img.setImageResource(R.drawable.classic);
                       break;
                   case 2: img.setImageResource(R.drawable.gt);
                       break;
                   case 3: img.setImageResource(R.drawable.defender);
                       break;
                   case 4: img.setImageResource(R.drawable.himaliyan);
                       break;
                   case 5: img.setImageResource(R.drawable.hunter);
                       break;
                   case 6: img.setImageResource(R.drawable.interceptor);
                       break;
                   case 7: img.setImageResource(R.drawable.thunderbird);
                       break;
               }
           }
       });
    }
}