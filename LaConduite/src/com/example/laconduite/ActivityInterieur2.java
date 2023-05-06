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

public class ActivityInterieur2 extends  Activity {

	
	RadioGroup rGroupInterieur2;
	RadioButton buttonInterieur21,buttonInterieur22;
	Chronometer ChronometerI2;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_interieur2);



		rGroupInterieur2 = (RadioGroup) findViewById(R.id.radioGroupInterieur2);
		
		ChronometerI2 = (Chronometer) findViewById(R.id.chronometerI2);
		ChronometerI2.start();
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonInterieur21 = new RadioButton(this);
		buttonInterieur21.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupInterieur2.addView(buttonInterieur21);
		 
		 buttonInterieur22 = new RadioButton(this);
		buttonInterieur22.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupInterieur2.addView(buttonInterieur22);
		 
		
		 
		rGroupInterieur2.check(buttonInterieur21.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityInterieur2.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderInterieur2(View v) 
	
	{ buttonInterieur22.setTextColor(Color.BLUE);
	
	 rGroupInterieur2.check(buttonInterieur22.getId()) ;
	 ChronometerI2.stop();
	}	
	
	
	
	
}
