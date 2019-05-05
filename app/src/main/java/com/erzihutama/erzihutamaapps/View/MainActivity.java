package com.erzihutama.erzihutamaapps.View;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

import com.erzihutama.erzihutamaapps.R;
import com.erzihutama.erzihutamaapps.View.daily.DailyFragment;
import com.erzihutama.erzihutamaapps.View.galeri.galeriFragment;
import com.erzihutama.erzihutamaapps.View.home.HomeFragment;
import com.erzihutama.erzihutamaapps.View.music.musicFragment;
import com.erzihutama.erzihutamaapps.View.profil.ProfilFragment;

// Tanggal Pengerjaan : 24 APRIL 2019
// NIM                : 10116479
// Nama               : ERZI HUTAMA DWIRAMA PUTRA
// Kelas              : AKB 11

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // kita set default nya Home Fragment
        loadFragment(new HomeFragment());
        // inisialisasi BottomNavigaionView
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        // beri listener pada saat item/menu bottomnavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    private boolean loadFragment(android.support.v4.app.Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.framelayout, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        android.support.v4.app.Fragment fragment = null;
        switch (menuItem.getItemId()) {
            case R.id.navhome:
                fragment = new HomeFragment();
                break;
            case R.id.navdaily:
                fragment = new DailyFragment();
                break;
            case R.id.navgaleri:
                fragment = new galeriFragment();
                break;
            case R.id.navmusic:
                fragment = new musicFragment();
                break;
            case R.id.navprofil:
                fragment = new ProfilFragment();
                break;
        }
        return loadFragment(fragment);
    }

}
