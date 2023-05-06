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

public class ActivityTheme35 extends  Activity {
	RadioGroup rGroupTheme35;
	RadioButton buttonTheme351,buttonTheme352;
	Chronometer Chronometer35;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme35);



		rGroupTheme35 = (RadioGroup) findViewById(R.id.radioGroupTheme35);
		
       Chronometer35 = (Chronometer) findViewById(R.id.chronometer35);
		
		Chronometer35.start();
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonTheme351 = new RadioButton(this);
		buttonTheme351.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme35.addView(buttonTheme351);
		 
		 buttonTheme352 = new RadioButton(this);
		buttonTheme352.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme35.addView(buttonTheme352);
		 
		
		 
		rGroupTheme35.check(buttonTheme351.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityTheme35.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderTheme35(View v) 
	
	{ buttonTheme352.setTextColor(Color.BLUE);
	
	 rGroupTheme35.check(buttonTheme352.getId()) ;
	 
	 Chronometer35.stop();
	}	
	
	
	
	
}
