package com.example.acer.th149;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by ACER on 09/14/17.
 */

public class ActivityB extends AppCompatActivity {
    private TextView tvContent;
    private TextView tvTitle;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_b);

        tvContent = (TextView) findViewById(R.id.tv_description);
        tvTitle = (TextView) findViewById(R.id.tv_title);


        Intent intent = getIntent();
        if (intent != null) {
            Bundle bundle = intent.getBundleExtra(ActivityA.BUNDLE);
            if (bundle != null) {
                tvTitle.setText(bundle.getString(ActivityA.TITLE));
                tvContent.setText(bundle.getString(ActivityA.DESCRIPTION));
            } else {
                tvTitle.setText(intent.getStringExtra(ActivityA.TITLE));
                tvContent.setText(intent.getStringExtra(ActivityA.DESCRIPTION));
            }

        }
    }
}

