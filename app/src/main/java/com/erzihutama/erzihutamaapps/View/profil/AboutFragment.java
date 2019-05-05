package com.erzihutama.erzihutamaapps.View.profil;

import android.app.Dialog;
import android.app.DialogFragment;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.erzihutama.erzihutamaapps.R;

// Tanggal Pengerjaan : 5 mei 2019
// NIM                : 10116479
// Nama               : ERZI HUTAMA DWIRAMA PUTRA
// Kelas              : AKB 11


public class AboutFragment extends Fragment {

    Dialog myDialog;
    Button btnFollow ;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       final View myFragmentView = inflater.inflate(R.layout.fragment_about, container, false);
        Button dialogAbout = (Button)myFragmentView.findViewById(R.id.popup);

        dialogAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(getActivity());
                dialog.setCancelable(true);

                View view  = getActivity().getLayoutInflater().inflate(R.layout.custompopup,null);
                dialog.setContentView(view);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.setTitle("ABOUT");

                Button button = (Button)dialog.findViewById(R.id.btnclose);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        return myFragmentView;
    }

//    public void ShowPopup(View v) {
//
//        Button btnFollow;
//        myDialog.setContentView(R.layout.custompopup);
//
//        btnFollow = (Button) myDialog.findViewById(R.id.btnfollow);
//        btnFollow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                myDialog.dismiss();
//            }
//        });
//        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//        myDialog.show();
//    }
}
