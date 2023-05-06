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

		
		
		//Cr�ation de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemCroisementSerieTest = new ArrayList<HashMap<String, String>>();
 
        //On d�clare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestSerieCroisement;
 
       
        //Cr�ation d'une HashMap pour ins�rer les informations du premier item de notre listView
        mapTestSerieCroisement = new HashMap<String, String>();
        //on ins�re un �l�ment titre que l'on r�cup�rera dans le textView titre cr�� dans le fichier affichageitem.xml
        mapTestSerieCroisement.put("titre", "S�rie 1");
        //on ins�re un �l�ment description que l'on r�cup�rera dans le textView description cr�� dans le fichier affichageitem.xml
        mapTestSerieCroisement.put("description", " Commencer la S�rie 1");
        //on ins�re la r�f�rence � l'image (convertit en String car normalement c'est un int) que l'on r�cup�rera dans l'imageView cr�� dans le fichier affichageitem.xml
      
        mapTestSerieCroisement.put("img", String.valueOf(R.drawable.serie1));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemCroisementSerieTest.add(mapTestSerieCroisement); 
        
        
  
        mapTestSerieCroisement = new HashMap<String, String>();
        mapTestSerieCroisement.put("titre", "S�rie 2");
        mapTestSerieCroisement.put("description", " Commencer la S�rie 2");
        mapTestSerieCroisement.put("img", String.valueOf(R.drawable.serie2));
        listItemCroisementSerieTest.add(mapTestSerieCroisement);  
        
        
        mapTestSerieCroisement = new HashMap<String, String>();
        mapTestSerieCroisement.put("titre", "S�rie 3");
        mapTestSerieCroisement.put("description", " Commencer la S�rie 3");
        mapTestSerieCroisement.put("img", String.valueOf(R.drawable.serie3));
        listItemCroisementSerieTest.add(mapTestSerieCroisement);  
        
        
        mapTestSerieCroisement = new HashMap<String, String>();
        mapTestSerieCroisement.put("titre", "S�rie 4");
        mapTestSerieCroisement.put("description", " Commencer la S�rie 4");
        mapTestSerieCroisement.put("img", String.valueOf(R.drawable.serie4));
        listItemCroisementSerieTest.add(mapTestSerieCroisement);  
        
        
        mapTestSerieCroisement = new HashMap<String, String>();
        mapTestSerieCroisement.put("titre", "S�rie 5");
        mapTestSerieCroisement.put("description", " Commencer la S�rie 5");
        mapTestSerieCroisement.put("img", String.valueOf(R.drawable.serie5));
        listItemCroisementSerieTest.add(mapTestSerieCroisement); 
        
        
        
        
      //Cr�ation d'un SimpleAdapter qui se chargera de mettre les items pr�sent dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mScheduleTestStationnementSerie = new SimpleAdapter (this.getBaseContext(), listItemCroisementSerieTest, R.layout.affichageitem,
               new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
 
        //On attribut � notre listView l'adapter que l'on vient de cr�er
        listViewCroisementTestSerie.setAdapter(mScheduleTestStationnementSerie);
        
        listViewCroisementTestSerie.setOnItemClickListener(new OnItemClickListener() {
			@Override
        	@SuppressWarnings("unchecked")
         	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				//on r�cup�re la HashMap contenant les infos de notre item (titre, description, img)
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

             