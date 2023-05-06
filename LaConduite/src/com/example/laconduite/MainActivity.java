package com.example.laconduite;



import android.annotation.SuppressLint;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TextView;

@SuppressLint("NewApi")
public class MainActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);



		
		Resources res = getResources();
		TabHost tabHost = getTabHost();
		
		
		TabHost.TabSpec spec;
		Intent intent;
		
		
		
		
		
		
		
		intent = new Intent().setClass(this, ActivityPanneauxConduiteList.class);
		spec = tabHost.newTabSpec("Widget").setIndicator("Fiches panneaux",null).setContent(intent);
		
		//tabHost.addTab(spec);
		
		tabHost.setScrollY(tabHost.getWidth());
		tabHost.addTab(spec);
		
		
		intent = new Intent().setClass(this, Activitycreneau.class);
		spec = tabHost.newTabSpec("Form").setIndicator("Auto-Créneau",null).setContent(intent);
			
		tabHost.addTab(spec);
		
	//	intent = new Intent().setClass(this, ActivityQuestionOralesList.class);
	//	spec = tabHost.newTabSpec("Form").setIndicator("Vérification de véhicule",null).setContent(intent);
		
		//tabHost.setScrollX(tabHost.getWidth());
///		tabHost.addTab(spec);
		
		
		intent = new Intent().setClass(this, ActivityTestList.class);
		spec = tabHost.newTabSpec("Form").setIndicator("Tests",null).setContent(intent);
		
		//tabHost.setScrollX(tabHost.getWidth());
		tabHost.addTab(spec);
		
		
	//	intent = new Intent().setClass(this, ActivityBSRetASSRList.class);
	//	spec = tabHost.newTabSpec("Form").setIndicator("BSR & ASSR",null).setContent(intent);
		
		//tabHost.setScrollX(tabHost.getWidth());
	//	tabHost.addTab(spec);
		
		
		
		
		
	    intent = new Intent().setClass(this, ActivityPointConduiteList.class);
		spec = tabHost.newTabSpec("Form").setIndicator("Décompte des Points",null).setContent(intent);
		
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
