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

public class ActivitySerie34 extends  Activity {
	RadioGroup rGroupSerie34;
	RadioButton buttonSerie341,buttonSerie342,buttonSerie343;
	Chronometer ChronometerS34;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie34);



		rGroupSerie34 = (RadioGroup) findViewById(R.id.radioGroupSerie34);
		ChronometerS34 = (Chronometer) findViewById(R.id.chronometerS34);
		ChronometerS34.start();
		
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie341 = new RadioButton(this);
		buttonSerie341.setText("En feux de position seuls ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie34.addView(buttonSerie341);
		 
		 buttonSerie342 = new RadioButton(this);
		buttonSerie342.setText("En feux de croisement ............................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie34.addView(buttonSerie342);
		 
		 buttonSerie343 = new RadioButton(this);
		buttonSerie343.setText("En feux de route.......................................(C)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupSerie34.addView(buttonSerie343);
		 
		rGroupSerie34.check(buttonSerie341.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie34.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie34(View v) 
	
	{ buttonSerie342.setTextColor(Color.BLUE);
	
	 rGroupSerie34.check(buttonSerie342.getId()) ;
	 
	 ChronometerS34.stop();
	}	
	
	
public void QuitterSerie34(View v) 

{ Intent IntentQuitterSerie34 = new Intent(ActivitySerie34.this,MainActivity.class);
	startActivity(IntentQuitterSerie34);
}	
	

public void SuivanteSerie34(View v) 

{Intent IntentSuivanteSerie34 = new Intent(ActivitySerie34.this,ActivitySerie35.class);
 startActivity(IntentSuivanteSerie34);}	

}
