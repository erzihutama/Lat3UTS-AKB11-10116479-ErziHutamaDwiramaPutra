package com.erzihutama.erzihutamaapps.View.music;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.erzihutama.erzihutamaapps.Adapter.MusicAdapter;
import com.erzihutama.erzihutamaapps.Adapter.VideoAdapter;
import com.erzihutama.erzihutamaapps.Model.MusicModel;
import com.erzihutama.erzihutamaapps.Model.VideoModel;
import com.erzihutama.erzihutamaapps.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;

// Tanggal Pengerjaan : 4 mei 2019
// NIM                : 10116479
// Nama               : ERZI HUTAMA DWIRAMA PUTRA
// Kelas              : AKB 11

public class musicFragment extends Fragment {

    //deklarasi musik
    RecyclerView rvMusic;
    List<MusicModel> musicModelList;

    //deklarasi video
    RecyclerView rvVideo;
    List<VideoModel> videoModelList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_music, container, false);
        View viewFragment=inflater.inflate(R.layout.fragment_music, container, false);
        ButterKnife.bind(this,viewFragment);
        int musik1=R.raw.bcl;
        int musik2=R.raw.padi;
        int musik3=R.raw.sandy;
        int musik4=R.raw.trainheysoulsister;

        musicModelList=new ArrayList<>();
        musicModelList.add(new MusicModel(1,R.drawable.song,"Wanita terbahagia","BCL","3.00", musik1));
        musicModelList.add(new MusicModel(2,R.drawable.song,"Semua Tak Sama","padi","04.03", musik2));
        musicModelList.add(new MusicModel(3,R.drawable.song,"Tak Pernah Padam","Shandy Sandoro","04.00", musik3));
        musicModelList.add(new MusicModel(6,R.drawable.song,"Hey Soul Sister","Train","3.38", musik4));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        rvMusic = view.findViewById(R.id.music);
        rvMusic.setLayoutManager(linearLayoutManager);
        rvMusic.setHasFixedSize(true);
        MusicAdapter musicAdapter =new MusicAdapter(getContext(), musicModelList);
        rvMusic.setAdapter(musicAdapter);

        //for video
        String pathVideo = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.video;

        LinearLayoutManager vLinearLayoutManager=new LinearLayoutManager(getContext());
        videoModelList=new ArrayList<>();
        videoModelList.add(new VideoModel(1,"Video Lucu","andre","0.20", pathVideo));
        videoModelList.add(new VideoModel(2,"Video serem","Sule","0.20", pathVideo));
        rvVideo = view.findViewById(R.id.video);
        rvVideo.setLayoutManager(vLinearLayoutManager);
        rvVideo.setHasFixedSize(true);
        VideoAdapter videoAdapter =new VideoAdapter(getContext(), videoModelList);
       rvVideo.setAdapter(videoAdapter);

        return view;
    }
}
