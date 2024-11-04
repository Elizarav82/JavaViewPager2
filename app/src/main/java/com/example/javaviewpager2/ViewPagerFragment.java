package com.example.javaviewpager2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ViewPagerFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_view_pager, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView textView = view.findViewById(R.id.viewPagerTV);
        ImageView viewPagerIV = view.findViewById(R.id.viewPagerIV);

        OnBoardingFragmentViewPagerModel viewPagerItem = null;
        if (getArguments() != null) {
            viewPagerItem = (OnBoardingFragmentViewPagerModel) getArguments().getSerializable("vp");
        }

        if (viewPagerItem != null) {
            textView.setText(viewPagerItem.getTitle());
            viewPagerIV.setImageResource(viewPagerItem.getImageView());
        }
    }
}

