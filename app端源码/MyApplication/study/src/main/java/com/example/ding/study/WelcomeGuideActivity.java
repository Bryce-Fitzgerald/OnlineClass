package com.example.ding.study;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class WelcomeGuideActivity extends Activity {

    private Button btn_welcome_guide;
    private ViewPager pager_show_photos;

    //装载3个viewPager滑动的页面
    private List<View> list;

    void initViews(){
        btn_welcome_guide = (Button)findViewById(R.id.btn_welcome_guide);
        pager_show_photos = (ViewPager)findViewById(R.id.pager_show_photos);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_guide);
        initViews();
        //初始化viewPager
        initViewPager();
        initListener();
    }

    void initListener(){
        btn_welcome_guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //页面的跳转:跳转到主界面
                startActivity(new Intent(getBaseContext(), MainActivity.class));
                finish();

            }
        });
    }


    //初始化ViewPager的方法
    public void initViewPager() {

        list = new ArrayList<View>();
        //第一张图片
        ImageView imageView1 = new ImageView(this);
        imageView1.setImageResource(R.mipmap.welcome_guide_01);
        list.add(imageView1);

        //第二张图片
        ImageView imageView2 = new ImageView(this);
        imageView2.setImageResource(R.mipmap.welcome_guide_02);
        list.add(imageView2);

        //第三张图片
        ImageView imageView3 = new ImageView(this);
        imageView3.setImageResource(R.mipmap.welcome_guide_03);
        list.add(imageView3);

        //为pager设置适配器
        pager_show_photos.setAdapter(new WelcomeGuidePagerAdapter());

        //设置监听者，监听ViewPager滑动效果
        pager_show_photos.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                //当滑到最后一张图片时，将隐藏的点击进入按钮显示
                if (position == 2) {
                    btn_welcome_guide.setVisibility(View.VISIBLE);
                } else {
                    btn_welcome_guide.setVisibility(View.GONE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    //定义ViewPager的适配器
    class WelcomeGuidePagerAdapter extends PagerAdapter {

        //item的数量
        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        //初始化item实例的方法
        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(list.get(position));
            return list.get(position);
        }

        //item销毁的方法
        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(list.get(position));
        }
    }

}
