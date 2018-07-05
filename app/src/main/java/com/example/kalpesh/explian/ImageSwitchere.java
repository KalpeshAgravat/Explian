package com.example.kalpesh.explian;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class ImageSwitchere extends AppCompatActivity{
    ImageSwitcher imageSwitcher;
    Button nextButton;
    int imageSwitcherImages[] ={R.drawable.c,R.drawable.b,R.drawable.close,R.drawable.dog,R.drawable.doga,R.drawable.e,R.drawable.lion};
    int switcherImageLength = imageSwitcherImages.length;
    int counter = -1;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_switcher);
    imageSwitcher = (ImageSwitcher)findViewById(R.id.imageSwitcher);
    nextButton = (Button) findViewById(R.id.buttonNext);

    imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
        @Override
        public View makeView() {
            ImageView switcherImageView = new ImageView(getApplicationContext());
            switcherImageView.setLayoutParams(new ImageSwitcher.LayoutParams(
                    ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT
            ));
            switcherImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            switcherImageView.setImageResource(R.drawable.hadoop);
            //switcherImageView.setMaxHeight(100);
            return switcherImageView;
        }
    });

    Animation aniOut = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);
    Animation aniIn = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);

    imageSwitcher.setOutAnimation(aniOut);
    imageSwitcher.setInAnimation(aniIn);

    nextButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            counter++;
            if (counter == switcherImageLength){
                counter = 0;
                imageSwitcher.setImageResource(imageSwitcherImages[counter]);
            }
            else{
                imageSwitcher.setImageResource(imageSwitcherImages[counter]);
            }
        }
    });
}
}
