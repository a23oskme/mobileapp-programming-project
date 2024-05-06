package com.example.project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {


    Context context;
    ArrayList<Birds> birdList;

    public RecyclerViewAdapter(Context context, ArrayList<Birds> birdList) {
        this.context = context;
        this.birdList = birdList;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // inflate layout
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row, viewGroup, false);
        return new RecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder myViewHolder, int position) {
        myViewHolder.textView.setText(birdList.get(position).getName());
        myViewHolder.locationView.setText(birdList.get(position).getLocation());
        myViewHolder.weightView.setText(birdList.get(position).getWeight());
        myViewHolder.latinView.setText(birdList.get(position).getLatin());
        myViewHolder.wikiView.setText(birdList.get(position).getWikiLink());
    }

    @Override
    public int getItemCount() {
        return birdList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        TextView locationView;
        TextView weightView;
        TextView latinView;
        TextView wikiView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView);
            locationView = itemView.findViewById(R.id.locationView);
            weightView = itemView.findViewById(R.id.weightView);
            latinView = itemView.findViewById(R.id.latinView);
            wikiView = itemView.findViewById(R.id.wikiView);
        }
    }
}

