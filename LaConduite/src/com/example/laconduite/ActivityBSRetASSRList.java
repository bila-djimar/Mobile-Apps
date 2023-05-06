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

public class ActivityBSRetASSRList extends  Activity {
	ListView listViewBSRlist=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bsret_assrlist);

		listViewBSRlist = (ListView) findViewById(R.id.listViewBSRetASSRlist);

		
		//Création de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemASSRList = new ArrayList<HashMap<String, String>>();
 
        //On déclare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestElementASSR;
 
       
        //Création d'une HashMap pour insérer les informations du premier item de notre listView
        mapTestElementASSR = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        mapTestElementASSR.put("titre", "BSR");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        mapTestElementASSR.put("description", " Test brevet de sécurité routière");
        //on insère la référence à l'image (convertit en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
      
        mapTestElementASSR.put("img", String.valueOf(R.drawable.bsr));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemASSRList.add(mapTestElementASSR); 
        
        
  
        mapTestElementASSR = new HashMap<String, String>();
        mapTestElementASSR.put("titre", "ASSR1");
        mapTestElementASSR.put("description", " Séléctionner une série ASSR1");
        mapTestElementASSR.put("img", String.valueOf(R.drawable.asr1));
        listItemASSRList.add(mapTestElementASSR);	
		
		
        mapTestElementASSR = new HashMap<String, String>();
        mapTestElementASSR.put("titre", "ASSR2");
        mapTestElementASSR.put("description", " Séléctionner une série ASSR2");
        mapTestElementASSR.put("img", String.valueOf(R.drawable.asr2));
        listItemASSRList.add(mapTestElementASSR);
        
        
        
      //Création d'un SimpleAdapter qui se chargera de mettre les items présent dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mScheduleTestSerie = new SimpleAdapter (this.getBaseContext(), listItemASSRList, R.layout.affichageitem,
               new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
 
        //On attribut à notre listView l'adapter que l'on vient de créer
        listViewBSRlist.setAdapter(mScheduleTestSerie);
		
        listViewBSRlist.setOnItemClickListener(new OnItemClickListener() {
			@Override
        	@SuppressWarnings("unchecked")
         	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				//on récupère la HashMap contenant les infos de notre item (titre, description, img)
        		HashMap<String, String> map = (HashMap<String, String>) listViewBSRlist.getItemAtPosition(position);


        		switch (position) {
                case 0:
                	
                   
            		        
            		   	Intent IntentSerie1 = new Intent(ActivityBSRetASSRList.this,ActivityBSRlist.class);
            		  	startActivity(IntentSerie1);	
            		  	 break;
            		  	 
            		  	 
                case 1:
                	
                    
    		        
        		   	Intent IntentSerie2 = new Intent(ActivityBSRetASSRList.this,ActivityASSR1List.class);
        		  	startActivity(IntentSerie2);	
        		  	 break;   
        		  	 
        		  	 
                 case 2:
                	
                    
    		        
        		   	Intent IntentSerie3 = new Intent(ActivityBSRetASSRList.this,ActivityASSR2List.class);
        		  	startActivity(IntentSerie3);	
        		  	 break;   
                    
}
                
                
          		
          	}

        		
        		
        		
        		
        		
        		
        	
         });
		
	}

}
