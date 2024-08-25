import java.util.Scanner;

public class it24103537lab5Q3 {
  public static final double room_charge_pd = 48000.0;


  public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

      System.out.print("Enter Start Date(1-31): ");
      int Sdate = scanner.nextInt();
  
      System.out.print("Enter End Date(1-31): ");
      int Edate = scanner.nextInt();
     
      if(Sdate >= Edate) {
         System.out.println("Error:Start date must be less than End date !!!!");
      } else if (Sdate < 1 || Sdate > 31 || Edate < 1 || Edate >31){
         System.out.println("Error: Dates must be between 1 and 31 !!!!");
      } else{
         int ReservedDays = Edate - Sdate;
      
       
      double dis =0.0;
      if(ReservedDays>=3 && ReservedDays<=4) {
         dis = 10;
      }else if(ReservedDays >= 5){
          dis = 20;
      }
     
      double Total = room_charge_pd * ReservedDays;
      double disTotal = Total *(dis/100);
      Total = Total - disTotal;
     
      System.out.println("Room Charge Per Day: Rs."+room_charge_pd);
      System.out.println("Number of Days Reserved: "+ReservedDays);
      System.out.println("Total Amount to Pay:" + Total);
      }
    }
}
    
      
 
      
