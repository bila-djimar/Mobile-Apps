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

public class ActivityExterieur5 extends  Activity {
	RadioGroup rGroupExterieur5;
	RadioButton buttonExterieur51,buttonExterieur52,buttonExterieur53;
	Chronometer ChronometerEX5;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_exterieur5);



		
		
		rGroupExterieur5 = (RadioGroup) findViewById(R.id.radioGroupExterieur5);
        ChronometerEX5 = (Chronometer) findViewById(R.id.chronometerE5);
		
		ChronometerEX5.start();
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonExterieur51 = new RadioButton(this);
		buttonExterieur51.setText("En cas de chute de neige...........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupExterieur5.addView(buttonExterieur51);
		 
		 buttonExterieur52 = new RadioButton(this);
		buttonExterieur52.setText("Lorsque le ciel est simplement couvert.....(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupExterieur5.addView(buttonExterieur52);
		 
		 buttonExterieur53 = new RadioButton(this);
		 buttonExterieur53.setText("En cas de forte pluie..................................(C)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupExterieur5.addView(buttonExterieur53);
		 
		
		
		
		
		
		
		rGroupExterieur5.check(buttonExterieur51.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityExterieur5.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderExterieur5(View v) 
	
	{ 
	
	 buttonExterieur51.setTextColor(Color.BLUE);
		
	 rGroupExterieur5.check(buttonExterieur51.getId()) ;
	 
	
	 buttonExterieur53.setTextColor(Color.BLUE);
	
	 rGroupExterieur5.check(buttonExterieur53.getId()) ;
	 ChronometerEX5.stop();
	}	
	
	
	
	
}
