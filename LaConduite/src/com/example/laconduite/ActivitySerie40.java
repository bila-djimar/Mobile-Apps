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

public class ActivitySerie40 extends  Activity {
	RadioGroup rGroupSerie40;
	RadioButton buttonSerie401,buttonSerie402,buttonSerie403,buttonSerie404;
	Chronometer ChronometerS40;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie40);


		rGroupSerie40 = (RadioGroup) findViewById(R.id.radioGroupSerie40);
		ChronometerS40 = (Chronometer) findViewById(R.id.chronometerS40);
		ChronometerS40.start();
		
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie401 = new RadioButton(this);
		buttonSerie401.setText("Un emplacement d'arrêt d'urgence ........(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie40.addView(buttonSerie401);
		 
		 buttonSerie402 = new RadioButton(this);
		buttonSerie402.setText("Une voie de détresse ..............................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie40.addView(buttonSerie402);
		 
		buttonSerie403 = new RadioButton(this);
		buttonSerie403.setText("Un parking autoroutier ...........................(C)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupSerie40.addView(buttonSerie403);
		
		
		
		buttonSerie404 = new RadioButton(this);
		buttonSerie404.setText("Un emplacement réservé aux véhicules de service ...................................................(D)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupSerie40.addView(buttonSerie404);
		 
		rGroupSerie40.check(buttonSerie401.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie40.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie40(View v) 
	
	{ buttonSerie401.setTextColor(Color.BLUE);
	
	 rGroupSerie40.check(buttonSerie401.getId()) ;
	 
	 
	 ChronometerS40.stop();
	 
	 
	 
	}	
	
	
public void QuitterSerie40(View v) 

{ Intent IntentQuitterSerie40 = new Intent(ActivitySerie40.this,MainActivity.class);
	startActivity(IntentQuitterSerie40);
}	
	

public void SuivanteSerie40(View v) 

{Intent IntentSuivanteSerie40 = new Intent(ActivitySerie40.this,ActivitySerie41.class);
 startActivity(IntentSuivanteSerie40);}	

}
