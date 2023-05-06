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

public class ActivityTheme81 extends Activity {
	RadioGroup rGroupThem1;
	RadioButton buttonThem11,buttonThem12,buttonThem13,buttonThem14;
	Chronometer Chronometer8;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme81);



		rGroupThem1 = (RadioGroup) findViewById(R.id.radioGroupThem1);
        Chronometer8 = (Chronometer) findViewById(R.id.chronometer81);
		
		Chronometer8.start();
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonThem11 = new RadioButton(this);
		buttonThem11.setText("Une niche de sécurité ............................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupThem1.addView(buttonThem11);
		 
		 buttonThem12 = new RadioButton(this);
		buttonThem12.setText("Un emplacement d'arrêt d'urgence ........(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupThem1.addView(buttonThem12);
		 
		 buttonThem13 = new RadioButton(this);
		 buttonThem13.setText("Une issue de secours ............................(C)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupThem1.addView(buttonThem13);
		
		
		buttonThem14 = new RadioButton(this);
		 buttonThem14.setText("Une cabine téléphonique publique..........(D)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupThem1.addView(buttonThem14);
		 
		rGroupThem1.check(buttonThem11.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityTheme81.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderThem8(View v) 
	
	{ buttonThem11.setTextColor(Color.BLUE);
	
	 rGroupThem1.check(buttonThem11.getId()) ;
	 Chronometer8.stop();
	}	
	
	
	
	
}
