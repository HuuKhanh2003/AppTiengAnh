package com.example.doanapphoctienganh.ActivityNguPhap;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.doanapphoctienganh.R;

public class NoiDungNguPhap extends AppCompatActivity {

    TextView txt_framentnguphap,txtCongThucNP,txtViDuNP;

    ImageButton btn_cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noi_dung_ngu_phap);
        addControl();
        loadDuLieu();
        addEvent();
    }

    void addControl()
    {
        txt_framentnguphap = (TextView) findViewById(R.id.txt_framentnguphap);
        txtCongThucNP = (TextView) findViewById(R.id.txtCongThucNP);
        txtViDuNP = (TextView) findViewById(R.id.txtViDuNP);
        btn_cancel = (ImageButton) findViewById(R.id.btn_cancel);
    }
    void addEvent() {
        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @SuppressLint("SetTextI18n")
    void loadDuLieu()
    {
        String ten,vidu,congthuc;
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        assert bundle != null;
        ten = bundle.getString("ten");
        congthuc = bundle.getString("congthuc");
        vidu = bundle.getString("vidu");

        txt_framentnguphap.setText(ten);
        txtCongThucNP.setText("✱ "+ congthuc);
        txtViDuNP.setText("● " +vidu);

    }

}