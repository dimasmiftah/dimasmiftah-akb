package me.dimasmiftah.dimasmiftah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import me.dimasmiftah.dimasmiftah.Adapter.WalkthroughAdapter;
import me.dimasmiftah.dimasmiftah.Model.WalkthroughModel;

import me.dimasmiftah.dimasmiftah.R;

import java.util.ArrayList;
import java.util.List;

/*
    Tanggal pengerjaan: Kamis, 22 Mei 2021
    NIM: 10118087
    Nama: Dimas Miftahul Huda
    Kelas: IF-2
*/

public class WalkthroughActivity extends AppCompatActivity {

    private WalkthroughAdapter walkthroughAdapter;
    private LinearLayout linlayIndicatorWalkthrough;
    private Button btnActionWalkthrough;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough);

        linlayIndicatorWalkthrough = findViewById(R.id.linlay_indicatorwalkthrough);
        btnActionWalkthrough = findViewById(R.id.btn_actionwalkthrough);

        setupWalkthroughItems();

        final ViewPager2 viewpagerWalkthrough = findViewById(R.id.viewpager_walkthrough);
        viewpagerWalkthrough.setAdapter(walkthroughAdapter);

        setupIndicatorWalkthrough();
        setCurrentIndicatorWalkthrough(0);

        viewpagerWalkthrough.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                setCurrentIndicatorWalkthrough(position);
            }
        });

        btnActionWalkthrough.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(viewpagerWalkthrough.getCurrentItem() + 1 < walkthroughAdapter.getItemCount()) {
                    viewpagerWalkthrough.setCurrentItem(viewpagerWalkthrough.getCurrentItem() + 1);
                } else {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    finish();
                }
            }
        });
    }

    private void setupWalkthroughItems() {
        List<WalkthroughModel> walkthroughModels = new ArrayList<>();

        WalkthroughModel itemWalkthrough1 = new WalkthroughModel();
        itemWalkthrough1.setTitle("Halo!");
        itemWalkthrough1.setSubtitle("Selamat datang di aplikasi Dimas Miftah");
        itemWalkthrough1.setImage(R.drawable.walkthrough1);

        WalkthroughModel itemWalkthrough2 = new WalkthroughModel();
        itemWalkthrough2.setTitle("Profil, Kegiatan, Galeri, Musik & Video");
        itemWalkthrough2.setSubtitle("Kamu dapat menemukan profil, kegiatan sehari-hari, galeri foto, musik, dan video favoritku di sini.");
        itemWalkthrough2.setImage(R.drawable.walkthrough2);

        WalkthroughModel itemWalkthrough3 = new WalkthroughModel();
        itemWalkthrough3.setTitle("Kontak Saya");
        itemWalkthrough3.setSubtitle("Kamu juga bisa menyapa saya melalui salah satu sosial media yang tercantum.");
        itemWalkthrough3.setImage(R.drawable.walkthrough3);

        walkthroughModels.add(itemWalkthrough1);
        walkthroughModels.add(itemWalkthrough2);
        walkthroughModels.add(itemWalkthrough3);

        walkthroughAdapter = new WalkthroughAdapter(walkthroughModels);
    }

    private void setupIndicatorWalkthrough() {
        ImageView[] indicator = new ImageView[walkthroughAdapter.getItemCount()];
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(8,0, 8,0);
        for (int i = 0; i < indicator.length; i++) {
            indicator[i] = new ImageView(getApplicationContext());
            indicator[i].setImageDrawable(ContextCompat.getDrawable(
                    getApplicationContext(),
                    R.drawable.walkthrough_indicator_inactive
            ));
            indicator[i].setLayoutParams(layoutParams);
            linlayIndicatorWalkthrough.addView(indicator[i]);
        }
    }

    private void setCurrentIndicatorWalkthrough(int index) {
        int childCount = linlayIndicatorWalkthrough.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ImageView imageView = (ImageView)linlayIndicatorWalkthrough.getChildAt(i);
            if(i == index) {
                imageView.setImageDrawable(
                        ContextCompat.getDrawable(getApplicationContext(), R.drawable.walkthrough_indicator_active)
                );
            }else{
                imageView.setImageDrawable(
                        ContextCompat.getDrawable(getApplicationContext(), R.drawable.walkthrough_indicator_inactive)
                );
            }
        }
        if (index == walkthroughAdapter.getItemCount() - 1) {
            btnActionWalkthrough.setText("Start");
        }else
            btnActionWalkthrough.setText("Next");
    }
}