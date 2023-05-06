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
		
		
		//Cr�ation de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemRegleCirclationSerieTest = new ArrayList<HashMap<String, String>>();
 
        //On d�clare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestSerieRegleCirclation;
 
       
        //Cr�ation d'une HashMap pour ins�rer les informations du premier item de notre listView
        mapTestSerieRegleCirclation = new HashMap<String, String>();
        //on ins�re un �l�ment titre que l'on r�cup�rera dans le textView titre cr�� dans le fichier affichageitem.xml
        mapTestSerieRegleCirclation.put("titre", "S�rie 1");
        //on ins�re un �l�ment description que l'on r�cup�rera dans le textView description cr�� dans le fichier affichageitem.xml
        mapTestSerieRegleCirclation.put("description", " Commencer la S�rie 1");
        //on ins�re la r�f�rence � l'image (convertit en String car normalement c'est un int) que l'on r�cup�rera dans l'imageView cr�� dans le fichier affichageitem.xml
      
        mapTestSerieRegleCirclation.put("img", String.valueOf(R.drawable.serie1));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemRegleCirclationSerieTest.add(mapTestSerieRegleCirclation); 
        
        
  
        mapTestSerieRegleCirclation = new HashMap<String, String>();
        mapTestSerieRegleCirclation.put("titre", "S�rie 2");
        mapTestSerieRegleCirclation.put("description", " Commencer la S�rie 2");
        mapTestSerieRegleCirclation.put("img", String.valueOf(R.drawable.serie2));
        listItemRegleCirclationSerieTest.add(mapTestSerieRegleCirclation);  
        
        
        mapTestSerieRegleCirclation = new HashMap<String, String>();
        mapTestSerieRegleCirclation.put("titre", "S�rie 3");
        mapTestSerieRegleCirclation.put("description", " Commencer la S�rie 3");
        mapTestSerieRegleCirclation.put("img", String.valueOf(R.drawable.serie3));
        listItemRegleCirclationSerieTest.add(mapTestSerieRegleCirclation);  
        
        
        mapTestSerieRegleCirclation = new HashMap<String, String>();
        mapTestSerieRegleCirclation.put("titre", "S�rie 4");
        mapTestSerieRegleCirclation.put("description", " Commencer la S�rie 4");
        mapTestSerieRegleCirclation.put("img", String.valueOf(R.drawable.serie4));
        listItemRegleCirclationSerieTest.add(mapTestSerieRegleCirclation);  
        
        
        mapTestSerieRegleCirclation = new HashMap<String, String>();
        mapTestSerieRegleCirclation.put("titre", "S�rie 5");
        mapTestSerieRegleCirclation.put("description", " Commencer la S�rie 5");
        mapTestSerieRegleCirclation.put("img", String.valueOf(R.drawable.serie5));
        listItemRegleCirclationSerieTest.add(mapTestSerieRegleCirclation); 
        
        
        
        
      //Cr�ation d'un SimpleAdapter qui se chargera de mettre les items pr�sent dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mScheduleTestSerie = new SimpleAdapter (this.getBaseContext(), listItemRegleCirclationSerieTest, R.layout.affichageitem,
               new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
 
        //On attribut � notre listView l'adapter que l'on vient de cr�er
        listViewRegleCirclationTestSerie.setAdapter(mScheduleTestSerie);
		
		
		
		
        listViewRegleCirclationTestSerie.setOnItemClickListener(new OnItemClickListener() {
			@Override
        	@SuppressWarnings("unchecked")
         	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				//on r�cup�re la HashMap contenant les infos de notre item (titre, description, img)
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

             