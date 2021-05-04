package com.example.latihan3_monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
/**
 * Tanggal Pengerjaan : Senin, 3 Mei 2021
 * Deskripsi Pekerjaan: Membuat tampilan MainActivity dan memberikan intent untuk menuju halaman Login
 * Nim : 10118069
 * Nama : Muhamad Rizqi Ramdani
 * Kelas : IF-2
 **/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnmulai(View view) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}