package com.erzihutama.erzihutamaapps.View.profil;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;

import com.erzihutama.erzihutamaapps.R;


// Tanggal Pengerjaan : 5 mei 2019
// NIM                : 10116479
// Nama               : ERZI HUTAMA DWIRAMA PUTRA
// Kelas              : AKB 11

public class MyprofilFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_myprofil, container, false);

        return view;
    }
}
