package com.example.latihan3_monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
/**
 * Tanggal Pengerjaan : Senin, 3 Mei 2021
 * Deskripsi Pekerjaan: Membuat tampilan Login dan memberikan intent untuk menuju ke halaman Data_Diri
 * Nim : 10118069
 * Nama : Muhamad Rizqi Ramdani
 * Kelas : IF-2
 **/
public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Intent intent = getIntent();
    }
    public void btnmasuk(View view) {
        Intent intent = new Intent(this, Data_Diri.class);
        startActivity(intent);
    }
}