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

public class ActivityTheme82 extends  Activity {
	RadioGroup rGroupTheme82;
	RadioButton buttonTheme821,buttonTheme822;
	Chronometer Chronometer82;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme82);


       rGroupTheme82 = (RadioGroup) findViewById(R.id.radioGroupTheme82);
		
        Chronometer82 = (Chronometer) findViewById(R.id.chronometer82);
		
		Chronometer82.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonTheme821 = new RadioButton(this);
		buttonTheme821.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme82.addView(buttonTheme821);
		 
		 buttonTheme822 = new RadioButton(this);
		buttonTheme822.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme82.addView(buttonTheme822);
		 
		
		 
		rGroupTheme82.check(buttonTheme821.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityTheme82.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderTheme82(View v) 
	
	{ buttonTheme822.setTextColor(Color.BLUE);
	
	 rGroupTheme82.check(buttonTheme822.getId()) ;
	 
	 Chronometer82.stop();
	}	
	
	
	
	
}
