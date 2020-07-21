package com.hemendra.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GridAdapter extends BaseAdapter {
    int[] images;
    Context c;
    GridAdapter(Context c, int[] images)
    {
        this.c = c;
        this.images= images;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = LayoutInflater.from(c);

        View v = layoutInflater.inflate(R.layout.grid_item,null);
        ImageView iv = v.findViewById(R.id.iv_item);
        iv.setImageResource(images[position]);
        return v;
    }
}
