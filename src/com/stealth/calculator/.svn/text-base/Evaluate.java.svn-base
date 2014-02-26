package com.stealth.calculator;

import java.util.Stack;

public class Evaluate {

	public Evaluate()
	{
		
	}
	public static String evaluate(String postfix)
	{
		String[] temp = postfix.split(" ");
		int i;
		double val1=0,val2=0,res;
		char ch;
		Stack values = new Stack();
		for(i=0;i<temp.length;i++)
		{
			
			if(temp[i].length()==1)
			{
				ch = temp[i].charAt(0);
				switch(ch)
				{
				case '+': val1=(Double) values.pop();
						  val2=(Double) values.pop();
						  res=val2+val1;
						  values.push(res);
						  break;
				case '-': val1=(Double) values.pop();
						  val2=(Double) values.pop();
						  res=val2-val1;
						  values.push(res);
						  break;
				case 'x': val1=(Double) values.pop();
				  		  val2=(Double) values.pop();
						  res=val2*val1;
						  values.push(res);
				  		  break;
				case '÷': val1=(Double) values.pop();
				  		  val2=(Double) values.pop();
				  		  if(val1==0 && val2==0)
				  			  return "Error";
				  		  else if(val1==0 && val2 >0)
				  			  res = Double.POSITIVE_INFINITY;
				  		  else if(val1==0 && val2<0)
				  			  res=Double.NEGATIVE_INFINITY;
				  		  else
				  			  res=val2/val1;
						  values.push(res);
				  		  break;
				case '√': val1=(Double) values.pop();
						  res=Math.sqrt(val1);
						  values.push(res);
						  break;
				case '^': val1=(Double) values.pop();
						  val2=(Double) values.pop(); 
						  res=Math.pow(val2, val1);
						  values.push(res);
						  break;
				case '%': val1=(Double) values.pop();
				  		  val2=(Double) values.pop(); 
				  		  res=val2%val1;
				  		  values.push(res);
				  		  break;
				case '!': val1 =(Double) values.pop();
						if(val1>0)
						  val1 = fact(val1);
						else
							return "Error";
						  values.push(val1);
						  break;
				case 'p': values.push(Double.POSITIVE_INFINITY);
							break;
				case 'n': values.push(Double.NEGATIVE_INFINITY);
							break;
				default : values.push(Double.parseDouble(temp[i]));
				  		  
				}
				
			}
			else
			{
				values.push(Double.parseDouble(temp[i]));
			}
		}
		return values.pop().toString();  
	}
	
	public static Double fact(Double val)
	{
		if(val<=1 && val>=0)
			return 1.0;
		else
			while(val!=0)
				return val*fact(val-1);
		return val;
	}

}
