package com.nmw.main;

import java.io.IOException;

public class CheckPrimeNumber 
{
	public static void main(String[] args) throws IOException 
	{
		for(int index=54605;index>=0;index--)
		{
			if(isPrime(index))
			{
				Integer tempNum=index;
				Boolean tempflag=false;
				
				while(tempNum!=0)
				{				
					if(isPrime(tempNum%10))
					{
						tempflag=true;
						tempNum = tempNum/10;
					}
					else{tempflag=false;break;}
				}
				//
				if(tempflag )
				{
					System.out.println(index);
					break;
				}
			}
		}
		
		
		
	}
	
	public static Boolean isPrime(Integer num)
	{
		Boolean isPrime=false;
		
		if(num==1||num==2 || num==3 || num==5 || num==7)
		{
			isPrime=true;
		}
		else if(num%2>0 && num%3>0 && num%5>0 && num%7>0)
		{
			isPrime=true;
		}
		
		return isPrime;
	}
}
