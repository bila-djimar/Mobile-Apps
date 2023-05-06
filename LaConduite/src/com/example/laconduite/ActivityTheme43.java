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

public class ActivityTheme43 extends  Activity {
	RadioGroup rGroupTheme43;
	RadioButton buttonTheme431,buttonTheme432;
	Chronometer ChronometerPriority3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme43);



		
		rGroupTheme43 = (RadioGroup) findViewById(R.id.radioGroupTheme43);
		
		ChronometerPriority3 = (Chronometer) findViewById(R.id.chronometerPriority3);
		ChronometerPriority3.start();
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonTheme431 = new RadioButton(this);
		buttonTheme431.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme43.addView(buttonTheme431);
		 
		 buttonTheme432 = new RadioButton(this);
		buttonTheme432.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme43.addView(buttonTheme432);
		 
		
		 
		rGroupTheme43.check(buttonTheme431.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityTheme43.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderTheme43(View v) 
	
	{ buttonTheme432.setTextColor(Color.BLUE);
	
	 rGroupTheme43.check(buttonTheme432.getId()) ;
	 ChronometerPriority3.stop();
	}	
	
	
	
	
}
