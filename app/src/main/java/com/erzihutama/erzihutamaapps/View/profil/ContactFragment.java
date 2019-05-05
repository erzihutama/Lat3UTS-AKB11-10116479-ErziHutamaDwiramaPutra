package com.erzihutama.erzihutamaapps.View.profil;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.erzihutama.erzihutamaapps.R;



// Tanggal Pengerjaan : 5 mei 2019
// NIM                : 10116479
// Nama               : ERZI HUTAMA DWIRAMA PUTRA
// Kelas              : AKB 11

public class ContactFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact, container, false);
        TextView nohp = (TextView) view.findViewById(R.id.txtnohp);
        TextView email = (TextView) view.findViewById(R.id.email) ;
        TextView igram = (TextView) view.findViewById(R.id.instagram);
        TextView web = (TextView) view.findViewById(R.id.website);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://erzihutama.wordpress.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        igram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent("android.intent.action.VIEW",

                        Uri.parse("https://www.instagram.com/erzihutama/"));

                startActivity(browserIntent);
            }
        });
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("plain/text");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "erzihutama@gmail.com" });
                intent.putExtra(Intent.EXTRA_SUBJECT, "Halo");
                intent.putExtra(Intent.EXTRA_TEXT, "Bila Ingin Mengirim Email harap Di isi nama lengkapnya ");
                startActivity(Intent.createChooser(intent, ""));

            }
        });
        nohp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String formattedNumber = "08986160843";
                try{
                    Intent sendIntent =new Intent("android.intent.action.MAIN");
                    sendIntent.setComponent(new ComponentName("com.whatsapp", "com.whatsapp.Conversation"));
                    sendIntent.setAction(Intent.ACTION_SEND);
                    sendIntent.setType("text/plain");
                    sendIntent.putExtra(Intent.EXTRA_TEXT,"");
                    sendIntent.putExtra("jid", formattedNumber +"@s.whatsapp.net");
                    sendIntent.setPackage("com.whatsapp");
                    startActivity(sendIntent);
                }
                catch(Exception e)
                {
                    Toast.makeText(view.getContext(),"Error/n"+ e.toString(),Toast.LENGTH_SHORT).show();
                }
            }
        });


        return view;
    }


}
