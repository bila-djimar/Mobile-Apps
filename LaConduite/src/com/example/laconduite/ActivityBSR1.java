package com.example.laconduite;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ActivityBSR1 extends  Activity {
	RadioGroup rGroupBSR1;
	RadioButton buttonBSR11,buttonBSR12,buttonBSR13;
	Chronometer ChronometerBSR;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bsr1);



		
		
		
		rGroupBSR1 = (RadioGroup) findViewById(R.id.radioGroupBSR1);
		ChronometerBSR = (Chronometer) findViewById(R.id.chronometerBSR);
		ChronometerBSR.start();
		
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonBSR11 = new RadioButton(this);
		buttonBSR11.setText("Moins élevé que si je circulais en voiture.(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupBSR1.addView(buttonBSR11);
		 
		 buttonBSR12 = new RadioButton(this);
		buttonBSR12.setText("Aussi élevé que si je circulais en voiture..(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupBSR1.addView(buttonBSR12);
		 
		 buttonBSR13 = new RadioButton(this);
		 buttonBSR13.setText("Plus élevé que si je circulais en voiture....(C)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupBSR1.addView(buttonBSR13);
		 
		rGroupBSR1.check(buttonBSR11.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityBSR1.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderBSR1(View v) 
	
	{ buttonBSR13.setTextColor(Color.BLUE);
	
	 rGroupBSR1.check(buttonBSR13.getId()) ;
	 ChronometerBSR.stop();
	 
	 
	}	
	
	
	
	
}
