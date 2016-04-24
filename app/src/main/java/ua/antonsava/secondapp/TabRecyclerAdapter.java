package ua.antonsava.secondapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.List;


/**
 * Created by Apple on 20.04.2016.
 */
public class TabRecyclerAdapter extends RecyclerView.Adapter<TabRecyclerAdapter.ViewHolder> {

    private List<TabRecycleViewData> mTabRecyclerList;
    private Context mContext;

    public TabRecyclerAdapter(Context context, List<TabRecycleViewData> tabList) {
        this.mContext = context;
        this.mTabRecyclerList = tabList;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView mImageIcon;
        TextView mTextTitle;
        TextView mTextAdress;
        TextView mTextData;
        TextView mTextDays;
        ImageView mImageLike;
        LinearLayout mLinerLayout;
        FrameLayout mFrame;

        public ViewHolder(View itemView) {
            super(itemView);
            this.mImageIcon = (ImageView) itemView.findViewById(R.id.mark);
            this.mTextTitle = (TextView) itemView.findViewById(R.id.titles);
            this.mTextAdress = (TextView) itemView.findViewById(R.id.adress);
            this.mTextData = (TextView) itemView.findViewById(R.id.data);
            this.mTextDays = (TextView) itemView.findViewById(R.id.days);
            this.mImageLike = (ImageView) itemView.findViewById(R.id.like);
            this.mLinerLayout = (LinearLayout) itemView.findViewById(R.id.item_layout);
        }
    }

    @Override
    public TabRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TabRecyclerAdapter.ViewHolder holder, int position) {
        final TabRecycleViewData viewData = mTabRecyclerList.get(position);

        holder.mImageIcon.setImageResource(mTabRecyclerList.get(position).getmMark());
        holder.mTextTitle.setText(mTabRecyclerList.get(position).getmTitle());
        holder.mTextAdress.setText(mTabRecyclerList.get(position).getmAdress());
        holder.mTextData.setText(mTabRecyclerList.get(position).getmData());
        holder.mTextDays.setText(mTabRecyclerList.get(position).getmDays());
        holder.mImageLike.setImageResource(mTabRecyclerList.get(position).getmLike());

        holder.mLinerLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, InformationActivity.class);
                i.putExtra("viewData", viewData.getId());
                mContext.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mTabRecyclerList.size();
    }
}
