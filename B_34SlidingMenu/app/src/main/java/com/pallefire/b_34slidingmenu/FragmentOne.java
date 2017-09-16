package com.pallefire.b_34slidingmenu;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {
    ImageView imageView;
    Integer[] myImages={R.drawable.n,R.drawable.m,R.drawable.o,};


    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_fragment_one, container, false);
        imageView = (ImageView) v.findViewById(R.id.image1);

        //2:get position coming from activity
        Bundle bundle =getArguments();
        int pos=bundle.getInt("pos");
        //3:based on the positon apply image on the imageview
        imageView.setImageResource(myImages[pos]);
        return v;
    }

}
