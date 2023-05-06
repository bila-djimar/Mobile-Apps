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

public class ActivityTheme23 extends  Activity {
	RadioGroup rGroupTheme23;
	RadioButton buttonTheme231,buttonTheme232,buttonTheme233;
	Chronometer Chronometer23;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme23);


		rGroupTheme23 = (RadioGroup) findViewById(R.id.radioGroupTheme23);
        Chronometer23 = (Chronometer) findViewById(R.id.chronometer23);
		
		Chronometer23.start();
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonTheme231 = new RadioButton(this);
		buttonTheme231.setText("0,50 m....................................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme23.addView(buttonTheme231);
		 
		 buttonTheme232 = new RadioButton(this);
		buttonTheme232.setText("1 m.........................................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme23.addView(buttonTheme232);
		 
		 buttonTheme233 = new RadioButton(this);
		 buttonTheme233.setText("1,50 m....................................(C)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupTheme23.addView(buttonTheme233);
		 
		
		
		
		
		
		
		rGroupTheme23.check(buttonTheme231.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityTheme23.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderTheme23(View v) 
	
	{ 
	
	
	 
	
	 buttonTheme233.setTextColor(Color.BLUE);
	
	 rGroupTheme23.check(buttonTheme233.getId()) ; 
	 Chronometer23.stop();
	 
	}	
	
	
	
	
}
