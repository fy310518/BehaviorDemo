package com.fy.behavior.behavior_a;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.fy.behavior.R;

/**
 * 自定义 行为 一 demo
 * Created by fangs on 2018/5/9.
 */
public class BehaviorOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_behavior_a);

        TextView depentent = findViewById(R.id.tvDepentent);
        depentent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewCompat.offsetTopAndBottom(v, 15);
            }
        });
    }
}
