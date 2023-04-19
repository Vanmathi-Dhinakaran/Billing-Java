
import java.util.Scanner;

public class Billing {
  static boolean check(String x, String[] station) {
    for(String y:station)
    {
      if(x.equals(y))
        return true;
    }
    return false;
  }
  static int index(String x, String[] station) {
    
    for (int i= 0 ;i<station.length;i++)
    {
      if(station[i].equals(x))
        return i;
    }
    return -1;
  }
  static int fare (int sourcei ,int desti)
  {
    int f =(sourcei>desti) ? sourcei-desti : desti-sourcei;
    return(f*5);
  }
  
  public static void main(String[] args) {
    
    String[] station = {"beach","fort","park","egmore","chetpat","nungambakkam","kodambakam","mambalam","saidapet","guindy","St thomas mount","palavanthangal","minabakkam","tirusulam","pallavaram","chrompet","tambaram santorium","tambaram"};
    System.out.println("-----------------------------------------------------------");
    System.out.println("Welcome to Ticket Counter!!");
    System.out.println("-----------------------------------------------------------");
    for(int i = 0;i<station.length;i++){
      System.out.println((i+1)+" "+ station[i]);
    }
    Scanner sc =new Scanner(System.in);
    System.out.println("enter source");
    String source = sc.next();
    System.out.println("enter destination");
    String destination = sc.next();
    
    if (check(source, station)&&check(destination, station)) {
      int sourcei=index(source, station);
      int desti=index(destination, station);
      int totalfare=fare(sourcei, desti);
      System.out.println("total fare is "+totalfare);
      
    }
    else {
      System.out.println("please enter valid station`");
    }
    
  }
}
