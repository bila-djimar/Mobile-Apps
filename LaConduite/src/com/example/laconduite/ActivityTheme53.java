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

public class ActivityTheme53 extends  Activity {
	RadioGroup rGroupTheme53;
	RadioButton buttonTheme531,buttonTheme532;
	Chronometer ChronometerVisibility3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme53);



		
		rGroupTheme53 = (RadioGroup) findViewById(R.id.radioGroupTheme53);
		
		ChronometerVisibility3 = (Chronometer) findViewById(R.id.chronometerVisibility3);
		//Chronometer2 = (Chronometer) findViewById(R.id.chronometer2);
		//Button45 = (Button) findViewById(R.id.ValiderTheme45);
		ChronometerVisibility3.start();
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonTheme531 = new RadioButton(this);
		buttonTheme531.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme53.addView(buttonTheme531);
		 
		 buttonTheme532 = new RadioButton(this);
		buttonTheme532.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme53.addView(buttonTheme532);
		 
		
		 
		rGroupTheme53.check(buttonTheme531.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityTheme53.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderTheme53(View v) 
	
	{ buttonTheme531.setTextColor(Color.BLUE);
	
	 rGroupTheme53.check(buttonTheme531.getId()) ;
	 
	 ChronometerVisibility3.stop();
	}	
	
	
	
	
}
