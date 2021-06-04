package me.dimasmiftah.dimasmiftah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import me.dimasmiftah.dimasmiftah.R;

/*
    Tanggal pengerjaan: Kamis, 22 Mei 2021
    NIM: 10118087
    Nama: Dimas Miftahul Huda
    Kelas: IF-2
*/

public class SplashscreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), WalkthroughActivity.class));
                finish();
            }
        }, 3000L); // 3 detik
    }
}