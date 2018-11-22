package org.themovie.project_image;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.movie01, R.drawable.movie02,
            R.drawable.movie03, R.drawable.movie04,
            R.drawable.movie05, R.drawable.movie06,
            R.drawable.movie07, R.drawable.movie08,
            R.drawable.movie09, R.drawable.movie10,
            R.drawable.movie11, R.drawable.movie12,
            R.drawable.movie13, R.drawable.movie14,
            R.drawable.movie15, R.drawable.movie16,
            R.drawable.movie17, R.drawable.movie18,
            R.drawable.movie19, R.drawable.movie20,
            R.drawable.movie21, R.drawable.movie22,
            R.drawable.movie23, R.drawable.movie24,
            R.drawable.movie25, R.drawable.movie26,
            R.drawable.movie27, R.drawable.movie28,
            R.drawable.movie29, R.drawable.movie30,
            R.drawable.movie31, R.drawable.movie32,
            R.drawable.movie33, R.drawable.movie34,
            R.drawable.movie35, R.drawable.movie36
    };

    // Constructor
    public ImageAdapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(300, 300));
        return imageView;
    }

}
