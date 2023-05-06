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

public class ActivitySerie17 extends  Activity {
	RadioGroup rGroupSerie171,rGroupSerie172;
	RadioButton buttonSerie171,buttonSerie172,buttonSerie173,buttonSerie174;
	Chronometer ChronometerS17;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie17);


		rGroupSerie171 = (RadioGroup) findViewById(R.id.radioGroupSerie171);
		rGroupSerie172 = (RadioGroup) findViewById(R.id.radioGroupSerie172);
		ChronometerS17 = (Chronometer) findViewById(R.id.chronometerS17);
		ChronometerS17.start();
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		buttonSerie171 = new RadioButton(this);
		buttonSerie171.setText("Oui........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie171.addView(buttonSerie171);
		 
		 buttonSerie172 = new RadioButton(this);
		 buttonSerie172.setText("Non ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie171.addView(buttonSerie172);
		 
		
		 
		rGroupSerie171.check(buttonSerie171.getId()) ;
		
		
		buttonSerie173 = new RadioButton(this);
		buttonSerie173.setText("Oui........................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie172.addView(buttonSerie173);
		 
		 buttonSerie174 = new RadioButton(this);
		 buttonSerie174.setText("Non ......................(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie172.addView(buttonSerie174);
		 
		
		 
		rGroupSerie172.check(buttonSerie173.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivitySerie17.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderSerie17(View v) 
		
		{ buttonSerie171.setTextColor(Color.BLUE);
		
		 rGroupSerie171.check(buttonSerie171.getId()) ;
		 
		 
		 
		 buttonSerie174.setTextColor(Color.BLUE);
			
		 rGroupSerie172.check(buttonSerie174.getId()) ;
		 ChronometerS17.stop();
		}	
		
		
		
		
	public void QuitterSerie17(View v) 

	{ Intent IntentQuitterSerie17 = new Intent(ActivitySerie17.this,MainActivity.class);
		startActivity(IntentQuitterSerie17);
	}	
		

	public void SuivanteSerie17(View v) 

	{ Intent IntentSuivanteSerie17 = new Intent(ActivitySerie17.this,ActivitySerie18.class);
	  startActivity(IntentSuivanteSerie17);
	}	

	}
