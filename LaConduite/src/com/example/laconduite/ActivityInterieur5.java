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

public class ActivityInterieur5 extends  Activity {
	RadioGroup rGroupInterieur5;
	RadioButton buttonInterieur51,buttonInterieur52;
	Chronometer ChronometerI5;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_interieur5);



		
		
		rGroupInterieur5 = (RadioGroup) findViewById(R.id.radioGroupInterieur5);
		ChronometerI5 = (Chronometer) findViewById(R.id.chronometerI5);
		ChronometerI5.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonInterieur51 = new RadioButton(this);
		buttonInterieur51.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupInterieur5.addView(buttonInterieur51);
		 
		 buttonInterieur52 = new RadioButton(this);
		buttonInterieur52.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupInterieur5.addView(buttonInterieur52);
		 
		
		 
		rGroupInterieur5.check(buttonInterieur51.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityInterieur5.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderInterieur5(View v) 
	
	{ buttonInterieur52.setTextColor(Color.BLUE);
	
	 rGroupInterieur5.check(buttonInterieur52.getId()) ;
	 ChronometerI5.stop();
	}	
	
	
	
	
}
