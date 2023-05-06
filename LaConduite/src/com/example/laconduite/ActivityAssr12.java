package com.example.laconduite;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.os.Build;

public class ActivityAssr12 extends  Activity {
	RadioGroup rGroupAssr12;
	RadioButton buttonAssr121,buttonAssr122;
	Chronometer ChronometerASSR12;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_assr12);


		rGroupAssr12 = (RadioGroup) findViewById(R.id.radioGroupAssr12);
		ChronometerASSR12 = (Chronometer) findViewById(R.id.chronometerASR12);
		ChronometerASSR12.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonAssr121 = new RadioButton(this);
		buttonAssr121.setText("Le cyclomoteur..................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupAssr12.addView(buttonAssr121);
		 
		 buttonAssr122 = new RadioButton(this);
		buttonAssr122.setText("La voiture ..........................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupAssr12.addView(buttonAssr122);
		 
		
		 
		rGroupAssr12.check(buttonAssr121.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityAssr12.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderAssr12(View v) 
	
	{ buttonAssr122.setTextColor(Color.BLUE);
	
	 rGroupAssr12.check(buttonAssr122.getId()) ;
	 
	 ChronometerASSR12.stop();
	}	
	
	
	
	
}
