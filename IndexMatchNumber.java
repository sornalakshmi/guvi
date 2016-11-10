import java.util.*;
import java.lang.*;
import java.io.*;


class IndexMatchNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int flag=0;
	      	int[] arr={-3,-1,1,3,5};
              	for(int i=0;i<arr.length;i++){
                	if(arr[i]>i)
                  		break;
                	else if(arr[i]==i){
                  		System.out.println(arr[i]);
		  		flag=1;
			}
		}
		if(flag==0)
			System.out.println("0");
          }
}
