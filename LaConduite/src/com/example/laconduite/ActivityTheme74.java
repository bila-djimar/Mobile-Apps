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

public class ActivityTheme74 extends  Activity {
	RadioGroup rGroupTheme741,rGroupTheme742;
	RadioButton buttonTheme741,buttonTheme742,buttonTheme743,buttonTheme744;
	Chronometer Chronometer74;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme74);



		
		
		rGroupTheme741 = (RadioGroup) findViewById(R.id.radioGroupTheme741);
		rGroupTheme742 = (RadioGroup) findViewById(R.id.radioGroupTheme742);
		
        Chronometer74 = (Chronometer) findViewById(R.id.chronometer74);
		
		Chronometer74.start();
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		buttonTheme741 = new RadioButton(this);
		buttonTheme741.setText("Oui........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme741.addView(buttonTheme741);
		 
		 buttonTheme742 = new RadioButton(this);
		 buttonTheme742.setText("Non ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme741.addView(buttonTheme742);
		 
		
		 
		rGroupTheme741.check(buttonTheme741.getId()) ;
		
		
		buttonTheme743 = new RadioButton(this);
		buttonTheme743.setText("Oui........................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme742.addView(buttonTheme743);
		 
		 buttonTheme744 = new RadioButton(this);
		 buttonTheme744.setText("Non ......................(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme742.addView(buttonTheme744);
		 
		
		 
		rGroupTheme742.check(buttonTheme743.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivityTheme74.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderTheme74(View v) 
		
		{ buttonTheme741.setTextColor(Color.BLUE);
		
		 rGroupTheme741.check(buttonTheme741.getId()) ;
		 
		 
		 
		 buttonTheme744.setTextColor(Color.BLUE);
			
		 rGroupTheme742.check(buttonTheme744.getId()) ;
		 
		 
		 Chronometer74.stop();
		}	
		
		
		
		
	}
