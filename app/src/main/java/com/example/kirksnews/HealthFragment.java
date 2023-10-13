package com.example.kirksnews;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HealthFragment extends Fragment {

    String api = "295a848099b048baa70bb4b548e07781";
    ArrayList<Article> Articlelist;
    Adapter adapter;
    String country = "us";
    private RecyclerView recyclerViewofhealth;
    private String category = "health";


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.healthfragment, null);


        recyclerViewofhealth = v.findViewById(R.id.recycleviewofhealth);
        Articlelist = new ArrayList<>();
        recyclerViewofhealth.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new Adapter(getContext(), Articlelist);
        recyclerViewofhealth.setAdapter(adapter);

        findNews();

        return v;
    }


    private void findNews() {

        ApiUtilities.getApiInterface().getCategoryNews(country,category,100,api).enqueue(new Callback<the_n>() {
            @Override
            public void onResponse(Call<the_n> call, Response<the_n> response) {
                if(response.isSuccessful())
                {
                    Articlelist.addAll(response.body().getArticles());
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<the_n> call, Throwable t) {

            }
        });
    }
}
