package com.example.listviewinterface.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.listviewinterface.Model.Country;
import com.example.listviewinterface.R;

import java.util.ArrayList;

public class CountryAdapter extends BaseAdapter {
    Activity activity;
    ArrayList<Country> data;

    public CountryAdapter(Activity activity, ArrayList<Country> data) {
        this.activity = activity;
        this.data = data;
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return data.get(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View root = view;
        root = LayoutInflater.from(activity).inflate(R.layout.row_design,null,false);

        final TextView tvName = root.findViewById(R.id.tvName);
        final TextView tvPop = root.findViewById(R.id.tvPop);
        final TextView tvArea = root.findViewById(R.id.tvArea);
        final ImageView ivFlag = root.findViewById(R.id.ivFlag);

        tvName.setText(data.get(position).getTvName());
        tvPop.setText(data.get(position).getTvPop());
        tvArea.setText(data.get(position).getTvArea());
        ivFlag.setImageResource(data.get(position).getIvFlag());

        return root;
    }
}
