import java.util.*;
public class Try1 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
    //   first: {
    //       System.out.println("Roman");
    //     second: {
    //       third: {
    //         System.out.println("Before break");
    //         if (true)
    //           break second; // break out of second block
    //           break third; // to break out of third block      
                
    //       // System.out.println("break second");
    //     }
    //     System.out.println("break first");
        
    //   }
    // }
String[] medicine= new String[50];
    for(int i =0;i<50;i++)
    {
        medicine[i]=sc.next();
    }

    for(int i =0;i<50;i++)
    {
        System.out.println("Medicine medicine"+(i+1)+" = new Medicine(\""+medicine[i]+"\","+"500"+","+10+","+"\"29.12.2023\""+");");
        System.out.println("medicineList.add("+ "medicine"+(i+1) +");");
    }

    sc.close();
    }
    
  }
