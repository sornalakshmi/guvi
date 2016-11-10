
import java.util.*;

public FirstRepeatingElement{
  public static void main(String[] args) throws java.lang.Exception{
    Scanner input=new Scanner(System.in);
    HashSet<Integer> set = new HashSet<>();
    int min = -1;  
    int n=input.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=input.nextInt();
    }
    for(int i=n-1;i>=0;i--){
      if (set.contains(arr[i]))
        min = i;  
      else   
        set.add(arr[i]);
     }
     if (min != -1)
          System.out.println(arr[min]);
     else
          System.out.println("-1");
  }
}
