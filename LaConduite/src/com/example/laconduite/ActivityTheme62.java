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

public class ActivityTheme62 extends  Activity {
	RadioGroup rGroupTheme62;
	RadioButton buttonTheme621,buttonTheme622;
	Chronometer Chronometer62;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme62);


       rGroupTheme62 = (RadioGroup) findViewById(R.id.radioGroupTheme62);
		
        Chronometer62 = (Chronometer) findViewById(R.id.chronometer62);
		
		Chronometer62.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonTheme621 = new RadioButton(this);
		buttonTheme621.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme62.addView(buttonTheme621);
		 
		 buttonTheme622 = new RadioButton(this);
		buttonTheme622.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme62.addView(buttonTheme622);
		 
		
		 
		rGroupTheme62.check(buttonTheme621.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityTheme62.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderTheme62(View v) 
	
	{ buttonTheme622.setTextColor(Color.BLUE);
	
	 rGroupTheme62.check(buttonTheme622.getId()) ;
	 
	 Chronometer62.stop();
	}	
	
	
	
	
}
