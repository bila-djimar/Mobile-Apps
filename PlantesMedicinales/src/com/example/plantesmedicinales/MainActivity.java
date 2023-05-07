package com.example.plantesmedicinales;



import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TextView;

public class MainActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Resources res = getResources();
		TabHost tabHost = getTabHost();
		
		
		TabHost.TabSpec spec;
		Intent intent;

		
		intent = new Intent().setClass(this, ActivityPhytotherapieList.class);
		spec = tabHost.newTabSpec("Form").setIndicator("Phytothérapie",null).setContent(intent);
			
		tabHost.addTab(spec);	
		
		
		
		intent = new Intent().setClass(this, ActivityBeautePeauList.class);
		spec = tabHost.newTabSpec("Form").setIndicator("Phytothérapie et beauté de la peau",null).setContent(intent);
			
		tabHost.addTab(spec);	
		
		 tabHost.getTabWidget().setBackgroundColor(Color.RED);
			for(int i=0; i < tabHost.getTabWidget().getChildCount();i++)
				{//--la couleur du font des onglet
				tabHost.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#FAB000"));
				//-----la coleur de l'ecriture des onglet
				TextView tv = (TextView) tabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title); //Unselected Tabs
	            tv.setTextColor(Color.parseColor("#130C9E"));
	           
	           
	            
	            
				}
			
			
			
			tabHost.setCurrentTab(0);
		
		
		}

	}
