package com.example.marcinsiuda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textview);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = 1; i<49; i++) {
                    list.add(i);
                }

                Log.d("STATE", "Wylosowano 49 cyfr");

                Collections.shuffle(list);

                ArrayList<Integer> chosen = new ArrayList<>();

                for (int i = 0 ; i<6 ; i++) {
                    chosen.add(list.get(i));
                }

                Collections.sort(chosen);

                StringBuilder sb = new StringBuilder();
                for (int i: chosen){
                    sb.append(i);
                    sb.append(", ");
                }

                textView.setText(sb.toString().replaceAll(", $", ""));



            }
        });

    }
}