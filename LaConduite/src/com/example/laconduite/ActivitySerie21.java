package com.example.laconduite;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
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

public class ActivitySerie21 extends  Activity {
	RadioGroup rGroupSerie21;
	RadioButton buttonSerie211,buttonSerie212;
	
	Chronometer ChronometerS21;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie21);


		rGroupSerie21 = (RadioGroup) findViewById(R.id.radioGroupSerie21);
		
		ChronometerS21 = (Chronometer) findViewById(R.id.chronometerS21);
		ChronometerS21.start();
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie211 = new RadioButton(this);
		buttonSerie211.setText("Je m'arrête ...........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie21.addView(buttonSerie211);
		 
		 buttonSerie212 = new RadioButton(this);
		buttonSerie212.setText("Je passe ..............................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie21.addView(buttonSerie212);
		 
		
		 
		rGroupSerie21.check(buttonSerie211.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie21.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie21(View v) 
	
	{ buttonSerie212.setTextColor(Color.BLUE);
	
	 rGroupSerie21.check(buttonSerie212.getId()) ;
	 
	 ChronometerS21.stop();
	}	
	
	
	
	
public void QuitterSerie21(View v) 

{ Intent IntentQuitterSerie21 = new Intent(ActivitySerie21.this,MainActivity.class);
	startActivity(IntentQuitterSerie21);
}	
	

public void SuivanteSerie21(View v) 

{ Intent IntentSuivanteSerie21 = new Intent(ActivitySerie21.this,ActivitySerie22.class);
  startActivity(IntentSuivanteSerie21);
}	

}

