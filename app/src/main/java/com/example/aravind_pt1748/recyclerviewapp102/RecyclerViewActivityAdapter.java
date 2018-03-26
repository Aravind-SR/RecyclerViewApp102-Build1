package com.example.aravind_pt1748.recyclerviewapp102;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by aravind-pt1748 on 26/03/18.
 */

public class RecyclerViewActivityAdapter extends RecyclerView.Adapter<RecyclerViewActivityAdapter.MyViewHolder>{

    private List<Game> GamesList;
    private Context context;
    private LruCache<String,Bitmap> mMemoryCache;
    private Bitmap bMap;

    public void delete(int position){
        GamesList.remove(position);
        notifyItemRemoved(position);
    }

    public void insert(int position){
        GamesList.add(GamesList.get(position));
        notifyItemInserted(position);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView title,genre,year;

        public MyViewHolder(View view){
            super(view);
            title = view.findViewById(R.id.textView);
            genre = view.findViewById(R.id.textView2);
            year = view.findViewById(R.id.textView3);
        }

        @Override
        public void onClick(View v) {

        }
    }

    public RecyclerViewActivityAdapter(Context context, List<Game> GamesList){
        this.GamesList = GamesList;
        this.context=context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_detail,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Game game = GamesList.get(position);
        holder.title.setText(game.getTitle());
        holder.genre.setText(game.getGenre());
        holder.year.setText(game.getYear());
        //holder.image.setImageResource(game.getImage());
        //setImage(holder, position);
        /*
        Glide.with(context)
                .load(game.getImage())
                .override(200, 200)
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.image);
           */

    }

    @Override
    public int getItemCount() {
        return GamesList.size();
    }

}
