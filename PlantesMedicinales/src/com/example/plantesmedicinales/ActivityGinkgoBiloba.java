package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityGinkgoBiloba extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ginkgo_biloba);



		WebView webViewGinkgoBiloba = (WebView)findViewById(R.id.webViewGinkgoBiloba);
		webViewGinkgoBiloba.loadUrl("file:///android_asset/MauxEsprithtm/Ginkgobiloba.html");
		
		
	}

}
