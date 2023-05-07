package com.example.animation;



import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends  Activity {
	private Button  Buttonscale,Buttonscale3;
	private ImageView  imageview1,imageview2,imageview3,imageview4,
	                    imageview5,imageview6,imageview7,imageview8;
	//private boolean ok;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		imageview1=(ImageView)findViewById(R.id.imgage);
		imageview2=(ImageView)findViewById(R.id.ImageView05);
		imageview3=(ImageView)findViewById(R.id.imgage5);
		imageview4=(ImageView)findViewById(R.id.ImageView01);
		imageview5=(ImageView)findViewById(R.id.ImageView02);
		imageview6=(ImageView)findViewById(R.id.ImageView03);
		imageview7=(ImageView)findViewById(R.id.imgage2);
		imageview8=(ImageView)findViewById(R.id.ImageView04);
		
		imageview1.setVisibility(View.INVISIBLE);
		imageview2.setVisibility(View.VISIBLE);
		imageview3.setVisibility(View.INVISIBLE);
		imageview4.setVisibility(View.INVISIBLE);
		imageview5.setVisibility(View.INVISIBLE);
		imageview6.setVisibility(View.INVISIBLE);
		imageview7.setVisibility(View.INVISIBLE);
		imageview8.setVisibility(View.INVISIBLE);
		
		Buttonscale = (Button) this.findViewById(R.id.button1);
	
		Buttonscale3 = (Button) this.findViewById(R.id.button3);
		
		
		
        imageview1.clearAnimation();
        imageview2.clearAnimation();
		

			
	/*	Animation scaleAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_anima);
		
		imageview1.startAnimation(scaleAnimation);
		
		
		
       Animation scaleAnimation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha_anima);
		
		imageview2.startAnimation(scaleAnimation1);
		
		
		
		
		
		int top=10;
		int left=70;
		int bottom=100;
		int right= -10;
		
		TranslateAnimation  translateanimation   = new TranslateAnimation(left, right, top, bottom);
	
		translateanimation.setDuration(4000);
		translateanimation.setRepeatCount(0);
		translateanimation.setInterpolator(new AccelerateDecelerateInterpolator());
		imageview2.startAnimation(translateanimation);*/
	}
	
	
	
	
	public void doScale (View view){
	
		
		
		
		
		imageview1.clearAnimation();
		Animation scaleAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_anima);
		imageview1.startAnimation(scaleAnimation);
		
		
		imageview3.clearAnimation();
		Animation scaleAnimation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_anima1);
		imageview3.startAnimation(scaleAnimation2);
		
		
		
		
		
		
		
		
		
		
		imageview2.clearAnimation();
		Animation scaleAnimation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_anima);
		imageview2.startAnimation(scaleAnimation1);
		
		imageview4.clearAnimation();
		Animation scaleAnimation4 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_anima);
		imageview2.startAnimation(scaleAnimation4);
		
		imageview5.clearAnimation();
		Animation scaleAnimation5 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_anima);
		imageview2.startAnimation(scaleAnimation5);
		
		imageview6.clearAnimation();
		Animation scaleAnimation6 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_anima);
		imageview2.startAnimation(scaleAnimation6);
		
		
		
		imageview7.clearAnimation();
		Animation scaleAnimation7 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_anima);
		imageview2.startAnimation(scaleAnimation7);
		
		
		
		imageview8.clearAnimation();
		Animation scaleAnimation8 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_anima);
		imageview2.startAnimation(scaleAnimation8);
		
		
		
		
		imageview1.setVisibility(View.VISIBLE);
		imageview2.setVisibility(View.VISIBLE);
		imageview3.setVisibility(View.INVISIBLE);
		
		imageview4.setVisibility(View.VISIBLE);
		imageview5.setVisibility(View.VISIBLE);
		imageview6.setVisibility(View.VISIBLE);
		imageview7.setVisibility(View.VISIBLE);
		imageview8.setVisibility(View.VISIBLE);
		
	}

public void doScale3 (View view){
	
		
		
		
		
	imageview1.clearAnimation();
	Animation scaleAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_anima1);
	imageview1.startAnimation(scaleAnimation);
	
	
	imageview3.clearAnimation();
	Animation scaleAnimation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_anima);
	imageview3.startAnimation(scaleAnimation2);
	
	
	
	
	imageview2.clearAnimation();
	
	

	
	Animation scaleAnimation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_anima1);
	imageview2.startAnimation(scaleAnimation1);
	
	
	
	
	
	imageview4.clearAnimation();
	Animation scaleAnimation4 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_anima1);
	imageview2.startAnimation(scaleAnimation4);
	
	imageview5.clearAnimation();
	Animation scaleAnimation5 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_anima1);
	imageview2.startAnimation(scaleAnimation5);
	
	imageview6.clearAnimation();
	Animation scaleAnimation6 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_anima1);
	imageview2.startAnimation(scaleAnimation6);
	
	
	
	imageview7.clearAnimation();
	Animation scaleAnimation7 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_anima1);
	imageview2.startAnimation(scaleAnimation7);
	
	
	
	imageview8.clearAnimation();
	Animation scaleAnimation8 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_anima1);
	imageview2.startAnimation(scaleAnimation8);
	
	
	
	
	
	
	imageview1.setVisibility(View.INVISIBLE);
	imageview2.setVisibility(View.INVISIBLE);
	
	
	
	imageview3.setVisibility(View.VISIBLE);	
	
	
	imageview4.setVisibility(View.INVISIBLE);
	imageview5.setVisibility(View.INVISIBLE);
	imageview6.setVisibility(View.INVISIBLE);
	imageview7.setVisibility(View.INVISIBLE);
	imageview8.setVisibility(View.INVISIBLE);
	
	
	}
	
	
public void alpha (View view){
	
		
		
		
		
		imageview2.clearAnimation();
		
		

			
		Animation scaleAnimation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha_anima);
		scaleAnimation1.setRepeatCount(3);
		imageview2.startAnimation(scaleAnimation1);
	}

	
	
}
