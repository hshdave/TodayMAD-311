package com.example.ratingbar_anim;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //RatingBar rt ;
    ImageView img_round;
    TextView txt_rates;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //rt = findViewById(R.id.ratbar_star);
        img_round = findViewById(R.id.img_anim);
        txt_rates = findViewById(R.id.txt_rate);


      /*  View v = img_round;

        ObjectAnimator animation = ObjectAnimator.ofFloat(v,"rotationX",0.0f,360f);
        animation.setDuration(3000);
        animation.setRepeatCount(ValueAnimator.INFINITE);
        animation.setInterpolator(new AccelerateDecelerateInterpolator());
        animation.start();

*/
        ObjectAnimator anim = ObjectAnimator.ofFloat(img_round,"rotationX",0.0f,360f);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotation);
        animation.setDuration(3000);
        img_round.setAnimation(animation);


/*

        rt.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                txt_rates.setText("My Rates :"+rt.getRating());
            }
        });
*/

    }
}
