package com.disability.synap;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {
    private Context mContext;
    private List<uploadadharcard> mUploads;


    public  ImageAdapter(Context context, List<uploadadharcard> uploads){
        mContext=context;
        mUploads=uploads;
    }

    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(mContext).inflate(R.layout.image_item,parent,false);
        return new ImageViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder imageViewHolder, int position) {
        uploadadharcard uploadcurrent=mUploads.get(position);
        // imageViewHolder.textViewName.setText(uploadcurrent.getName());
        Picasso.with(mContext)
                .load(uploadcurrent.getmImageUrl()).placeholder(R.mipmap.ic_launcher)
                .fit().centerCrop()
                .into(imageViewHolder.imageViews);

    }

    @Override
    public int getItemCount() {
        return mUploads.size();
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder{
        public TextView textViewName;
        public ImageView imageViews;

        public ImageViewHolder(View itemView){
            super(itemView);

            imageViews=itemView.findViewById(R.id.image_view_upload);
        }
    }
}