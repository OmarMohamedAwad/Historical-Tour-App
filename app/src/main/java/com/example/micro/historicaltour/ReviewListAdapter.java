/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.micro.historicaltour;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.micro.historicaltour.Classes.classes.reviewClass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class ReviewListAdapter extends ArrayAdapter {

    ArrayList<reviewClass> Reviews;

    public ReviewListAdapter(Context context, ArrayList<reviewClass> reviews) {
        super(context, 0);
        Reviews=reviews;

    }
    @Override
    public int getCount() {
        return Reviews.size();
    }

    @Override
    public Object getItem(int i) {
        return Reviews.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        reviewClass currentReview = Reviews.get(position);

        View view = convertView;

        ReviewPlaceHolder placeHolder ;


        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(
                    R.layout.coments_ratting, parent, false);
            placeHolder = new ReviewPlaceHolder(view);
            view.setTag(placeHolder);

        }
        else {
            placeHolder = (ReviewPlaceHolder) view.getTag();
        }


        placeHolder.usernameTextview.setText(currentReview.getUserClass().getUserName());
        placeHolder.DataTextview.setText(GetDate(currentReview.getDate()));
        placeHolder.commentTextview.setText(currentReview.getReviewComment());
        placeHolder.ratingBar.setRating(currentReview.getRating());



            return view;

        }

    public String GetDate(Date date){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        return  df.format(date);
    }



    public class ReviewPlaceHolder{

        TextView usernameTextview;
        TextView commentTextview;
        TextView DataTextview;
        RatingBar ratingBar;

        public ReviewPlaceHolder(View view){

            usernameTextview=view.findViewById(R.id.usernameTextview);
            commentTextview=view.findViewById(R.id.commentTextview);
            DataTextview=view.findViewById(R.id.dateTextview);
            ratingBar =view.findViewById(R.id.ratingBar);

        }
    }


}


