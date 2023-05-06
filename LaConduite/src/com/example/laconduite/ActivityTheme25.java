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

public class ActivityTheme25 extends  Activity {
	RadioGroup rGroupTheme25;
	RadioButton buttonTheme251,buttonTheme252;
	Chronometer Chronometer25;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme25);



		
		rGroupTheme25 = (RadioGroup) findViewById(R.id.radioGroupTheme25);
        Chronometer25 = (Chronometer) findViewById(R.id.chronometer25);
		
		Chronometer25.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonTheme251 = new RadioButton(this);
		buttonTheme251.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme25.addView(buttonTheme251);
		 
		 buttonTheme252 = new RadioButton(this);
		buttonTheme252.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme25.addView(buttonTheme252);
		 
		
		 
		rGroupTheme25.check(buttonTheme251.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityTheme25.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderTheme25(View v) 
	
	{ buttonTheme251.setTextColor(Color.BLUE);
	
	 rGroupTheme25.check(buttonTheme251.getId()) ;
	 Chronometer25.stop();
	 
	}	
	
	
	
	
}
