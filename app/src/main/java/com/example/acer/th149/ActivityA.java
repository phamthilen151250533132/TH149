package com.example.acer.th149;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityA extends AppCompatActivity {
    private Button btnSendData;
    private EditText edtTitle;
    private EditText edtDescription;
    public static final String TITLE = "title";
    public static final String DESCRIPTION = "description";
    public static final String BUNDLE = "bundel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);

        btnSendData = (Button) findViewById(R.id.btn_send_data);
        edtTitle = (EditText) findViewById(R.id.edt_title);
        edtDescription = (EditText) findViewById(R.id.edt_description);
        btnSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                byExtras();

            }
        });
    }

    //Gửi tuần tự
    public void byExtras() {
        Intent intent = new Intent(ActivityA.this, ActivityB.class);
        intent.putExtra(TITLE, edtTitle.getText().toString());
        intent.putExtra(DESCRIPTION, edtDescription.getText().toString());
        startActivity(intent);
    }

    //Gửi một lần duy nhất
    public void byBundle() {
        Intent intent = new Intent(ActivityA.this, ActivityB.class);
        Bundle bundle = new Bundle();
        bundle.putString(TITLE, edtTitle.getText().toString());
        bundle.putString(DESCRIPTION, edtDescription.getText().toString());
        intent.putExtra(BUNDLE, bundle);
        startActivity(intent);
    }
}

