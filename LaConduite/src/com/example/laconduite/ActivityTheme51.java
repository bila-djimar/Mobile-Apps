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

public class ActivityTheme51 extends  Activity {
	RadioGroup rGroupthem5;
	RadioButton buttonthem51,buttonthem52;
	Chronometer ChronometerVisibility1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme51);

		rGroupthem5 = (RadioGroup) findViewById(R.id.radioGroupThem5);
		
		ChronometerVisibility1 = (Chronometer) findViewById(R.id.chronometerVisibility1);
		//Chronometer2 = (Chronometer) findViewById(R.id.chronometer2);
		//Button45 = (Button) findViewById(R.id.ValiderTheme45);
		ChronometerVisibility1.start();
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonthem51 = new RadioButton(this);
		buttonthem51.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupthem5.addView(buttonthem51);
		 
		 buttonthem52 = new RadioButton(this);
		buttonthem52.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupthem5.addView(buttonthem52);
		 
		
		 
		rGroupthem5.check(buttonthem51.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityTheme51.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderThem5(View v) 
	
	{ buttonthem52.setTextColor(Color.BLUE);
	
	 rGroupthem5.check(buttonthem52.getId());
	 ChronometerVisibility1.stop();
	}	
	
	
	
	
}
