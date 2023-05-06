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

public class ActivityRegleCirculationList extends  Activity {
	ListView listViewRegleCirclationTestSerie=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_regle_circulation_list);

		listViewRegleCirclationTestSerie = (ListView) findViewById(R.id.listViewRegleCirculation);
		
		
		//Création de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemRegleCirclationSerieTest = new ArrayList<HashMap<String, String>>();
 
        //On déclare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestSerieRegleCirclation;
 
       
        //Création d'une HashMap pour insérer les informations du premier item de notre listView
        mapTestSerieRegleCirclation = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        mapTestSerieRegleCirclation.put("titre", "Série 1");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        mapTestSerieRegleCirclation.put("description", " Commencer la Série 1");
        //on insère la référence à l'image (convertit en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
      
        mapTestSerieRegleCirclation.put("img", String.valueOf(R.drawable.serie1));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemRegleCirclationSerieTest.add(mapTestSerieRegleCirclation); 
        
        
  
        mapTestSerieRegleCirclation = new HashMap<String, String>();
        mapTestSerieRegleCirclation.put("titre", "Série 2");
        mapTestSerieRegleCirclation.put("description", " Commencer la Série 2");
        mapTestSerieRegleCirclation.put("img", String.valueOf(R.drawable.serie2));
        listItemRegleCirclationSerieTest.add(mapTestSerieRegleCirclation);  
        
        
        mapTestSerieRegleCirclation = new HashMap<String, String>();
        mapTestSerieRegleCirclation.put("titre", "Série 3");
        mapTestSerieRegleCirclation.put("description", " Commencer la Série 3");
        mapTestSerieRegleCirclation.put("img", String.valueOf(R.drawable.serie3));
        listItemRegleCirclationSerieTest.add(mapTestSerieRegleCirclation);  
        
        
        mapTestSerieRegleCirclation = new HashMap<String, String>();
        mapTestSerieRegleCirclation.put("titre", "Série 4");
        mapTestSerieRegleCirclation.put("description", " Commencer la Série 4");
        mapTestSerieRegleCirclation.put("img", String.valueOf(R.drawable.serie4));
        listItemRegleCirclationSerieTest.add(mapTestSerieRegleCirclation);  
        
        
        mapTestSerieRegleCirclation = new HashMap<String, String>();
        mapTestSerieRegleCirclation.put("titre", "Série 5");
        mapTestSerieRegleCirclation.put("description", " Commencer la Série 5");
        mapTestSerieRegleCirclation.put("img", String.valueOf(R.drawable.serie5));
        listItemRegleCirclationSerieTest.add(mapTestSerieRegleCirclation); 
        
        
        
        
      //Création d'un SimpleAdapter qui se chargera de mettre les items présent dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mScheduleTestSerie = new SimpleAdapter (this.getBaseContext(), listItemRegleCirclationSerieTest, R.layout.affichageitem,
               new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
 
        //On attribut à notre listView l'adapter que l'on vient de créer
        listViewRegleCirclationTestSerie.setAdapter(mScheduleTestSerie);
		
		
		
		
        listViewRegleCirclationTestSerie.setOnItemClickListener(new OnItemClickListener() {
			@Override
        	@SuppressWarnings("unchecked")
         	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				//on récupère la HashMap contenant les infos de notre item (titre, description, img)
        		HashMap<String, String> map = (HashMap<String, String>) listViewRegleCirclationTestSerie.getItemAtPosition(position);


        		switch (position) {
                case 0:
                	
                   
            		        
            		   	Intent IntentSerie1 = new Intent(ActivityRegleCirculationList.this,ActivityTheme61.class);
            		  	startActivity(IntentSerie1);	
            		  	 break;
            		  	 
            		  	 
                case 1:
                	
                    
    		        
        		   	Intent IntentSerie2 = new Intent(ActivityRegleCirculationList.this,ActivityTheme62.class);
        		  	startActivity(IntentSerie2);	
        		  	 break;   
                    
            		  	
        		  	 
        		  	 
                case 2:
                	
                    
    		        
        		   	Intent IntentSerie3 = new Intent(ActivityRegleCirculationList.this,ActivityTheme63.class);
        		  	startActivity(IntentSerie3);	
        		  	 break;
        		  	 
        		  	 
        		  	 
                case 3:
                	
                    
    		        
        		   	Intent IntentSerie4 = new Intent(ActivityRegleCirculationList.this,ActivityTheme64.class);
        		  	startActivity(IntentSerie4);	
        		  	 break;
        		  	 
        		  	 
        		  	 
                  case 4:
                	
                    
    		        
        		   	Intent IntentSerie5 = new Intent(ActivityRegleCirculationList.this,ActivityTheme65.class);
        		  	startActivity(IntentSerie5);	
        		  	 break; 
}
                
                
          		
          	}

        		
        		
        		
        		
        		
        		
        	
         });
	     		  	
            		  	
            		  	
	}

}

             