package com.example.daily_health.h;



import android.content.Context;

import android.content.res.TypedArray;


import com.example.daily_health.R;

import java.lang.*;



import java.util.ArrayList;

import java.util.Random;

public class Human {

    private final ArrayList<String> name=new ArrayList<>();
    private final ArrayList<String> intro=new ArrayList<>();
    private final ArrayList<Integer> prodImg=new ArrayList<>();

    public Human(Context context,int Type) {
        getArray(context,Type);
    }
    private void getArray(Context context,int Type) {
        String stringId=context.getResources().getStringArray(R.array.human_type)[Type];

        ArrayList<Integer> id=new ArrayList<>();
        int number=0;
        for (int i=0;i<stringId.length();i++)
        {
            if (stringId.charAt(i)!='?') {
                number = number * 10 + Integer.parseInt(stringId.substring(i,i+1));
            }
            else {
                id.add(number);
                number = 0;
            }
        }

        String[] allName=context.getResources().getStringArray(R.array.name);
        for (int i=0;i<id.size();i++) {
            name.add(allName[id.get(i)]);
        }

        String[] allIntro=context.getResources().getStringArray(R.array.intro);
        for (int i=0;i<id.size();i++) {
            intro.add(allIntro[id.get(i)]);
        }

        TypedArray allProdImg=context.getResources().obtainTypedArray(R.array.pic);
        for (int i=0;i<id.size();i++) {
            prodImg.add(allProdImg.getResourceId(id.get(i),0));
        }
        allProdImg.recycle();
    }

    public int randomHuman() {
        Random r=new Random();
        return r.nextInt(name.size());
    }

    public String getName(int id) {
        return name.get(id);
    }

    public String getIntro(int id) {
        return intro.get(id);
    }

    public int getImg(int id) {
        return prodImg.get(id);
    }

}
