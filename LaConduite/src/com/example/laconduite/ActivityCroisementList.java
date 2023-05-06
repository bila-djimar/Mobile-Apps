package com.example.laconduite;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.AdapterView.OnItemClickListener;

public class ActivityCroisementList extends  Activity {
	ListView listViewCroisementTestSerie=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_croisement_list);


		listViewCroisementTestSerie = (ListView) findViewById(R.id.listViewCroisement);

		
		
		//Création de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemCroisementSerieTest = new ArrayList<HashMap<String, String>>();
 
        //On déclare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestSerieCroisement;
 
       
        //Création d'une HashMap pour insérer les informations du premier item de notre listView
        mapTestSerieCroisement = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        mapTestSerieCroisement.put("titre", "Série 1");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        mapTestSerieCroisement.put("description", " Commencer la Série 1");
        //on insère la référence à l'image (convertit en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
      
        mapTestSerieCroisement.put("img", String.valueOf(R.drawable.serie1));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemCroisementSerieTest.add(mapTestSerieCroisement); 
        
        
  
        mapTestSerieCroisement = new HashMap<String, String>();
        mapTestSerieCroisement.put("titre", "Série 2");
        mapTestSerieCroisement.put("description", " Commencer la Série 2");
        mapTestSerieCroisement.put("img", String.valueOf(R.drawable.serie2));
        listItemCroisementSerieTest.add(mapTestSerieCroisement);  
        
        
        mapTestSerieCroisement = new HashMap<String, String>();
        mapTestSerieCroisement.put("titre", "Série 3");
        mapTestSerieCroisement.put("description", " Commencer la Série 3");
        mapTestSerieCroisement.put("img", String.valueOf(R.drawable.serie3));
        listItemCroisementSerieTest.add(mapTestSerieCroisement);  
        
        
        mapTestSerieCroisement = new HashMap<String, String>();
        mapTestSerieCroisement.put("titre", "Série 4");
        mapTestSerieCroisement.put("description", " Commencer la Série 4");
        mapTestSerieCroisement.put("img", String.valueOf(R.drawable.serie4));
        listItemCroisementSerieTest.add(mapTestSerieCroisement);  
        
        
        mapTestSerieCroisement = new HashMap<String, String>();
        mapTestSerieCroisement.put("titre", "Série 5");
        mapTestSerieCroisement.put("description", " Commencer la Série 5");
        mapTestSerieCroisement.put("img", String.valueOf(R.drawable.serie5));
        listItemCroisementSerieTest.add(mapTestSerieCroisement); 
        
        
        
        
      //Création d'un SimpleAdapter qui se chargera de mettre les items présent dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mScheduleTestStationnementSerie = new SimpleAdapter (this.getBaseContext(), listItemCroisementSerieTest, R.layout.affichageitem,
               new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
 
        //On attribut à notre listView l'adapter que l'on vient de créer
        listViewCroisementTestSerie.setAdapter(mScheduleTestStationnementSerie);
        
        listViewCroisementTestSerie.setOnItemClickListener(new OnItemClickListener() {
			@Override
        	@SuppressWarnings("unchecked")
         	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				//on récupère la HashMap contenant les infos de notre item (titre, description, img)
        		HashMap<String, String> map = (HashMap<String, String>) listViewCroisementTestSerie.getItemAtPosition(position);


        		switch (position) {
                case 0:
                	
                   
            		        
            		   	Intent IntentStationnementSerie1 = new Intent(ActivityCroisementList.this,ActivityTheme21.class);
            		  	startActivity(IntentStationnementSerie1);	
            		  	 break;
            		  	 
            		  	 
                case 1:
                	
                    
    		        
        		   	Intent IntentStationnementSerie2 = new Intent(ActivityCroisementList.this,ActivityTheme22.class);
        		  	startActivity(IntentStationnementSerie2);	
        		  	 break;   
                    
            		  	
        		  	 
        		  	 
                case 2:
                	
                    
    		        
        		   	Intent IntentStationnementSerie3 = new Intent(ActivityCroisementList.this,ActivityTheme23.class);
        		  	startActivity(IntentStationnementSerie3);	
        		  	 break;
        		  	 
        		  	 
        		  	 
                case 3:
                	
                    
    		        
        		   	Intent IntentStationnementSerie4 = new Intent(ActivityCroisementList.this,ActivityTheme24.class);
        		  	startActivity(IntentStationnementSerie4);	
        		  	 break;
        		  	 
        		  	 
        		  	 
                  case 4:
                	
                    
    		        
        		   	Intent IntentStationnementSerie5 = new Intent(ActivityCroisementList.this,ActivityTheme25.class);
        		  	startActivity(IntentStationnementSerie5);	
        		  	 break; 
}
                
                
          		
          	}

        		
        		
        		
        		
        		
        		
        	
         });
	     		  	
            		  	
            		  	
	}

}

             