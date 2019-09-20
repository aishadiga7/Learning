package com.example.androidlearning.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.androidlearning.R;
import com.example.androidlearning.models.NicePlace;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private ArrayList<NicePlace> mNicePlaceList;
    private Context mContext;


    public RecyclerAdapter(ArrayList<NicePlace> nicePlaceList, Context context) {
        mNicePlaceList = nicePlaceList;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        NicePlace nicePlace  = mNicePlaceList.get(position);
        holder.mName.setText(nicePlace.getTitle());
        holder.bind(nicePlace);
    }

    @Override
    public int getItemCount() {
        return mNicePlaceList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView mName;



        public ViewHolder(View itemView) {
            super(itemView);
            mName = (TextView) itemView.findViewById(R.id.name);
        }

        public void bind(final NicePlace nicePlace ) {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }
}
