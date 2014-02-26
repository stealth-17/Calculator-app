package com.stealth.calculator;

public class BracketHandler {
	
	public BracketHandler()
	{
		
	}

	public int solveBracket(int val,String exp)
	{
		int count=0,i=0;
		char[] list=exp.substring(val).toCharArray();
		while(list[i]!='(')
			i=i+1;
		for(;i<list.length;i++)
		{
			if(list[i]=='(')
				count=count+1;
			else if(list[i]==')')
				count=count-1;
			if(count==0)
				return i;
		}
		return -1;
	} 
	
	public String putBracket(String exp){
		char[] temp=exp.toCharArray();
		int i,count=0;
		for(i=0;i<temp.length;i++)
		{
			if(temp[i]=='(')
				count=count+1;
			else if(temp[i]==')')
				count=count-1;
		}
		while(count!=0)
		{
			exp=exp+")";
			count=count-1;
		}
		return exp;
	}
	
	public boolean checkBracket(String exp)
	{
		char[] temp=exp.toCharArray();
		int i,count=0;
		for(i=0;i<temp.length;i++)
		{
			if(temp[i]=='(')
				count=count+1;
			else if(temp[i]==')')
				count=count-1;
		}
		if(count!=0)
			return true;
		
		return false;
	}
}
