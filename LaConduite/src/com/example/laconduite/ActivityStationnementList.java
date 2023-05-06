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

public class ActivityStationnementList extends Activity {
	ListView listViewStationnementTestSerie=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_stationnement_list);

		listViewStationnementTestSerie = (ListView) findViewById(R.id.listViewStationnementList);

		
		
		//Cr�ation de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemStationnementSerieTest = new ArrayList<HashMap<String, String>>();
 
        //On d�clare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestSerieStationnement;
 
       
        //Cr�ation d'une HashMap pour ins�rer les informations du premier item de notre listView
        mapTestSerieStationnement = new HashMap<String, String>();
        //on ins�re un �l�ment titre que l'on r�cup�rera dans le textView titre cr�� dans le fichier affichageitem.xml
        mapTestSerieStationnement.put("titre", "S�rie 1");
        //on ins�re un �l�ment description que l'on r�cup�rera dans le textView description cr�� dans le fichier affichageitem.xml
        mapTestSerieStationnement.put("description", " Commencer la S�rie 1");
        //on ins�re la r�f�rence � l'image (convertit en String car normalement c'est un int) que l'on r�cup�rera dans l'imageView cr�� dans le fichier affichageitem.xml
      
        mapTestSerieStationnement.put("img", String.valueOf(R.drawable.serie1));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemStationnementSerieTest.add(mapTestSerieStationnement); 
        
        
  
        mapTestSerieStationnement = new HashMap<String, String>();
        mapTestSerieStationnement.put("titre", "S�rie 2");
        mapTestSerieStationnement.put("description", " Commencer la S�rie 2");
        mapTestSerieStationnement.put("img", String.valueOf(R.drawable.serie2));
        listItemStationnementSerieTest.add(mapTestSerieStationnement);  
        
        
        mapTestSerieStationnement = new HashMap<String, String>();
        mapTestSerieStationnement.put("titre", "S�rie 3");
        mapTestSerieStationnement.put("description", " Commencer la S�rie 3");
        mapTestSerieStationnement.put("img", String.valueOf(R.drawable.serie3));
        listItemStationnementSerieTest.add(mapTestSerieStationnement);  
        
        
        mapTestSerieStationnement = new HashMap<String, String>();
        mapTestSerieStationnement.put("titre", "S�rie 4");
        mapTestSerieStationnement.put("description", " Commencer la S�rie 4");
        mapTestSerieStationnement.put("img", String.valueOf(R.drawable.serie4));
        listItemStationnementSerieTest.add(mapTestSerieStationnement);  
        
        
        mapTestSerieStationnement = new HashMap<String, String>();
        mapTestSerieStationnement.put("titre", "S�rie 5");
        mapTestSerieStationnement.put("description", " Commencer la S�rie 5");
        mapTestSerieStationnement.put("img", String.valueOf(R.drawable.serie5));
        listItemStationnementSerieTest.add(mapTestSerieStationnement); 
        
        
        
        
      //Cr�ation d'un SimpleAdapter qui se chargera de mettre les items pr�sent dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mScheduleTestStationnementSerie = new SimpleAdapter (this.getBaseContext(), listItemStationnementSerieTest, R.layout.affichageitem,
               new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
 
        //On attribut � notre listView l'adapter que l'on vient de cr�er
        listViewStationnementTestSerie.setAdapter(mScheduleTestStationnementSerie);
        
        listViewStationnementTestSerie.setOnItemClickListener(new OnItemClickListener() {
			@Override
        	@SuppressWarnings("unchecked")
         	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				//on r�cup�re la HashMap contenant les infos de notre item (titre, description, img)
        		HashMap<String, String> map = (HashMap<String, String>) listViewStationnementTestSerie.getItemAtPosition(position);


        		switch (position) {
                case 0:
                	
                   
            		        
            		   	Intent IntentStationnementSerie1 = new Intent(ActivityStationnementList.this,ActivityTheme11.class);
            		  	startActivity(IntentStationnementSerie1);	
            		  	 break;
            		  	 
            		  	 
                case 1:
                	
                    
    		        
        		   	Intent IntentStationnementSerie2 = new Intent(ActivityStationnementList.this,ActivityTheme12.class);
        		  	startActivity(IntentStationnementSerie2);	
        		  	 break;   
                    
            		  	
        		  	 
        		  	 
                case 2:
                	
                    
    		        
        		   	Intent IntentStationnementSerie3 = new Intent(ActivityStationnementList.this,ActivityTheme13.class);
        		  	startActivity(IntentStationnementSerie3);	
        		  	 break;
        		  	 
        		  	 
        		  	 
                case 3:
                	
                    
    		        
        		   	Intent IntentStationnementSerie4 = new Intent(ActivityStationnementList.this,ActivityTheme14.class);
        		  	startActivity(IntentStationnementSerie4);	
        		  	 break;
        		  	 
        		  	 
        		  	 
                  case 4:
                	
                    
    		        
        		   	Intent IntentStationnementSerie5 = new Intent(ActivityStationnementList.this,ActivityTheme15.class);
        		  	startActivity(IntentStationnementSerie5);	
        		  	 break; 
}
                
                
          		
          	}

        		
        		
        		
        		
        		
        		
        	
         });
	     		  	
            		  	
            		  	
	}

}

             