package com.example.necflis.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.necflis.R;
import com.example.necflis.adapters.Models.HorizontalModel;

import java.util.ArrayList;

public class HorizontalRecyclerViewAdapter extends RecyclerView.Adapter<HorizontalRecyclerViewAdapter.HorizontalRVViewHolder> {



    Context context;
    ArrayList<HorizontalModel> arrayList;
    @NonNull
    @Override
    public HorizontalRVViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_horizontal,parent,false);
        return new HorizontalRVViewHolder(view);
    }
     public HorizontalRecyclerViewAdapter(Context context, ArrayList<HorizontalModel> arrayList){
        this.context= context;
        this.arrayList= arrayList;
     }
    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public void onBindViewHolder( @NonNull HorizontalRVViewHolder holder, int position) {

    }

    public class HorizontalRVViewHolder extends RecyclerView.ViewHolder
    {

        public HorizontalRVViewHolder(View itemView) {
            super(itemView);
        }
    }
}
