package com.example.mohamed.tourguideapp.data;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mohamed.tourguideapp.R;

import java.util.List;

public class DataModelAdapter extends ArrayAdapter<DataModel> {
    public DataModelAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<DataModel> data) {
        super(context, resource, data);
    }

    private static class ViewHolder {
        TextView title;
        ImageView image;
        TextView description;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder holder = new ViewHolder();
        DataModel currentDataModel = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            holder.title = (TextView) convertView.findViewById(R.id.title);
            holder.image = (ImageView) convertView.findViewById(R.id.image);
            holder.description = (TextView) convertView.findViewById(R.id.description);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.title.setText(currentDataModel.getmTitle());
        holder.image.setImageResource(currentDataModel.getmImageResourceId());
        holder.description.setText(currentDataModel.getmDescription());
        return convertView;
    }
}
