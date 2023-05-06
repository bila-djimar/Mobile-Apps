package com.example.laconduite;

import java.util.ArrayList;
import java.util.HashMap;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.AdapterView.OnItemClickListener;
import android.os.Build;

public class ActivityASSR1List extends  Activity {
	ListView listViewASSR1TestSerie=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_assr1_list);


listViewASSR1TestSerie = (ListView) findViewById(R.id.listViewASSR1list);

		
		
		//Cr�ation de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemASSR1SerieTest = new ArrayList<HashMap<String, String>>();
 
        //On d�clare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestSerieASSR1;
 
       
        //Cr�ation d'une HashMap pour ins�rer les informations du premier item de notre listView
        mapTestSerieASSR1 = new HashMap<String, String>();
        //on ins�re un �l�ment titre que l'on r�cup�rera dans le textView titre cr�� dans le fichier affichageitem.xml
        mapTestSerieASSR1.put("titre", "S�rie 1");
        //on ins�re un �l�ment description que l'on r�cup�rera dans le textView description cr�� dans le fichier affichageitem.xml
        mapTestSerieASSR1.put("description", " Commencer la S�rie 1");
        //on ins�re la r�f�rence � l'image (convertit en String car normalement c'est un int) que l'on r�cup�rera dans l'imageView cr�� dans le fichier affichageitem.xml
      
        mapTestSerieASSR1.put("img", String.valueOf(R.drawable.serie1));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemASSR1SerieTest.add(mapTestSerieASSR1); 
        
        
  
        mapTestSerieASSR1 = new HashMap<String, String>();
        mapTestSerieASSR1.put("titre", "S�rie 2");
        mapTestSerieASSR1.put("description", " Commencer la S�rie 2");
        mapTestSerieASSR1.put("img", String.valueOf(R.drawable.serie2));
        listItemASSR1SerieTest.add(mapTestSerieASSR1);  
        
        
        mapTestSerieASSR1 = new HashMap<String, String>();
        mapTestSerieASSR1.put("titre", "S�rie 3");
        mapTestSerieASSR1.put("description", " Commencer la S�rie 3");
        mapTestSerieASSR1.put("img", String.valueOf(R.drawable.serie3));
        listItemASSR1SerieTest.add(mapTestSerieASSR1);  
        
        
        mapTestSerieASSR1 = new HashMap<String, String>();
        mapTestSerieASSR1.put("titre", "S�rie 4");
        mapTestSerieASSR1.put("description", " Commencer la S�rie 4");
        mapTestSerieASSR1.put("img", String.valueOf(R.drawable.serie4));
        listItemASSR1SerieTest.add(mapTestSerieASSR1);  
        
        
        mapTestSerieASSR1 = new HashMap<String, String>();
        mapTestSerieASSR1.put("titre", "S�rie 5");
        mapTestSerieASSR1.put("description", " Commencer la S�rie 5");
        mapTestSerieASSR1.put("img", String.valueOf(R.drawable.serie5));
        listItemASSR1SerieTest.add(mapTestSerieASSR1); 
        
        
        
        
      //Cr�ation d'un SimpleAdapter qui se chargera de mettre les items pr�sent dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mScheduleTestSerie = new SimpleAdapter (this.getBaseContext(), listItemASSR1SerieTest, R.layout.affichageitem,
               new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
 
        //On attribut � notre listView l'adapter que l'on vient de cr�er
        listViewASSR1TestSerie.setAdapter(mScheduleTestSerie);
        
        listViewASSR1TestSerie.setOnItemClickListener(new OnItemClickListener() {
			@Override
        	@SuppressWarnings("unchecked")
         	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				//on r�cup�re la HashMap contenant les infos de notre item (titre, description, img)
        		HashMap<String, String> map = (HashMap<String, String>) listViewASSR1TestSerie.getItemAtPosition(position);


        		switch (position) {
                case 0:
                	
                   
            		        
            		   	Intent IntentSerie1 = new Intent(ActivityASSR1List.this,ActivityAssr11.class);
            		  	startActivity(IntentSerie1);	
            		  	 break;
            		  	 
            		  	 
                case 1:
                	
                    
    		        
        		   	Intent IntentSerie2 = new Intent(ActivityASSR1List.this,ActivityAssr12.class);
        		  	startActivity(IntentSerie2);	
        		  	 break;   
                    
            		  	
        		  	 
        		  	 
                case 2:
                	
                    
    		        
        		   	Intent IntentSerie3 = new Intent(ActivityASSR1List.this,ActivityAssr13.class);
        		  	startActivity(IntentSerie3);	
        		  	 break;
        		  	 
        		  	 
        		  	 
                case 3:
                	
                    
    		        
        		   	Intent IntentSerie4 = new Intent(ActivityASSR1List.this,ActivityAssr14.class);
        		  	startActivity(IntentSerie4);	
        		  	 break;
        		  	 
        		  	 
        		  	 
                  case 4:
                	
                    
    		        
        		   	Intent IntentSerie5 = new Intent(ActivityASSR1List.this,ActivityAssr15.class);
        		  	startActivity(IntentSerie5);	
        		  	 break; 
}
                
                
          		
          	}

        		
        		
        		
        		
        		
        		
        	
         });
	     		  	
            		  	
            		  	
	}

}

             