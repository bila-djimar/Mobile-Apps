package com.example.laconduite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityPassageNiveau extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_passage_niveau);


		WebView webViewverPassageNiveau = (WebView)findViewById(R.id.webViewPassageNiveau);
        webViewverPassageNiveau.loadUrl("file:///android_asset/panneauxhtml/PassageNiveau.html");
		
		
	}

}
