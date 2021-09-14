package kr.hs.emirim.w2036.tdd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class February extends AppCompatActivity {
    Button btn_date_1, btn_date_2, btn_date_3, btn_date_4, btn_date_5, btn_date_6, btn_date_7, btn_date_8, btn_date_9, btn_date_10;
    Button btn_date_11, btn_date_12, btn_date_13, btn_date_14, btn_date_15, btn_date_16, btn_date_17, btn_date_18, btn_date_19, btn_date_20;
    Button btn_date_21, btn_date_22, btn_date_23, btn_date_24, btn_date_25, btn_date_26, btn_date_27, btn_date_28;
    Button btnBack;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_february);

        btn_date_1 = findViewById(R.id.btn_date_1);
        btn_date_2 = findViewById(R.id.btn_date_2);
        btn_date_3 = findViewById(R.id.btn_date_3);
        btn_date_4 = findViewById(R.id.btn_date_4);
        btn_date_5 = findViewById(R.id.btn_date_5);
        btn_date_6 = findViewById(R.id.btn_date_6);
        btn_date_7 = findViewById(R.id.btn_date_7);
        btn_date_8 = findViewById(R.id.btn_date_8);
        btn_date_9 = findViewById(R.id.btn_date_9);
        btn_date_10 = findViewById(R.id.btn_date_10);
        btn_date_11 = findViewById(R.id.btn_date_11);
        btn_date_12 = findViewById(R.id.btn_date_12);
        btn_date_13 = findViewById(R.id.btn_date_13);
        btn_date_14 = findViewById(R.id.btn_date_14);
        btn_date_15 = findViewById(R.id.btn_date_15);
        btn_date_16 = findViewById(R.id.btn_date_16);
        btn_date_17 = findViewById(R.id.btn_date_17);
        btn_date_18 = findViewById(R.id.btn_date_18);
        btn_date_19 = findViewById(R.id.btn_date_19);
        btn_date_20 = findViewById(R.id.btn_date_20);
        btn_date_21 = findViewById(R.id.btn_date_21);
        btn_date_22 = findViewById(R.id.btn_date_22);
        btn_date_23 = findViewById(R.id.btn_date_23);
        btn_date_24 = findViewById(R.id.btn_date_24);
        btn_date_25 = findViewById(R.id.btn_date_25);
        btn_date_26 = findViewById(R.id.btn_date_26);
        btn_date_27 = findViewById(R.id.btn_date_27);
        btn_date_28 = findViewById(R.id.btn_date_28);
        btnBack = findViewById(R.id.back_button);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backActivity();
            }
        });

        btn_date_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), January.class);
                startActivity(intent);
            }
        });

        btn_date_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), January.class);
                startActivity(intent);
            }
        });

        btn_date_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), January.class);
                startActivity(intent);
            }
        });

        btn_date_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), January.class);
                startActivity(intent);
            }
        });

        btn_date_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), January.class);
                startActivity(intent);
            }
        });

        btn_date_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), January.class);
                startActivity(intent);
            }
        });

        btn_date_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), January.class);
                startActivity(intent);
            }
        });

        btn_date_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), January.class);
                startActivity(intent);
            }
        });

        btn_date_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), January.class);
                startActivity(intent);
            }
        });

        btn_date_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), January.class);
                startActivity(intent);
            }
        });

        btn_date_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), January.class);
                startActivity(intent);
            }
        });

        btn_date_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), January.class);
                startActivity(intent);
            }
        });

        btn_date_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), January.class);
                startActivity(intent);
            }
        });

        btn_date_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), January.class);
                startActivity(intent);
            }
        });

        btn_date_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), January.class);
                startActivity(intent);
            }
        });

        btn_date_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), January.class);
                startActivity(intent);
            }
        });

        btn_date_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), January.class);
                startActivity(intent);
            }
        });

        btn_date_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), January.class);
                startActivity(intent);
            }
        });

        btn_date_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), January.class);
                startActivity(intent);
            }
        });

        btn_date_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), January.class);
                startActivity(intent);
            }
        });

        btn_date_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), January.class);
                startActivity(intent);
            }
        });

        btn_date_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), January.class);
                startActivity(intent);
            }
        });

        btn_date_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), January.class);
                startActivity(intent);
            }
        });

        btn_date_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), January.class);
                startActivity(intent);
            }
        });

        btn_date_25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), January.class);
                startActivity(intent);
            }
        });

        btn_date_26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), January.class);
                startActivity(intent);
            }
        });

        btn_date_27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), January.class);
                startActivity(intent);
            }
        });

        btn_date_28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), January.class);
                startActivity(intent);
            }
        });
    }
    public void backActivity() {
        Intent intent = new Intent(this, PickMonthActivity.class);
        startActivity(intent);
    }
}