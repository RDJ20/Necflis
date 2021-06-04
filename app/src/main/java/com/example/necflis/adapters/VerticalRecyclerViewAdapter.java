package com.example.necflis.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.necflis.R;
import com.example.necflis.adapters.Models.HorizontalModel;
import com.example.necflis.adapters.Models.VerticalModel;

import java.util.ArrayList;

public class VerticalRecyclerViewAdapter extends RecyclerView.Adapter<VerticalRecyclerViewAdapter.VerticalRVViewHolder> {



    Context context;
    ArrayList<VerticalModel> arrayList;

    public VerticalRecyclerViewAdapter(Context context,ArrayList<VerticalModel> arrayList)
    {
        this.arrayList = arrayList;
        this.context = context;
    }


    @NonNull
    @Override
    public VerticalRVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_vertical,parent,false);
        return new VerticalRVViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VerticalRVViewHolder holder, int position) {
        VerticalModel verticalModel = arrayList.get(position);
        String title = verticalModel.getTitle();
        ArrayList<HorizontalModel> singleItem = verticalModel.getArrayList();

        holder.textView.setText(title);
        HorizontalRecyclerViewAdapter horizontalRecyclerViewAdapter= new HorizontalRecyclerViewAdapter
                (context, singleItem);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class VerticalRVViewHolder extends RecyclerView.ViewHolder
    {
        RecyclerView recyclerView;
        TextView textView;
        public VerticalRVViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView = (RecyclerView)itemView.findViewById(R.id.recyclerview1);
            textView = (TextView) itemView.findViewById(R.id.Text1);
        }
    }
}
