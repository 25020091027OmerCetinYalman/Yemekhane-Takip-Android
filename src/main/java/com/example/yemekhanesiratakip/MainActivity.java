package com.example.yemekhanesiratakip;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tasarımdaki butonu koda tanıtıyoruz
        Button girisButonu = findViewById(R.id.button);

        // Butona tıklanınca ne olacağını yazıyoruz
        girisButonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Yeni sayfaya (ListeActivity) geçiş komutu
                Intent gecis = new Intent(MainActivity.this, ListeActivity.class);
                startActivity(gecis);
            }
        });
    }
}