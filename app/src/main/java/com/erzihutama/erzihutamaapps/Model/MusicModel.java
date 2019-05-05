package com.erzihutama.erzihutamaapps.Model;
// Tanggal Pengerjaan : 4 mei 2019
// NIM                : 10116479
// Nama               : ERZI HUTAMA DWIRAMA PUTRA
// Kelas              : AKB 11
public class MusicModel  {
    private int id,image;
    private String title;
    private String artist;
    private String duration;
    private int path;

    public MusicModel(int id, int image, String title, String artist, String duration, int path) {
        this.id = id;
        this.image = image;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.path = path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getPath() {
        return path;
    }

    public void setPath(int path) {
        this.path = path;
    }
}