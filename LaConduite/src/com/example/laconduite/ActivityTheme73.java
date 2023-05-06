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

public class ActivityTheme73 extends  Activity {
	RadioGroup rGroupTheme73;
	RadioButton buttonTheme731,buttonTheme732;
	Chronometer Chronometer73;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme73);



rGroupTheme73 = (RadioGroup) findViewById(R.id.radioGroupTheme73);
		
        Chronometer73 = (Chronometer) findViewById(R.id.chronometer73);
		
		Chronometer73.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonTheme731 = new RadioButton(this);
		buttonTheme731.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme73.addView(buttonTheme731);
		 
		 buttonTheme732 = new RadioButton(this);
		buttonTheme732.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme73.addView(buttonTheme732);
		 
		
		 
		rGroupTheme73.check(buttonTheme731.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityTheme73.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderTheme73(View v) 
	
	{ buttonTheme731.setTextColor(Color.BLUE);
	
	 rGroupTheme73.check(buttonTheme731.getId()) ;
	 
	 Chronometer73.stop();
	}	
	
	
	
	
}
