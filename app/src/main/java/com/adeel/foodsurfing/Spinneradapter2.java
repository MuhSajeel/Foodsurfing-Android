package com.adeel.foodsurfing;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Muhammad Adeel on 5/24/2017.
 */

public class Spinneradapter2 extends BaseAdapter {
    Context context;
    String[] countryNames;
    LayoutInflater inflter;

    public Spinneradapter2(Context applicationContext, String[] countryNames) {
        this.context = applicationContext;
        this.countryNames = countryNames;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return countryNames.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.spinneritem2, null);
        ImageView images = (ImageView) view.findViewById(R.id.images);
        if(viewGroup.isShown())
        {
            if(i==0)
            {
                images.setBackgroundResource(R.drawable.inputsen);
            }
            else
            {
                images.setBackgroundResource(R.drawable.inputseni);
            }
        }
        TextView text = (TextView) view.findViewById(R.id.rowtext);
        text.setText(countryNames[i]);
        return view;
    }
}
