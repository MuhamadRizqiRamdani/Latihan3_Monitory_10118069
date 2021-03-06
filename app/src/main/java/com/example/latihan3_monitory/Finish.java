package com.example.latihan3_monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
/**
 * Tanggal Pengerjaan : Senin, 3 Mei 2021
 * Deskripsi Pekerjaan: Membuat tampilan Finish dan menerima input nama dari halaman data diri untuk ditampilkan pada text kamu
 * Nim : 10118069
 * Nama : Muhamad Rizqi Ramdani
 * Kelas : IF-2
 **/
public class Finish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        String nickName = getIntent().getStringExtra(Data_Diri.INPUT_NICKNAME);

        String text = getString(R.string.pesan_beres).toString();
        TextView textberes = (TextView)findViewById(R.id.textberes);

        textberes.setText(String.format(text, nickName).toString());
    }

    public void btnfinish(View view) {
        finishAffinity();
        finishAndRemoveTask();
    }
}