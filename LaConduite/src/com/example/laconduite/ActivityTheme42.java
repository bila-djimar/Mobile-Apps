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

public class ActivityTheme42 extends  Activity {
	RadioGroup rGroupTheme42;
	RadioButton buttonTheme421,buttonTheme422;
	Chronometer ChronometerPriority2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme42);



		rGroupTheme42 = (RadioGroup) findViewById(R.id.radioGroupTheme42);
		
		ChronometerPriority2 = (Chronometer) findViewById(R.id.chronometerPriority2);
		ChronometerPriority2.start();
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonTheme421 = new RadioButton(this);
		buttonTheme421.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme42.addView(buttonTheme421);
		 
		 buttonTheme422 = new RadioButton(this);
		buttonTheme422.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme42.addView(buttonTheme422);
		 
		
		 
		rGroupTheme42.check(buttonTheme421.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityTheme42.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderTheme42(View v) 
	
	{ buttonTheme421.setTextColor(Color.BLUE);
	
	 rGroupTheme42.check(buttonTheme421.getId()) ;
	 ChronometerPriority2.stop();
	}	
	
	
	
	
}
