package com.erzihutama.erzihutamaapps.Model;

// Tanggal Pengerjaan : 30 APRIL 2019
// NIM                : 10116479
// Nama               : ERZI HUTAMA DWIRAMA PUTRA
// Kelas              : AKB 11


public class FriendsModel {
    private int mImageResource;
    private String namaGambar;

    public FriendsModel(int ImageResource, String namagambar){
        mImageResource = ImageResource;
        namaGambar = namagambar;

    }

    public int getmImageResource(){
        return mImageResource;
    }

    public String getNamaGambar(){
        return namaGambar;
    }

}
