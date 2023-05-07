package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityHoublon extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_houblon);

		
		
		WebView webViewHoublon = (WebView)findViewById(R.id.webViewHoublon);
		webViewHoublon.loadUrl("file:///android_asset/MauxEsprithtm/Houblon.html");
		
		
		
	}

}
