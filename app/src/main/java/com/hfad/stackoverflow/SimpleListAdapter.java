package com.hfad.stackoverflow;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by amir ali on 8/23/2017.
 */

public class SimpleListAdapter extends RecyclerView.Adapter<SimpleListAdapter.SimpleListViewholder>{


    private final Context context;
    private ArrayList<SimpleListEntry> entries;
    public SimpleListAdapter(Context context, ArrayList<SimpleListEntry> entries){

        this.entries=entries;
        this.context = context;


    }

    @Override
    public SimpleListViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_simple_list_entry,parent,false);
        SimpleListViewholder viewholder=new SimpleListViewholder(view);
        return  viewholder;

    }

    @Override
    public void onBindViewHolder(SimpleListViewholder holder, int position) {





        Picasso.with(context).load(entries.get(position).getImage()).into(holder.Cir);
        holder.txt1.setText(entries.get(position).getSub());
        holder.txt2.setText(entries.get(position).getTags());
        if(entries.get(position).getTick().equals("false"))
        {
            holder.img.setBackgroundResource(R.drawable.untick);

        }
        else
            holder.img.setBackgroundResource(R.drawable.tick);





    }


    @Override
    public int getItemCount() {
        return entries.size();
    }

    public class SimpleListViewholder extends RecyclerView.ViewHolder{

        public TextView txt1,txt2;
        public ImageView img;
        public CircleImageView Cir;

        public SimpleListViewholder(final View itemView) {
            super(itemView);

            img= (ImageView) itemView.findViewById(R.id.check);
            txt1=(TextView) itemView.findViewById(R.id.title);
            txt2=(TextView) itemView.findViewById(R.id.tag);
            Cir=(CircleImageView) itemView.findViewById(R.id.circleImageView);



            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                ;

                }
            });

        }
    }
   public  void  setFilter(ArrayList<SimpleListEntry> newList)
   {

       entries=new ArrayList<>();
       entries.addAll(newList);
       notifyDataSetChanged();

   }
}

