package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityNoisetier extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_noisetier);



		WebView webViewverNoisetier = (WebView)findViewById(R.id.webViewNoisetier);
		webViewverNoisetier.loadUrl("file:///android_asset/minceurhtml/Konjac.html");
		
	}

}
