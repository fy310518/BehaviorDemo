package com.fy.behavior;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.fy.behavior.behavior_a.BehaviorOneActivity;
import com.fy.behavior.behavior_b.BehaviorScrollingActivity;
import com.fy.behavior.coordinator.ScrollingActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView tvOneCoordinator = findViewById(R.id.tvOneCoordinator);
        tvOneCoordinator.setOnClickListener(this);

        TextView tvTwoCoordinator = findViewById(R.id.tvTwoCoordinator);
        tvTwoCoordinator.setOnClickListener(this);

        TextView tvOneBehavior = findViewById(R.id.tvOneBehavior);
        tvOneBehavior.setOnClickListener(this);

        TextView tvTwoBehavior = findViewById(R.id.tvTwoBehavior);
        tvTwoBehavior.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.tvOneCoordinator:
                intent.setClass(MainActivity.this, ScrollingActivity.class);
                MainActivity.this.startActivity(intent);
                break;
            case R.id.tvTwoCoordinator:

                break;

            case R.id.tvOneBehavior:
                intent.setClass(MainActivity.this, BehaviorOneActivity.class);
                MainActivity.this.startActivity(intent);
                break;
            case R.id.tvTwoBehavior:
                intent.setClass(MainActivity.this, BehaviorScrollingActivity.class);
                MainActivity.this.startActivity(intent);
                break;


        }
    }
}
