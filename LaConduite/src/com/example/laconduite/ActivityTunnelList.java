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

public class ActivityTunnelList extends  Activity {
	ListView listViewTunnelSerie=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tunnel_list);



		
		
listViewTunnelSerie = (ListView) findViewById(R.id.listViewTunnel);

		
		
		//Cr�ation de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemTunnelTest = new ArrayList<HashMap<String, String>>();
 
        //On d�clare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestSerieTunnel;
 
       
        //Cr�ation d'une HashMap pour ins�rer les informations du premier item de notre listView
        mapTestSerieTunnel = new HashMap<String, String>();
        //on ins�re un �l�ment titre que l'on r�cup�rera dans le textView titre cr�� dans le fichier affichageitem.xml
        mapTestSerieTunnel.put("titre", "S�rie 1");
        //on ins�re un �l�ment description que l'on r�cup�rera dans le textView description cr�� dans le fichier affichageitem.xml
        mapTestSerieTunnel.put("description", " Commencer la S�rie 1");
        //on ins�re la r�f�rence � l'image (convertit en String car normalement c'est un int) que l'on r�cup�rera dans l'imageView cr�� dans le fichier affichageitem.xml
      
        mapTestSerieTunnel.put("img", String.valueOf(R.drawable.serie1));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemTunnelTest.add(mapTestSerieTunnel); 
        
        
  
        mapTestSerieTunnel = new HashMap<String, String>();
        mapTestSerieTunnel.put("titre", "S�rie 2");
        mapTestSerieTunnel.put("description", " Commencer la S�rie 2");
        mapTestSerieTunnel.put("img", String.valueOf(R.drawable.serie2));
        listItemTunnelTest.add(mapTestSerieTunnel);  
        
        
        mapTestSerieTunnel = new HashMap<String, String>();
        mapTestSerieTunnel.put("titre", "S�rie 3");
        mapTestSerieTunnel.put("description", " Commencer la S�rie 3");
        mapTestSerieTunnel.put("img", String.valueOf(R.drawable.serie3));
        listItemTunnelTest.add(mapTestSerieTunnel);  
        
        
        mapTestSerieTunnel = new HashMap<String, String>();
        mapTestSerieTunnel.put("titre", "S�rie 4");
        mapTestSerieTunnel.put("description", " Commencer la S�rie 4");
        mapTestSerieTunnel.put("img", String.valueOf(R.drawable.serie4));
        listItemTunnelTest.add(mapTestSerieTunnel);  
        
        
        mapTestSerieTunnel = new HashMap<String, String>();
        mapTestSerieTunnel.put("titre", "S�rie 5");
        mapTestSerieTunnel.put("description", " Commencer la S�rie 5");
        mapTestSerieTunnel.put("img", String.valueOf(R.drawable.serie5));
        listItemTunnelTest.add(mapTestSerieTunnel); 
        
        
        
        
      //Cr�ation d'un SimpleAdapter qui se chargera de mettre les items pr�sent dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mScheduleTestSerie = new SimpleAdapter (this.getBaseContext(), listItemTunnelTest, R.layout.affichageitem,
               new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
 
        //On attribut � notre listView l'adapter que l'on vient de cr�er
        listViewTunnelSerie.setAdapter(mScheduleTestSerie);
        
        listViewTunnelSerie.setOnItemClickListener(new OnItemClickListener() {
			@Override
        	@SuppressWarnings("unchecked")
         	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				//on r�cup�re la HashMap contenant les infos de notre item (titre, description, img)
        		HashMap<String, String> map = (HashMap<String, String>) listViewTunnelSerie.getItemAtPosition(position);


        		switch (position) {
                case 0:
                	
                   
            		        
            		   	Intent IntentSerie1 = new Intent(ActivityTunnelList.this,ActivityTheme81.class);
            		  	startActivity(IntentSerie1);	
            		  	 break;
            		  	 
            		  	 
                case 1:
                	
                    
    		        
        		   	Intent IntentSerie2 = new Intent(ActivityTunnelList.this,ActivityTheme82.class);
        		  	startActivity(IntentSerie2);	
        		  	 break;   
                    
            		  	
        		  	 
        		  	 
                case 2:
                	
                    
    		        
        		   	Intent IntentSerie3 = new Intent(ActivityTunnelList.this,ActivityTheme83.class);
        		  	startActivity(IntentSerie3);	
        		  	 break;
        		  	 
        		  	 
        		  	 
                case 3:
                	
                    
    		        
        		   	Intent IntentSerie4 = new Intent(ActivityTunnelList.this,ActivityTheme84.class);
        		  	startActivity(IntentSerie4);	
        		  	 break;
        		  	 
        		  	 
        		  	 
                  case 4:
                	
                    
    		        
        		   	Intent IntentSerie5 = new Intent(ActivityTunnelList.this,ActivityTheme85.class);
        		  	startActivity(IntentSerie5);	
        		  	 break; 
}
                
                
          		
          	}

        		
        		
        		
        		
        		
        		
        	
         });
	     		  	
            		  	
            		  	
	}

}

