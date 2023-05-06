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

public class ActivityTheme32 extends  Activity {
	RadioGroup rGroupTheme32;
	RadioButton buttonTheme321,buttonTheme322;
	Chronometer Chronometer32;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme32);



		rGroupTheme32 = (RadioGroup) findViewById(R.id.radioGroupTheme32);
		
         Chronometer32 = (Chronometer) findViewById(R.id.chronometer32);
		
		Chronometer32.start();
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonTheme321 = new RadioButton(this);
		buttonTheme321.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme32.addView(buttonTheme321);
		 
		 buttonTheme322 = new RadioButton(this);
		buttonTheme322.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme32.addView(buttonTheme322);
		 
		
		 
		rGroupTheme32.check(buttonTheme321.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityTheme32.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderTheme32(View v) 
	
	{ buttonTheme322.setTextColor(Color.BLUE);
	
	 rGroupTheme32.check(buttonTheme322.getId()) ;
	 Chronometer32.stop();
	}	
	
	
	
	
}
