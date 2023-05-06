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

public class ActivityTheme34 extends  Activity {
	RadioGroup rGroupTheme34;
	RadioButton buttonTheme341,buttonTheme342;
	Chronometer Chronometer34;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme34);



		rGroupTheme34 = (RadioGroup) findViewById(R.id.radioGroupTheme34);
        Chronometer34 = (Chronometer) findViewById(R.id.chronometer34);
		
		Chronometer34.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonTheme341 = new RadioButton(this);
		buttonTheme341.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme34.addView(buttonTheme341);
		 
		 buttonTheme342 = new RadioButton(this);
		buttonTheme342.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme34.addView(buttonTheme342);
		 
		
		 
		rGroupTheme34.check(buttonTheme341.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityTheme34.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderTheme34(View v) 
	
	{ buttonTheme341.setTextColor(Color.BLUE);
	
	 rGroupTheme34.check(buttonTheme341.getId()) ;
	 
	 Chronometer34.stop();
	}	
	
	
	
	
}
