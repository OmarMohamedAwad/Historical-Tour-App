package com.example.micro.historicaltour.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.micro.historicaltour.R;
import com.example.micro.historicaltour.Word;
import com.example.micro.historicaltour.WordAdapter;

import java.util.ArrayList;

/**
 * Created by micro on 21/03/2018.
 */

public class rating_fragment extends android.support.v4.app.Fragment {
    View view;
    public rating_fragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.rating_fragment,container,false);


        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Ahmed Mohmed ", "Wednesday, March 21, 2018","Very nice place oh..i realy love this place"));
        words.add(new Word("Omar awad", "Wednesday, March 21, 2018","wow i realy love this place,advice every one to go there "));
        words.add(new Word("Yasser ELnagar", "Wednesday, March 21, 2018","i advice every one to go there,Very nice place oh"));
        words.add(new Word("Mohmed Mkhloof Ahmed", "Wednesday, March 21, 2018","i advice every one to go there,Very nice place oh..i realy love this place"));

        words.add(new Word("Ahmed Mohmed ", "Wednesday, March 21, 2018","Very nice place oh..i realy love this place"));
        words.add(new Word("Omar awad", "Wednesday, March 21, 2018","wow i realy love this place,advice every one to go there "));
        words.add(new Word("Yasser ELnagar", "Wednesday, March 21, 2018","i advice every one to go there,Very nice place oh"));
        words.add(new Word("Mohmed Mkhloof Ahmed", "Wednesday, March 21, 2018","i advice every one to go there,Very nice place oh..i realy love this place"));


        ListView myPhrasesList = (ListView) view.findViewById(R.id.list_of_comments);
        WordAdapter adapter = new WordAdapter(getActivity(),words);
        myPhrasesList.setAdapter(adapter);


        return view;
    }
}
