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

public class ActivityTheme95 extends  Activity {
	RadioGroup rGroupTheme951,rGroupTheme952;
	RadioButton buttonTheme951,buttonTheme952,buttonTheme953,buttonTheme954;
	Chronometer Chronometer95;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme95);



		
		
		
		
		
		rGroupTheme951 = (RadioGroup) findViewById(R.id.radioGroupTheme951);
		rGroupTheme952 = (RadioGroup) findViewById(R.id.radioGroupTheme952);
		
		Chronometer95 = (Chronometer) findViewById(R.id.chronometer95);
		//Chronometer2 = (Chronometer) findViewById(R.id.chronometer2);
		//Button45 = (Button) findViewById(R.id.ValiderTheme45);
		Chronometer95.start();
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		buttonTheme951 = new RadioButton(this);
		buttonTheme951.setText("Oui........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme951.addView(buttonTheme951);
		 
		 buttonTheme952 = new RadioButton(this);
		 buttonTheme952.setText("Non ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme951.addView(buttonTheme952);
		 
		
		 
		rGroupTheme951.check(buttonTheme951.getId()) ;
		
		
		buttonTheme953 = new RadioButton(this);
		buttonTheme953.setText("Oui........................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme952.addView(buttonTheme953);
		 
		 buttonTheme954 = new RadioButton(this);
		 buttonTheme954.setText("Non ......................(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme952.addView(buttonTheme954);
		 
		
		 
		rGroupTheme952.check(buttonTheme953.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivityTheme95.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderTheme95(View v) 
		
		{ buttonTheme951.setTextColor(Color.BLUE);
		
		 rGroupTheme951.check(buttonTheme951.getId()) ;
		 
		 
		 
		 buttonTheme953.setTextColor(Color.BLUE);
			
		 rGroupTheme952.check(buttonTheme953.getId()) ;
		 
		 Chronometer95.stop();
		}	
		
		
		
		
	}
