package kr.hs.emirim.w2036.tdd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class January2 extends AppCompatActivity {
    Button btnBack, btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_january2);

        btnBack = findViewById(R.id.back_button);
        btnSave = findViewById(R.id.save_button);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backActivity();
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public void backActivity() {
        Intent intent = new Intent(this, January.class);
        startActivity(intent);
    }
}