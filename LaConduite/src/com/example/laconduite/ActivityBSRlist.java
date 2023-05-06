package com.example.laconduite;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class ActivityBSRlist extends  Activity {
	ListView listViewBSRTestSerie=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bsrlist);


listViewBSRTestSerie = (ListView) findViewById(R.id.listViewBSRlist);

		
		
		//Création de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemBSRSerieTest = new ArrayList<HashMap<String, String>>();
 
        //On déclare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestSerieBSR;
 
       
        //Création d'une HashMap pour insérer les informations du premier item de notre listView
        mapTestSerieBSR = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        mapTestSerieBSR.put("titre", "Série 1");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        mapTestSerieBSR.put("description", " Commencer la Série 1");
        //on insère la référence à l'image (convertit en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
      
        mapTestSerieBSR.put("img", String.valueOf(R.drawable.serie1));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemBSRSerieTest.add(mapTestSerieBSR); 
        
        
  
       
        
      //Création d'un SimpleAdapter qui se chargera de mettre les items présent dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mScheduleTestSerie = new SimpleAdapter (this.getBaseContext(), listItemBSRSerieTest, R.layout.affichageitem,
               new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
 
        //On attribut à notre listView l'adapter que l'on vient de créer
        listViewBSRTestSerie.setAdapter(mScheduleTestSerie);
        
        listViewBSRTestSerie.setOnItemClickListener(new OnItemClickListener() {
			@Override
        	@SuppressWarnings("unchecked")
         	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				//on récupère la HashMap contenant les infos de notre item (titre, description, img)
        		HashMap<String, String> map = (HashMap<String, String>) listViewBSRTestSerie.getItemAtPosition(position);


        		switch (position) {
                case 0:
                	
                   
            		        
            		   	Intent IntentSerie1 = new Intent(ActivityBSRlist.this,ActivityBSR1.class);
            		  	startActivity(IntentSerie1);	
            		  	 break;
            		  	 
            		  	 
              
}
                
                
          		
          	}

        		
        		
        		
        		
        		
        		
        	
         });
	     		  	
            		  	
            		  	
	}

}

             