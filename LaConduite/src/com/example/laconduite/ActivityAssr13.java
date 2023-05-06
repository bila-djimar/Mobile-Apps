package com.example.laconduite;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ActivityAssr13 extends  Activity {
	RadioGroup rGroupAssr13;
	CheckBox buttonAssr131,buttonAssr132,buttonAssr133;
	Chronometer ChronometerASSR13;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_assr13);


		rGroupAssr13 = (RadioGroup) findViewById(R.id.radioGroupAssr13);
		ChronometerASSR13 = (Chronometer) findViewById(R.id.chronometerASR13);
		ChronometerASSR13.start();
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonAssr131 = new CheckBox(this);
		buttonAssr131.setText("Commet une infraction.................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupAssr13.addView(buttonAssr131);
		 
		 buttonAssr132 = new CheckBox(this);
		buttonAssr132.setText("Met autrui en danger....................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupAssr13.addView(buttonAssr132);
		 
		 buttonAssr133 = new CheckBox(this);
		 buttonAssr133.setText("Se met lui-même en danger.........(C)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupAssr13.addView(buttonAssr133);
		 
		rGroupAssr13.check(buttonAssr131.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityAssr13.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderAssr13(View v) 
	
	{ 
	
	
	 buttonAssr131.setTextColor(Color.BLUE);
		
	 rGroupAssr13.check(buttonAssr131.getId());
	 
	 
	 buttonAssr132.setTextColor(Color.BLUE);
		
	 rGroupAssr13.check(buttonAssr132.getId()) ;
	
	 buttonAssr133.setTextColor(Color.BLUE);
	
	 rGroupAssr13.check(buttonAssr133.getId()) ;
	 ChronometerASSR13.stop();
	 
	}	
	
	
	
	
}
