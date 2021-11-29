package com.example.contactlist;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

     Activity activity;
     ArrayList<ContactModel> arrayList;


    public MainAdapter(Activity activity,ArrayList<ContactModel> arrayList)
    {
        this.activity = activity;
        this.arrayList=arrayList;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //view oluştur
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_contacy,parent, false);
        //viewi döndür
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
      //contact model oluştur
        ContactModel model =arrayList.get(position);

        holder.tvName.setText(model.getName());

        holder.tvNumber.setText(model.getNumber());


    }

    @Override
    public int getItemCount() {
        //Dizinin boyutunu döndür
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvName,tvNumber;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //Değişken ata
            tvName = itemView.findViewById(R.id.tv_name);
            tvNumber =itemView.findViewById(R.id.tv_number);

        }
    }
}
