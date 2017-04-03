package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mayank on 3/26/2017.
 */

public class WordAdapter extends ArrayAdapter<Word>
{
    private int bcolor;

    public WordAdapter(Activity context, ArrayList<Word> wordAdapter,int color)
    {
        super(context, 0, wordAdapter);
        bcolor = color;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View listItemView = convertView;



        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }


        Word temp = getItem(position);


        LinearLayout layout = (LinearLayout) listItemView.findViewById(R.id.block);

        layout.setBackgroundColor(bcolor);




        TextView miwok = (TextView) listItemView.findViewById(R.id.miwok);

        miwok.setText(temp.getMiwok());

        TextView english = (TextView) listItemView.findViewById(R.id.english);

        english.setText(temp.getEnglish());

        //    return super.getView(position, convertView, parent);
        ImageView iconImage = (ImageView) listItemView.findViewById(R.id.image);

        if(temp.hasImage())
        {
            iconImage.setImageResource(temp.getImageResourceId());
            iconImage.setVisibility(View.VISIBLE);
        }
        else
        {
            iconImage.setVisibility(View.GONE);
        }
        return listItemView;
    }


}
