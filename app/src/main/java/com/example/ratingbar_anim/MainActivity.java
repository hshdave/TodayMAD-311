package com.example.ratingbar_anim;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //RatingBar rt ;
    ImageView img_round;
    //TextView txt_rates;

    Button btn_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //rt = findViewById(R.id.ratbar_star);
        img_round = findViewById(R.id.img_anim);
       // txt_rates = findViewById(R.id.txt_rate);
        View v = img_round;

        btn_go = findViewById(R.id.btn_go);

        btn_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Main2Activity.class);
                ActivityOptions options;

               // options = ActivityOptions.makeCustomAnimation(MainActivity.this,R.anim.slide_in,R.anim.slide_out);
               // options = ActivityOptions.makeScaleUpAnimation(v,0,0,v.getWidth(),v.getHeight());
                options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,img_round,"img_round");


                startActivity(i,options.toBundle());
            }
        });

   /*     ObjectAnimator animation = ObjectAnimator.ofFloat(v,"translationY",100f);
        animation.setDuration(3000);
        animation.setRepeatCount(ValueAnimator.INFINITE);
      //  animation.setInterpolator(new AccelerateDecelerateInterpolator());
        animation.start();
*/
     //   ObjectAnimator anim = ObjectAnimator.ofFloat(img_round,"rotationX",0.0f,360f);

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
