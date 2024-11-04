package com.example.javaviewpager2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OnBoardingFragmentViewPagerModel implements Serializable {

    private String title;
    private int imageView;

    public OnBoardingFragmentViewPagerModel(String title, int imageView) {
        this.title = title;
        this.imageView = imageView;
    }

    public static List<OnBoardingFragmentViewPagerModel> viewPagerList = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public int getImageView() {
        return imageView;
    }

    static {
        viewPagerList.add(new OnBoardingFragmentViewPagerModel("О,спорт - ты жизнь!", R.drawable.ski));
        viewPagerList.add(new OnBoardingFragmentViewPagerModel("Быстрее!Выше!Сильнее!", R.drawable.sky));
        viewPagerList.add(new OnBoardingFragmentViewPagerModel("В здоровом теле - здоровый дух!", R.drawable.hokkey));
    }
}


