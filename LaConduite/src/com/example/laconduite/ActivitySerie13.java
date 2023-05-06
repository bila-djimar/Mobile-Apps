package com.example.laconduite;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ActivitySerie13 extends Activity {
	RadioGroup rGroupSerie13;
	RadioButton buttonSerie131,buttonSerie132;
	Chronometer ChronometerS13;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie13);

		rGroupSerie13 = (RadioGroup) findViewById(R.id.radioGroupSerie13);
		ChronometerS13 = (Chronometer) findViewById(R.id.chronometerS13);
		ChronometerS13.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie131 = new RadioButton(this);
		buttonSerie131.setText("Oui ..........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie13.addView(buttonSerie131);
		 
		 buttonSerie132 = new RadioButton(this);
		buttonSerie132.setText("Non .........................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie13.addView(buttonSerie132);
		 
		
		 
		rGroupSerie13.check(buttonSerie131.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie13.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie13(View v) 
	
	{ buttonSerie131.setTextColor(Color.BLUE);
	
	 rGroupSerie13.check(buttonSerie131.getId()) ;
	 
	 
	 ChronometerS13.stop();
	}	
	
	
	
	
public void QuitterSerie13(View v) 

{ Intent IntentQuitterSerie13 = new Intent(ActivitySerie13.this,MainActivity.class);
	startActivity(IntentQuitterSerie13);
}	
	

public void SuivanteSerie13(View v) 

{ Intent IntentSuivanteSerie13 = new Intent(ActivitySerie13.this,ActivitySerie14.class);
  startActivity(IntentSuivanteSerie13);
}	

}
