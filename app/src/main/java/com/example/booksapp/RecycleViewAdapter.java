package com.example.booksapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<ViewHolder> {
    private Context context;
    private List<Contact> contacts;

    public RecycleViewAdapter(Context context, List<Contact> contacts) {
        this.context = context;
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context.getApplicationContext()).inflate(R.layout.contactitem,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder viewHolder, int i) {
        Contact contact=contacts.get(i);
        viewHolder.name.setText(contact.getName());
        viewHolder.phone.setText(contact.getPhone());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }




}
class ViewHolder extends RecyclerView.ViewHolder{
    public TextView name,phone;
    public ViewHolder(@NonNull @NotNull View itemView) {
        super(itemView);
        name=itemView.findViewById(R.id.name);
        phone=itemView.findViewById(R.id.phone);

    }
}
