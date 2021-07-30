package kr.hs.emirim.w2036.tdd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PickMonthActivity extends AppCompatActivity {
    Button january, february, march, april, may, june, july, august, september, october, november, december;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_month);

        january = findViewById(R.id.btn_1);
        february = findViewById(R.id.btn_2);
        march = findViewById(R.id.btn_3);
        april = findViewById(R.id.btn_4);
        may = findViewById(R.id.btn_5);
        june = findViewById(R.id.btn_6);
        july = findViewById(R.id.btn_7);
        august = findViewById(R.id.btn_8);
        september = findViewById(R.id.btn_9);
        october = findViewById(R.id.btn_10);
        november = findViewById(R.id.btn_11);
        december = findViewById(R.id.btn_12);

        january.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), January.class);
                startActivity(intent);
            }
        });

        february.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), February.class);
                startActivity(intent);
            }
        });

        march.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), March.class);
                startActivity(intent);
            }
        });

        april.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), April.class);
                startActivity(intent);
            }
        });

        may.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), May.class);
                startActivity(intent);
            }
        });

        june.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), June.class);
                startActivity(intent);
            }
        });

        july.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), July.class);
                startActivity(intent);
            }
        });

        august.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), August.class);
                startActivity(intent);
            }
        });

        september.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), September.class);
                startActivity(intent);
            }
        });

        october.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), October.class);
                startActivity(intent);
            }
        });

        november.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), November.class);
                startActivity(intent);
            }
        });

        december.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), December.class);
                startActivity(intent);
            }
        });
    }
}