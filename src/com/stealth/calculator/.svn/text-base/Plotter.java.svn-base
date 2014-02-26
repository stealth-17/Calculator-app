package com.stealth.calculator;

import java.text.DecimalFormat;
import java.util.Arrays;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.androidplot.series.XYSeries;
import com.androidplot.xy.LineAndPointFormatter;
import com.androidplot.xy.SimpleXYSeries;
import com.androidplot.xy.XYPlot;


public class Plotter extends Activity {

    private XYPlot mySimpleXYPlot;
    Global global;
    SolveScientific ss = new SolveScientific();
    String exp,exp1;
    double i;
    int j=0;
	double lim,step,start;
	DecimalFormat df = new DecimalFormat("#.###");
	AlertDialog dlg;
    
	@Override
    public void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
        
        
        exp=Global.getVar();
        lim = Global.getend();
        step = Global.getstep();
        start = Global.getstart();
        
        dlg = dialog(this);
        
        dlg.show();

        // initialize our XYPlot reference:
       mySimpleXYPlot = (XYPlot) findViewById(R.id.mySimpleXYPlot);

        // Create a couple arrays of y-values to plot:
       

    Double[] s1 = new Double[2000];
      try
      {
        for(i=start;i<=lim;i=i+step,j++)
        {
        	
        	//Toast.makeText(this, String.valueOf(i), Toast.LENGTH_SHORT).show();
        	if(exp.indexOf('X')!=-1)
        		exp1 = ss.solveScientific(exp.replace("X", String.valueOf(df.format(i))));
        	else
        		exp1 = ss.solveScientific(exp);
        	//Toast.makeText(this, String.valueOf(exp1), Toast.LENGTH_SHORT).show();
        	s1[j]=(double) i;
        	j=j+1;
        	if(exp1.indexOf("-Infinity")!=-1)
        	{
        		s1[j]=Double.NEGATIVE_INFINITY;
        		//s1[j]=0.0;
        		continue;
        	}
        	else if(exp1.indexOf("Infinity")!=-1)
        	{
        		s1[j]=Double.POSITIVE_INFINITY;
        		//s1[j]=0.0;
        		continue;
        	}
        	else
        		s1[j]=Double.parseDouble(exp1);
        
        	
        	//Toast.makeText(this, String.valueOf(s1[j-1])+","+String.valueOf(s1[j]), Toast.LENGTH_SHORT).show();
        }
      }catch(Exception e)
      {
    	  for(j=0;j<s1.length;j++)
    	  {
    		  s1[j]=0.0;
    	  }
    	  Toast.makeText(this, "Error while plotting!"+'\n'+"Check your function", Toast.LENGTH_LONG).show();
      }
        
 
      dlg.dismiss();
      
      
     //  Double[] s1 = {0.2456766756, 0.5523452452, 0.262532345,0.065436246,Double.POSITIVE_INFINITY,Double.NEGATIVE_INFINITY, -0.25324326, -0.523755734, -0.225236355,0.022466444,0.2366325258, 0.5235357235, 0.223557557,0.0, -0.256553248987, -0.553656534366, -0.2353567566,0.026353668};
        
        // Turn the above arrays into XYSeries':
        XYSeries series1 = new SimpleXYSeries(Arrays.asList(s1),          // SimpleXYSeries takes a List so turn our array into a List
                SimpleXYSeries.ArrayFormat.XY_VALS_INTERLEAVED, // Y_VALS_ONLY means use the element index as the x value
                "Series1");                             // Set the display title of the series


        // Create a formatter to use for drawing a series using LineAndPointRenderer:
        LineAndPointFormatter series1Format = new LineAndPointFormatter(
                Color.rgb(255, 0, 0),                   // line color
                null,                   // point color
                null);                                  // fill color (none)

        
        
        // add a new series' to the xyplot:
        mySimpleXYPlot.addSeries(series1, series1Format);



        // reduce the number of range labels
        mySimpleXYPlot.setTicksPerRangeLabel(3);

        // by default, AndroidPlot displays developer guides to aid in laying out your plot.
        // To get rid of them call disableAllMarkup():
        mySimpleXYPlot.disableAllMarkup();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.graph, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem back2calc)
	{
		Global.setVar("");
		finish();
		return false;
		
	}

	public AlertDialog dialog(Context context)
	{
		AlertDialog.Builder load = new AlertDialog.Builder(context);
		load.setTitle("Loading");
		load.setIcon(R.drawable.spinner);
		load.setMessage("Graph is Loading...");
		load.setCancelable(false);
		final AlertDialog dlg = load.create();
		return dlg;
	}

}

