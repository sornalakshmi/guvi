
import java.util.*;
import java.lang.*;
import java.io.*;


class Duplicateregnum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		String[] regnum = {"13N56", "13T132", "13P290", "13T132", "13P290", "13A134"};
 
        HashSet<String> set = new HashSet<String>();
 
        for (String arrayElement : regnum)
        {
            if(!set.add(arrayElement))
            {
                System.out.println(arrayElement);
            }
        }
		
	}
}
