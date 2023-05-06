package com.example.laconduite;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ActivityInterieur1 extends  Activity {

	
	RadioGroup rGroupInterieur1;
	RadioButton buttonInterieur11,buttonInterieur12,buttonInterieur13,buttonInterieur14;
	Chronometer ChronometerI1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_interieur1);



		rGroupInterieur1 = (RadioGroup) findViewById(R.id.radioGroupInterieur1);
		ChronometerI1 = (Chronometer) findViewById(R.id.chronometerI1);
		ChronometerI1.start();
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonInterieur11 = new RadioButton(this);
		buttonInterieur11.setText("N°1............(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupInterieur1.addView(buttonInterieur11);
		 
		 buttonInterieur12 = new RadioButton(this);
		buttonInterieur12.setText("N°2............(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupInterieur1.addView(buttonInterieur12);
		 
		 buttonInterieur13 = new RadioButton(this);
		 buttonInterieur13.setText("N°3............(C)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupInterieur1.addView(buttonInterieur13);
		 
		
		
		 buttonInterieur14 = new RadioButton(this);
		 buttonInterieur14.setText("N°4............(D)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupInterieur1.addView(buttonInterieur14);
		
		
		
		rGroupInterieur1.check(buttonInterieur11.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityInterieur1.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderInterieur1(View v) 
	
	{ 
	
	
	 
	
	 buttonInterieur14.setTextColor(Color.BLUE);
	
	 rGroupInterieur1.check(buttonInterieur14.getId());
	 ChronometerI1.stop();
	}	
	
	
	
	
}
