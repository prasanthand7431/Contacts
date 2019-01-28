package com.example.dd.myapplication.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dd.myapplication.Contact;
import com.example.dd.myapplication.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<Contact> contacts;
    Dialog mydialog;

    public RecyclerViewAdapter(Context mContext, List<Contact> contacts) {
        this.mContext = mContext;
        this.contacts = contacts;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v;
        v=LayoutInflater.from(mContext).inflate(R.layout.contact_item,parent,false);
        final MyViewHolder myViewHolder=new MyViewHolder(v);

        //Dialog ini
        mydialog=new Dialog(mContext);
        mydialog.setContentView(R.layout.dialog_contact);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        myViewHolder.itemcontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                TextView textView1 = mydialog.findViewById(R.id.textt1);
                TextView textView2 = mydialog.findViewById(R.id.textt2);
                ImageView imageView = mydialog.findViewById(R.id.images);

                textView1.setText(contacts.get(myViewHolder.getAdapterPosition()).getName());
                textView2.setText(contacts.get(myViewHolder.getAdapterPosition()).getPhone());
                imageView.setImageResource(contacts.get(myViewHolder.getAdapterPosition()).getImage());
                //Toast.makeText(mContext, "Test Clicked"+String.valueOf(myViewHolder.getAdapterPosition()), Toast.LENGTH_SHORT).show();
                mydialog.show();
            }
        });

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.textView1.setText(contacts.get(position).getName());
        holder.textView2.setText(contacts.get(position).getPhone());
        holder.imageView.setImageResource(contacts.get(position).getImage());

    }


    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView textView1;
        private TextView textView2;
        private ImageView imageView;
        private LinearLayout itemcontact;


        public MyViewHolder(View itemView) {
            super(itemView);

            itemcontact=itemView.findViewById(R.id.contact_items);

            textView1=itemView.findViewById(R.id.text1);
            textView2=itemView.findViewById(R.id.text2);
            imageView=itemView.findViewById(R.id.imageviews);

        }
    }

}
