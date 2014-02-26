package com.stealth.calculator;

import java.util.Stack;

public class Infix2Postfix {
	
	public Infix2Postfix()
	{
		
	}

	public static String infix2postfix(String infix)
	{
		String operators = "%+-÷x^√";
		String operands = "1234567890.";
		String result = "";
		Stack<Character> temp = new Stack<Character>();
		char[] eprn = infix.toCharArray();
		int i,prevtext = 0,prev_i=-1;
		char ch,opr;
		for(i=0;i<eprn.length;i++)
		{
			ch = eprn[i];
			if(operands.indexOf(ch)!=-1)
			{
				if(prevtext!=1)
					result = result +" ";
					
				result = result+ch;
				prevtext=1;
			}
			else if(ch=='!')
				result=result+" "+ch;
			else if(ch=='n' || ch =='p')
				result=result+" "+ch;
			else if(operators.indexOf(ch)>=0)
			{
				if(i==prev_i+1 && ch!='√')
				{
					result=result+" "+ch;
					prevtext=1;
					prev_i=i;
					continue;
				}
				prevtext=0;
				if(temp.empty()==true)
				{
					temp.push(ch);
				}
				else
				{
					
				while(true)
				{
					opr=(Character) temp.pop();
					if(opr!='(')
					{
						
						if (operators.indexOf(opr)>operators.indexOf(ch))
						{
							result = result +" "+ opr;
						}
						else
						{
							temp.push(opr);
							temp.push(ch);
							break;
						}
					}
					else
					{
						temp.push(opr);
						temp.push(ch);
						break;
					}
					if(temp.empty()==true)
					{
						temp.push(ch);
						break;
						
					}
				}
				}
				prev_i=i;
			}
			else if(ch=='(')
			{
				temp.push(ch);
				prev_i=i;
			}
			else if(ch==')')
			{
				opr = (Character) temp.pop();
				while(opr!='(')
				{
					result = result +" "+ opr;
					opr = (Character) temp.pop();
				}
			}
		}
		while(temp.empty()!=true)
		{
			opr = (Character) temp.pop();
			result = result +" "+ opr;
		}
		if(result.charAt(0)==' ')
			return result.substring(1,result.length());
		else
			return result;
	}
}
