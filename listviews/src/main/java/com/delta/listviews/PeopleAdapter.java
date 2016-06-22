package com.delta.listviews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by brandyjames on 6/22/16.
 */
public class PeopleAdapter extends ArrayAdapter<People> {

    Context mContext;
    int mLayoutResourceId;
    Place mData[] = null;

    public PeopleAdapter(Context context, int resource, Place[] data) {
        super(context, resource, data);
        this.mContext = context;
        this.mLayoutResourceId = resource;
        this.mData = data;
    }

    @Override
    public People getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        row = inflater.inflate(mLayoutResourceId,parent,false);

        if (mGender == female)
            rowView.setBackgroundColor(android.color.pink);
        else
            rowView.setBackgroundColor(android.color.blue;)




        TextView nameView = (TextView) row.findViewById(R.id.nameTextView);
        TextView zipView = (TextView) row.findViewById(R.id.zipcodeTextView);
        ImageView imageView = (ImageView) row.findViewById(R.id.imageView);



        People people = mData[position];


        nameView.setText(people.mName);
        numberView.setText(String.valueOf(people.mPhoneNumber));

        int resId = mContext.getResources().getIdentifier(people.mImage,"drawable",mContext.getPackageName());
        imageView.setImageResource(resId);


        return row;






    }
}


