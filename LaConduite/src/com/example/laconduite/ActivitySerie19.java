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

public class ActivitySerie19 extends  Activity {
	RadioGroup rGroupSerie19;
	RadioButton buttonSerie191,buttonSerie192,buttonSerie193,buttonSerie194;
	Chronometer ChronometerS19;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie19);

		rGroupSerie19 = (RadioGroup) findViewById(R.id.radioGroupSerie19);
		ChronometerS19 = (Chronometer) findViewById(R.id.chronometerS19);
		ChronometerS19.start();
		
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie191 = new RadioButton(this);
		buttonSerie191.setText("Une voie unique ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie19.addView(buttonSerie191);
		 
		 buttonSerie192 = new RadioButton(this);
		buttonSerie192.setText("Un rétrécissement de la chaussée des deux côtés ........................................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie19.addView(buttonSerie192);
		 
		buttonSerie193 = new RadioButton(this);
		buttonSerie193.setText("Une intersection .......................(C)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupSerie19.addView(buttonSerie193);
		
		
		
		buttonSerie194 = new RadioButton(this);
		buttonSerie194.setText("Une déviation temporaire .........(D)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupSerie19.addView(buttonSerie194);
		 
		rGroupSerie19.check(buttonSerie191.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie19.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie19(View v) 
	
	{ buttonSerie192.setTextColor(Color.BLUE);
	
	 rGroupSerie19.check(buttonSerie192.getId()) ;
	 
	 
	 buttonSerie193.setTextColor(Color.BLUE);
		
	 rGroupSerie19.check(buttonSerie193.getId()) ;
	 ChronometerS19.stop();
	 
	 
	 
	}	
	
	
public void QuitterSerie19(View v) 

{ Intent IntentQuitterSerie19 = new Intent(ActivitySerie19.this,MainActivity.class);
	startActivity(IntentQuitterSerie19);
}	
	

public void SuivanteSerie19(View v) 

{ Intent IntentSuivanteSerie19 = new Intent(ActivitySerie19.this,ActivitySerie20.class);
  startActivity(IntentSuivanteSerie19);
}	

}
