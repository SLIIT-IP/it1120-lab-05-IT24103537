import java.util.Scanner; 

public class it24103537Lab5Q2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter the number of new members introduced: ");
        int numofmembers =scanner.nextInt();

        if(numofmembers >= 0){
          String prize;

           switch(numofmembers){
              case 0:
                 prize = "No price";
		 break;

              case 1:
                 prize = "Pen";
                  break;

              case 2:
                 prize = "Umbrella";
		  break;

              case 3:
                 prize = "Bag";
		 break;

              case 4:
	         prize = "Travelling bag";
		 break;

	      default:
		 prize = "head Phone";
                  break;
            }
              System.out.println("Prize is: " + prize);
         } else {
                System.out.println("input must be a number 0 or greater");
           
           
           
          }
     }
}
   