package com.example.dharani.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.dharani.myapplication.adapter.CardItemString;
import com.example.dharani.myapplication.adapter.CardPagerAdapterS;
import com.example.dharani.myapplication.ShadowTransformer;

public class SwipeData extends AppCompatActivity {

    private ViewPager mViewPager;

    private CardPagerAdapterS mCardAdapter;
    private ShadowTransformer mCardShadowTransformer;

    String titlesText [] = {" News 0", " News 1", " News 2", " News 3", " News 4", " News 5",
            " News 6", " News 7", " News 8", " News 9"};
    String  detailsArray [] = {
            "News details radom, Lorem ipsum characters ment for testing of programs and characters or displaying random informations",
            "News table details radom, Lorem ipsum characters ment for testing of programs and characters or displaying random informations",
            "News table details radom, Lorem ipsum characters ment for testing of programs and characters or displaying random informations",
            "News table details radom, Lorem ipsum characters ment for testing of programs and characters or displaying random informations",
            "News table details radom, Lorem ipsum characters ment for testing of programs and characters or displaying random informations",
            "News table details radom, Lorem ipsum characters ment for testing of programs and characters or displaying random informations",
            "News details radom, Lorem ipsum characters ment for testing of programs and characters or displaying random informations",
            "News table details radom, Lorem ipsum characters ment for testing of programs and characters or displaying random informations",
            "News table details radom, Lorem ipsum characters ment for testing of programs and characters or displaying random informations",
            "News table details radom, Lorem ipsum characters ment for testing of programs and characters or displaying random informations",
    };
    private Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_data);


        context = this;


        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        mCardAdapter = new CardPagerAdapterS();


        for (int i=0; i<titlesText.length; i++){

            mCardAdapter.addCardItemS(new CardItemString( titlesText[i], detailsArray[i]));
        }

        mCardShadowTransformer = new ShadowTransformer(mViewPager, mCardAdapter);

        mViewPager.setAdapter(mCardAdapter);
        mViewPager.setPageTransformer(false, mCardShadowTransformer);
        mViewPager.setOffscreenPageLimit(3);

    }
}
