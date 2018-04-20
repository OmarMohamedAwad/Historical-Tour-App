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
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<Word> {
    private int backgrouncolor;


    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.coments_ratting, parent, false);
        }
        Word currentWord = getItem(position);
      TextView date = (TextView) listItemView.findViewById(R.id.textView2date);

       date.setText(currentWord.getMiwokTranslation());

        TextView comment = (TextView) listItemView.findViewById(R.id.textView3comment);

        comment.setText(currentWord.getComment());

       TextView header = (TextView) listItemView.findViewById(R.id.textViewhead);
        header.setText(currentWord.getDefaultTranslation());

            //View textcontainer= listItemView.findViewById(R.id.text_container);
            // int color = ContextCompat.getColor(getContext(),backgrouncolor);
            //textcontainer.setBackgroundColor(color);
            //layout.setBackgroundColor(color);
            return listItemView;
        }
    }
