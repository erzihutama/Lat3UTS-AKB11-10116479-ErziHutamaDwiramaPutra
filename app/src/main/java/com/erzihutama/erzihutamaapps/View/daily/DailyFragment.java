package com.erzihutama.erzihutamaapps.View.daily;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.erzihutama.erzihutamaapps.Adapter.DailyAdapter;
import com.erzihutama.erzihutamaapps.Adapter.FriendAdapter;
import com.erzihutama.erzihutamaapps.Model.DailyModel;
import com.erzihutama.erzihutamaapps.Model.FriendsModel;
import com.erzihutama.erzihutamaapps.R;

import java.util.ArrayList;

// Tanggal Pengerjaan : 26 APRIL 2019
// NIM                : 10116479
// Nama               : ERZI HUTAMA DWIRAMA PUTRA
// Kelas              : AKB 11

public class DailyFragment extends Fragment {


    private RecyclerView mRecycleView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private RecyclerView mRecycleView2;
    private RecyclerView.Adapter mAdapter2;
    private RecyclerView.LayoutManager mLayoutManager2;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_daily, container, false);


        ArrayList<DailyModel> dailyModels = new ArrayList<>();
        dailyModels.add(new DailyModel(R.drawable.running,"Pukul 04:30 - 04:30 bangun tidur , beres-beres kamar"));
        dailyModels.add(new DailyModel(R.drawable.running,"Pukul 05:00 - 05:15 Sholat Shubuh , ngsji ,bscs-baca"));
        dailyModels.add(new DailyModel(R.drawable.running,"Pukul 05:15 - 06:00 jalan-jalan sambil cari makan"));
        dailyModels.add(new DailyModel(R.drawable.running,"Pukul 06:00 - 07:00 Sarapan Pagi"));
        dailyModels.add(new DailyModel(R.drawable.running,"Pukul 07:00 - 11:45 Aktivitas Produktif"));
        dailyModels.add(new DailyModel(R.drawable.running,"Pukul 11:45 - 12:15 Sholat Dzuhur"));
        dailyModels.add(new DailyModel(R.drawable.running,"Pukul 12:15 - 15:00 Aktivitas Produktif / Istirahat"));
        dailyModels.add(new DailyModel(R.drawable.running,"Pukul 15:00 - 15:30 Sholat Ashar"));
        dailyModels.add(new DailyModel(R.drawable.running,"Pukul 15:30 - 17:45 Aktivitas Produktif / Santai Sore"));
        dailyModels.add(new DailyModel(R.drawable.running,"Pukul 17:45 - 18:30 Sholat Maghrib , Ngaji"));
        dailyModels.add(new DailyModel(R.drawable.running,"Pukul 18:30 - 19:00 Review Pembelajaran"));
        dailyModels.add(new DailyModel(R.drawable.running,"Pukul 19:00 - 19:30 Sholat Isya , Ngaji"));
        dailyModels.add(new DailyModel(R.drawable.running,"Pukul 19:30 - 22:00 Aktivitas Produktif / Santai Malam"));
        dailyModels.add(new DailyModel(R.drawable.running,"Pukul 22:00 - 04:00 Istirahat"));

        mRecycleView = view.findViewById(R.id.daily_id_r);
        mRecycleView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mAdapter = new DailyAdapter(dailyModels);

        mRecycleView.setLayoutManager(mLayoutManager);
        mRecycleView.setAdapter(mAdapter);



        ArrayList<FriendsModel> friendsModels = new ArrayList<>();
        friendsModels.add(new FriendsModel(R.drawable.prof,"Erzi hutama"));
        friendsModels.add(new FriendsModel(R.drawable.poto,"Brayen"));
        friendsModels.add(new FriendsModel(R.drawable.poto,"brokoli"));
        friendsModels.add(new FriendsModel(R.drawable.prof,"jawhed"));

        mRecycleView2 = view.findViewById(R.id.daily_id_r_h);
        mRecycleView2.setHasFixedSize(true);
        mLayoutManager2 = new LinearLayoutManager(getActivity());
        mAdapter2 = new FriendAdapter(friendsModels);

        mRecycleView2.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayout.HORIZONTAL,false));
        mRecycleView2.setAdapter(mAdapter2);

        return view;
    }
}
