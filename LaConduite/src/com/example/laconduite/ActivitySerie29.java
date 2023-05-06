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

public class ActivitySerie29 extends  Activity {
	RadioGroup rGroupSerie29;
	RadioButton buttonSerie291,buttonSerie292;
	Chronometer ChronometerS29;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie29);


		rGroupSerie29 = (RadioGroup) findViewById(R.id.radioGroupSerie29);
		ChronometerS29 = (Chronometer) findViewById(R.id.chronometerS29);
		ChronometerS29.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie291 = new RadioButton(this);
		buttonSerie291.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie29.addView(buttonSerie291);
		 
		 buttonSerie292 = new RadioButton(this);
		buttonSerie292.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie29.addView(buttonSerie292);
		 
		
		 
		rGroupSerie29.check(buttonSerie291.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie29.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie29(View v) 
	
	{ buttonSerie292.setTextColor(Color.BLUE);
	
	 rGroupSerie29.check(buttonSerie292.getId()) ;
	 
	 
	 ChronometerS29.stop();
	}	
	
	
	
public void QuitterSerie29(View v) 

{ Intent IntentQuitterSerie29 = new Intent(ActivitySerie29.this,MainActivity.class);
	startActivity(IntentQuitterSerie29);
}	
	

public void SuivanteSerie29(View v) 

{ Intent IntentSuivanteSerie29 = new Intent(ActivitySerie29.this,ActivitySerie30.class);
  startActivity(IntentSuivanteSerie29);
}	

}
