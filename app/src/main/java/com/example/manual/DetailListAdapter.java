package com.example.manual;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailListAdapter extends BaseAdapter {

    TextView textView;

    ArrayList<DetailListData> items = new ArrayList<>();

    public DetailListAdapter(){

    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.activity_detail_list_data,viewGroup,false);

        textView = view.findViewById(R.id.title);

        DetailListData detailListData = items.get(i);

        textView.setText(detailListData.getTitle());

        ImageView imageView;
        imageView = view.findViewById(R.id.image);
        imageView.setImageDrawable(detailListData.getImage());

        return view;
    }

    public void addData(String title, Drawable image){
        DetailListData item = new DetailListData();

        item.setTitle(title);
        item.setImage(image);

        items.add(item);
    }
}
