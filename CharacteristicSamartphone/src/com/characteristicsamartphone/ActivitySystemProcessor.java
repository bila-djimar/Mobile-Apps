package com.characteristicsamartphone;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

import javax.microedition.khronos.opengles.GL10;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.graphics.Color;
import android.hardware.SensorManager;
import android.opengl.GLES10;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.widget.TextView;

@SuppressLint("NewApi")
public class ActivitySystemProcessor extends Activity {
	private SensorManager sMgr;
	private TextView modele1,manufacturer1,Board1,Bootloader1,BRAND1,
	                 CPU_ABI1,CPU_ABI12,DEVICE1,DISPLAY1,
	                 HARDWARE1,HOST1,ID1,PRODUCT1,TAGS1,TYPE1,
	                 USER1,RELEASE1,toalmemo1,avaiemory,avaiemory1,screen1,
	                 API1,id1,vmVersion1,architecture1,kernel1,screenInches1,
	                 dens1,gles1;
	private TextView GPU_Renderer1, GPU_Vendor1,Cores1, CPUAvaible1,name1,CPU1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_system_processor);


		modele1 = (TextView)findViewById(R.id.textView2);
		manufacturer1 = (TextView)findViewById(R.id.textView4);
		Board1 = (TextView)findViewById(R.id.textView6); 
	    Bootloader1 = (TextView)findViewById(R.id.textView8); 
	    BRAND1 = (TextView)findViewById(R.id.textView10); 
	    CPU_ABI1 = (TextView)findViewById(R.id.textView12);
	    CPU_ABI12 = (TextView)findViewById(R.id.textView14); 
	    DEVICE1 = (TextView)findViewById(R.id.textView16);
	    DISPLAY1 = (TextView)findViewById(R.id.textView18);
	   // FINGERPRINT1 = (TextView)findViewById(R.id.textView20);
	    HARDWARE1 = (TextView)findViewById(R.id.textView22); 
	    HOST1 = (TextView)findViewById(R.id.textView24);
	    ID1 = (TextView)findViewById(R.id.textView26);
	    PRODUCT1 = (TextView)findViewById(R.id.textView28);
	   // RADIO1 = (TextView)findViewById(R.id.textView30);
	    TAGS1 = (TextView)findViewById(R.id.textView32);
	    TYPE1 = (TextView)findViewById(R.id.textView34);
	    USER1 = (TextView)findViewById(R.id.textView36); 
	    RELEASE1 = (TextView)findViewById(R.id.textView38); 
	    API1 = (TextView)findViewById(R.id.textView381);
	   toalmemo1 = (TextView)findViewById(R.id.textView40);
	   avaiemory1 = (TextView)findViewById(R.id.textView42); 
	   screen1 = (TextView)findViewById(R.id.textView44); 
	   id1 = (TextView)findViewById(R.id.textView82); 
	  // TIME1 = (TextView)findViewById(R.id.textView46); 
	   vmVersion1 = (TextView)findViewById(R.id.textView48); 
	   architecture1 = (TextView)findViewById(R.id.textView50); 
	   kernel1 = (TextView)findViewById(R.id.textView52); 
	   screenInches1 = (TextView)findViewById(R.id.textView54);
	   dens1= (TextView)findViewById(R.id.textView56);
	   gles1= (TextView)findViewById(R.id.textView58);
	   
	   
		String manufacturer = Build.MANUFACTURER;
	    String model = Build.MODEL;
	    String Board = Build.BOARD;
	    String Bootloader = Build.BOOTLOADER;
	    String BRAND = Build.BRAND;
	    String CPU_ABI = Build.CPU_ABI;
	    String CPU_ABI2 = Build.CPU_ABI2;
	    String DEVICE = Build.DEVICE;
	    String DISPLAY = Build.DISPLAY;
	    String FINGERPRINT = Build.FINGERPRINT;
	    String HARDWARE = Build.HARDWARE;
	    String HOST = Build.HOST;
	    String ID = Build.ID;
	    String PRODUCT = Build.PRODUCT;
	    String RADIO = Build.RADIO;
	    String TAGS = Build.TAGS;
	    String TYPE = Build.TYPE;
	    String USER = Build.USER;
	    String RELEASE = Build.VERSION.RELEASE;
	    int API =  Integer.valueOf(android.os.Build.VERSION.SDK);
	    String id = android.os.Build.ID;
	    //long TIME = android.os.Build.TIME; 
	    int numberOfProcessors = Runtime.getRuntime().availableProcessors();
	    
	    
	   // String TIME =System.getProperty("com.android.internal.os.PowerProfile");
	    String vmname = System.getProperty("java.vm.name");//java.vm.version
	    String vmVersion = System.getProperty("java.vm.version");
	    String architecture = System.getProperty("os.arch");/// architecture de system
	    String kernel = System.getProperty("os.version");
	    String path = System.getProperty("java.version");
	    String home = System.getProperty("line.separator");
	    String vendor = System.getProperty("os.version");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    modele1.setText("          "+model);
	    modele1.setTextColor(Color.parseColor("#0000FF"));
	    
	    
	    manufacturer1.setText("          "+manufacturer);
	    manufacturer1.setTextColor(Color.parseColor("#0000FF"));
	    
	    Board1.setText("          "+Board);
	    Board1.setTextColor(Color.parseColor("#0000FF"));
	    
	    Bootloader1.setText("          "+Bootloader);
	    Bootloader1.setTextColor(Color.parseColor("#0000FF"));
	    
	    BRAND1.setText("          "+BRAND);
	    BRAND1.setTextColor(Color.parseColor("#0000FF"));
	    
	    CPU_ABI1.setText("          "+CPU_ABI);
	    CPU_ABI1.setTextColor(Color.parseColor("#0000FF"));
	    
	    CPU_ABI12.setText("          "+CPU_ABI2);
	    CPU_ABI12.setTextColor(Color.parseColor("#0000FF"));
	    
	    DEVICE1.setText("          "+DEVICE);
	    DEVICE1.setTextColor(Color.parseColor("#0000FF"));
	    
	    DISPLAY1.setText("          "+DISPLAY); 
	    DISPLAY1.setTextColor(Color.parseColor("#0000FF"));
	    
	    //FINGERPRINT1.setText("          "+FINGERPRINT);
	    
	    
	    HARDWARE1.setText("          "+HARDWARE);
	    HARDWARE1.setTextColor(Color.parseColor("#0000FF"));
	    
	    HOST1.setText("          "+HOST);
	    HOST1.setTextColor(Color.parseColor("#0000FF"));
	    
	    ID1.setText("          "+ID);
	    ID1.setTextColor(Color.parseColor("#0000FF"));
	    
	    PRODUCT1.setText("          "+PRODUCT);
	    PRODUCT1.setTextColor(Color.parseColor("#0000FF"));
	    
	    //RADIO1.setText("          "+RADIO);
	    
	    
	    TAGS1.setText("          "+TAGS);
	    TAGS1.setTextColor(Color.parseColor("#0000FF"));
	    
	    TYPE1.setText("          "+TYPE);
	    TYPE1.setTextColor(Color.parseColor("#0000FF"));
	    
	    USER1.setText("          "+USER);
	    USER1.setTextColor(Color.parseColor("#0000FF"));
	    
	    RELEASE1.setText("          "+RELEASE);
	    RELEASE1.setTextColor(Color.parseColor("#0000FF"));
	    
	    API1.setText("          "+String.valueOf(API));
	    API1.setTextColor(Color.parseColor("#0000FF"));
	    
	    id1.setText("          "+id);
	    id1.setTextColor(Color.parseColor("#0000FF"));
	    
	    vmVersion1.setText("          "+vmname+" "+vmVersion);
	    vmVersion1.setTextColor(Color.parseColor("#0000FF"));
	    
	    architecture1.setText("           "+architecture);
	    architecture1.setTextColor(Color.parseColor("#0000FF"));
	    
	    kernel1.setText("           "+kernel);
	    kernel1.setTextColor(Color.parseColor("#0000FF"));
	    
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    DisplayMetrics dm = new DisplayMetrics();
	    getWindowManager().getDefaultDisplay().getMetrics(dm);
	    double x = Math.pow(dm.widthPixels/dm.xdpi,2);
	    double y = Math.pow(dm.heightPixels/dm.ydpi,2);
	    double screenInches = Math.sqrt(x+y);
	    
	    
       screenInches1.setText("          "+(float)screenInches+" inches");
       screenInches1.setTextColor(Color.parseColor("#0000FF"));
       
       int dens=dm.densityDpi;
	    
	    dens1.setText("          "+String.valueOf(dens)+" dpi");
	    dens1.setTextColor(Color.parseColor("#0000FF"));
	    
	    String OpenGl = GLES10.glGetString(GL10.GL_VERSION);  
	    
	    
	    gles1.setText("          "+OpenGl);
	    gles1.setTextColor(Color.parseColor("#0000FF"));
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    ActivityManager actManager = (ActivityManager) getSystemService(ACTIVITY_SERVICE);
	    MemoryInfo memInfo = new ActivityManager.MemoryInfo();
	    actManager.getMemoryInfo(memInfo);
	    long totalMemory = memInfo.totalMem/(1024*1024);
	    long avaiemory = memInfo.availMem/(1024*1024);
	    
	    
	    
	    
	    
	   
	    
	    
	    
	    
	    
	    
	    toalmemo1.setText("          "+String.valueOf(totalMemory)+" MO");
	    toalmemo1.setTextColor(Color.parseColor("#0000FF"));
	    
	    
	    avaiemory1.setText("          "+String.valueOf(avaiemory)+" MO");
	    avaiemory1.setTextColor(Color.parseColor("#0000FF"));
	   // TIME1.setText("          "+String.valueOf(TIME));
	   // TIME1.setText("          "+numberOfProcessors);
	    
	    
	    
	    Display display = getWindowManager().getDefaultDisplay(); 
	    int width = display.getWidth();  // deprecated
	    int height = display.getHeight();  // deprecated
	    
	    screen1.setText("          "+String.valueOf(width)+"×"+String.valueOf(height));
	    screen1.setTextColor(Color.parseColor("#0000FF"));
	    
	  
	    
	    
	    GPU_Renderer1 = (TextView)findViewById(R.id.textView541);
	    GPU_Vendor1 = (TextView)findViewById(R.id.textView561);
	    Cores1 = (TextView)findViewById(R.id.textView581);
	   /// CPUAvaible1= (TextView)findViewById(R.id.textView601);
	    
	    String GPU_Renderer = GLES10.glGetString(GL10.GL_RENDERER);           
		String GPU_Vendor = GLES10.glGetString(GL10.GL_VENDOR);
		//int CPUAvaible = Runtime.getRuntime().availableProcessors();
		
		
		
		
		GPU_Renderer1.setText("           "+GPU_Renderer);
		GPU_Renderer1.setTextColor(Color.parseColor("#0000FF"));
		
		GPU_Vendor1.setText("           "+GPU_Vendor);
		GPU_Vendor1.setTextColor(Color.parseColor("#0000FF"));
		
		Cores1.setText("           "+getNumCores());
		Cores1.setTextColor(Color.parseColor("#0000FF"));
		
		//CPUAvaible1.setText("           "+CPUAvaible);
		//CPUAvaible1.setTextColor(Color.parseColor("#0000FF"));
	}

	
	private int getNumCores() {
		//Private Class to display only CPU devices in the directory listing
		class CpuFilter implements FileFilter {
		@Override
		public boolean accept(File pathname) {
		//Check if filename is "cpu", followed by a single digit number
		if(Pattern.matches("cpu[0-9]+", pathname.getName())) {
		return true;
		}
		return false;
		}
		}
		try {
		//Get directory containing CPU info
		File dir = new File("/sys/devices/system/cpu/");
		//Filter to only list the devices we care about
		 File[] files = dir.listFiles(new CpuFilter());
		//Return the number of cores (virtual CPU devices)
		return files.length;
		} catch(Exception e) {
		//Default to return 1 core
		return 1;
		}
		}	
}
