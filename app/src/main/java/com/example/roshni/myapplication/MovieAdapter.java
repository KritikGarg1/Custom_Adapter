package com.example.roshni.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MovieAdapter extends ArrayAdapter<movie>
{
    private Context mContext;
    private List<movie> moviesList = new ArrayList<>();

    public MovieAdapter(Context context, ArrayList<movie> list)
    {
        super(context, 0 , list);
        mContext = context;
        moviesList = list;
    }
    public View getView(int position,View convertView, ViewGroup parent)
    {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_layout,parent,false);

        movie currentMovie = moviesList.get(position);

        ImageView image = (ImageView)listItem.findViewById(R.id.imageView_poster);
        image.setImageResource(currentMovie.getmImageDrawable());

        TextView name = (TextView) listItem.findViewById(R.id.textView_name);
        name.setText(currentMovie.getmName());

        TextView release = (TextView) listItem.findViewById(R.id.textView_release);
        release.setText(currentMovie.getmRelease());

        Button pre=(Button)listItem.findViewById(R.id.presnt);
        pre.setText(currentMovie.getmpresent());

        Button abs=(Button)listItem.findViewById(R.id.presnt);
        abs.setText(currentMovie.getmabsent());
        return listItem;
    }
}
