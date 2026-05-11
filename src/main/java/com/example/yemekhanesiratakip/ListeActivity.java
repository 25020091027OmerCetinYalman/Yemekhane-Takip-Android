package com.example.yemekhanesiratakip;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class ListeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste);

        // Listede görünecek yemekhane isimleri
        String[] yemekhaneler = {"Merkez Yemekhane", "Avşar Yemekhanesi", "Bahçelievler Yemekhanesi", "Tıp Fakültesi Yemekhanesi"};

        // Tasarımdaki ListView'u buluyoruz
        ListView liste = findViewById(R.id.listView); // Eğer ListView'un ID'si farklıysa buradan düzeltilir

        // Verileri listeye bağlayan köprü (Adapter)
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, yemekhaneler);

        liste.setAdapter(adapter);
    }
}