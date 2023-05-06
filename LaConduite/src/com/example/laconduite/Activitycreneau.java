package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Activitycreneau extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activitycreneau);



		WebView webViewverCreneau4 = (WebView)findViewById(R.id.webViewc4);
		webViewverCreneau4.loadUrl("file:///android_asset/creneau_html/creneau.html");
		
		
	}}
