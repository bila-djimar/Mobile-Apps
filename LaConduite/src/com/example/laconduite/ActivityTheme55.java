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

public class ActivityTheme55 extends  Activity {
	RadioGroup rGroupTheme55;
	RadioButton buttonTheme551,buttonTheme552;
	Chronometer ChronometerVisibility5;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme55);



		
		
		rGroupTheme55 = (RadioGroup) findViewById(R.id.radioGroupTheme55);
		
		ChronometerVisibility5 = (Chronometer) findViewById(R.id.chronometerVisibility5);
		
		ChronometerVisibility5.start();
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonTheme551 = new RadioButton(this);
		buttonTheme551.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme55.addView(buttonTheme551);
		 
		 buttonTheme552 = new RadioButton(this);
		buttonTheme552.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme55.addView(buttonTheme552);
		 
		
		 
		rGroupTheme55.check(buttonTheme551.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityTheme55.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderTheme55(View v) 
	
	{ buttonTheme551.setTextColor(Color.BLUE);
	
	 rGroupTheme55.check(buttonTheme551.getId()) ;
	 ChronometerVisibility5.stop();
	}	
	
	
	
	
}
