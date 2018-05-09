package com.fy.behavior;

import android.content.Intent;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView depentent = findViewById(R.id.tvDepentent);
        depentent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewCompat.offsetTopAndBottom(v, 15);

                Intent intent = new Intent(MainActivity.this, ScrollingActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });

        TextView tvOneBehavior = findViewById(R.id.tvOneBehavior);
        tvOneBehavior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, com.fy.behavior.one.ScrollingActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });

    }

}
