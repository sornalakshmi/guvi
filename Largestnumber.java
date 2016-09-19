

import java.util.*;
import java.lang.*;
import java.io.*;

class Largestnumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input=new Scanner(System.in);
		String[] numbers=new String[]{"54","5","55","6","7","56","120","560","540","505","9","57","0","1","45","65"};
		int i;
		Arrays.sort(numbers, new Comparator<String>(){
        	public int compare(String a, String b){
            	return (b+a).compareTo(a+b);
        	}
    	});
		System.out.print(Arrays.toString(numbers));
		
	}
}
