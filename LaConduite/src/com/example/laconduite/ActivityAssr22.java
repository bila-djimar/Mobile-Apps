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

public class ActivityAssr22 extends  Activity {
	RadioGroup rGroupAssr22;
	RadioButton buttonAssr221,buttonAssr222,buttonAssr223;
	Chronometer ChronometerASSR22;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_assr22);
		


		
		
		rGroupAssr22 = (RadioGroup) findViewById(R.id.radioGroupAssr22);
		ChronometerASSR22 = (Chronometer) findViewById(R.id.chronometerASR22);
		ChronometerASSR22.start();
		
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonAssr221 = new RadioButton(this);
		buttonAssr221.setText("Doit ralentir..................................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupAssr22.addView(buttonAssr221);
		 
		 buttonAssr222 = new RadioButton(this);
		buttonAssr222.setText("Passe avant la voiture noir...........(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupAssr22.addView(buttonAssr222);
		 
		 buttonAssr223 = new RadioButton(this);
		 buttonAssr223.setText("Passe avant le cycliste.................(C)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupAssr22.addView(buttonAssr223);
		 
		
		
		
		
		
		
		rGroupAssr22.check(buttonAssr221.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityAssr22.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderAssr22(View v) 
	
	{ 
	
	
	 buttonAssr221.setTextColor(Color.BLUE);
		
	 rGroupAssr22.check(buttonAssr221.getId()) ;
	 
	 
	 buttonAssr222.setTextColor(Color.BLUE);
		
	 rGroupAssr22.check(buttonAssr222.getId()) ;
	 
	 
	 buttonAssr223.setTextColor(Color.BLUE);
		
	 rGroupAssr22.check(buttonAssr223.getId()) ;
	 
	 ChronometerASSR22.stop();
	
	
	}	
	
	
	
	
}
