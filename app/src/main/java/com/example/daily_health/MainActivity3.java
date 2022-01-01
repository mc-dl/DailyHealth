package com.example.daily_health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private int humanType=0;

    public void sethumanType(int h) {
        humanType=h;
    }

    public int gethumanType() {
        return humanType;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Bundle bundle = getIntent().getExtras();
        sethumanType(bundle.getInt("human"));
        Human human = new Human(this,gethumanType());
        int r=human.randomHuman();
        //String[] name=getResources().getStringArray(R.array.name);
        //String[] intro=getResources().getStringArray(R.array.intro);
        TextView tv1=findViewById(R.id.textView);
        TextView tv2=findViewById(R.id.textView3);
        tv1.setText(human.getName(r));
        tv2.setText(human.getIntro(r));
        //TypedArray prodImg= getResources().obtainTypedArray(R.array.pic);
        ImageView tv3=findViewById(R.id.imageView);
        //tv3.setImageResource(prodImg.getResourceId(val,0));
        //prodImg.recycle();
        tv3.setImageResource(human.getImg(r));
//        int[] test=getResources().getIntArray(R.array.test);
    }

    public void retu(View view) {
        finish();

    }

//    public void test(View view) {
//        Bundle bundle = getIntent().getExtras();
//        sethumanType(bundle.getInt("human"));
//        TextView tvTest=findViewById(R.id.test);
//        tvTest.setText(Integer.toString(human));
//    }

    public static void openActivity(Context context,int who) {
        Intent intent=new Intent(context,MainActivity3.class);
        intent.putExtra("human",who);
        context.startActivity(intent);
    }
}