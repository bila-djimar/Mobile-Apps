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

public class ActivityAssr15 extends  Activity {
	RadioGroup rGroupAssr15;
	RadioButton buttonAssr151,buttonAssr152,buttonAssr153,buttonAssr154;
	Chronometer ChronometerASSR15;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_assr15);

		  
		
	
		
		
		rGroupAssr15 = (RadioGroup) findViewById(R.id.radioGroupAssr15);
		ChronometerASSR15 = (Chronometer) findViewById(R.id.chronometerASR15);
		ChronometerASSR15.start();
		
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonAssr151 = new RadioButton(this);
		buttonAssr151.setText("Klaxonner...................................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupAssr15.addView(buttonAssr151);
		 
		 buttonAssr152 = new RadioButton(this);
		buttonAssr152.setText("La dépasser par la gauche.........(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupAssr15.addView(buttonAssr152);
		 
		 buttonAssr153 = new RadioButton(this);
		 buttonAssr153.setText("La dépasser par la droite............(C)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupAssr15.addView(buttonAssr153);
		 
		
		
		 buttonAssr154 = new RadioButton(this);
		 buttonAssr154.setText("Aucune réponse..........................(D)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupAssr15.addView(buttonAssr154);
		
		
		
		rGroupAssr15.check(buttonAssr151.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityAssr15.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderAssr15(View v) 
	
	{ 
	
	
	 
	
	 buttonAssr154.setTextColor(Color.BLUE);
	
	 rGroupAssr15.check(buttonAssr154.getId()) ;
	 
	 ChronometerASSR15.stop();
	}	
	
	
	
	
}
