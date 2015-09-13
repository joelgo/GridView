package com.example.usuario.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.Objects;

public class imageadapter extends BaseAdapter {
    private Context nContext;


    public imageadapter(Context c){
        nContext=c;
    }
    public int getCount(){
        return mThumbIds.length;
    }
    public Objects getItem(int position){
        return null;
    }
    public long getItemId(int position){
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(nContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);

        } else {
          imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }
  private Integer[] mThumbIds={
  R.drawable.fe, R.drawable.pp
  };


}
