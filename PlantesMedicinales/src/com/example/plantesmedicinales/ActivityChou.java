package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityChou extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chou);

		WebView webViewverAildesOur = (WebView)findViewById(R.id.webViewChou);
		webViewverAildesOur.loadUrl("file:///android_asset/MauxQuotidienhtml/chou.html");

	}

}
