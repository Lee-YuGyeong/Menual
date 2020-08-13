package com.example.manual;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {

    TextView textView;

    ArrayList<ListData> items = new ArrayList<>();

    public ListAdapter(){

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
        view = inflater.inflate(R.layout.activity_list_data,viewGroup,false);

        textView = view.findViewById(R.id.title);

        ListData listData = items.get(i);

        textView.setText(listData.getTitle());

        return view;
    }

    public void addData(String title){
        ListData item = new ListData();

        item.setTitle(title);

        items.add(item);
    }
}
