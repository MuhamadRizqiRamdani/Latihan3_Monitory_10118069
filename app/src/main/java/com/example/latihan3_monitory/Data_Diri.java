package com.example.latihan3_monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
/**
 * Tanggal Pengerjaan : Senin, 3 Mei 2021
 * Deskripsi Pekerjaan: Membuat tampilan data diri dan memberikan input nama untuk ditampilkan ke halaman Finish
 * Nim : 10118069
 * Nama : Muhamad Rizqi Ramdani
 * Kelas : IF-2
 **/
public class Data_Diri extends AppCompatActivity {

    public static final String INPUT_NICKNAME = "com.example.latihan3_monitory.INPUT_NICKNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__diri);
    }

    public void btnnext(View view) {
        EditText nickName = (EditText) findViewById(R.id.isinama);

        if(nickName.length() < 3) {
            Toast.makeText(this, "Nama panggilan harus diisi", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = new Intent(this, Finish.class);
        intent.putExtra(INPUT_NICKNAME, nickName.getText().toString());
        startActivity(intent);

    }

}