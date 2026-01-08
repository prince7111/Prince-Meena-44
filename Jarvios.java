//om namha shivya
import java.util.Scanner;
public class Jarvios{
    
       
    public static boolean isYes(String respondStr){
        return respondStr.charAt(0) == ('Y') || respondStr.charAt(0) == ('y');
    }
    public static void main(String args[]){
        //hello jarvios
        Scanner sc = new Scanner(System.in);
        String myName = "prince";
        System.out.println("Enter your Name sir:\n------------------------------");
        String enteredName = sc.nextLine();
        System.out.println("...");
        
        //Hello jarvios
        System.out.println("Notice: to activate say:hello jarvios\n----->---->---->------->------>");
        String c = sc.nextLine();
        String jrvsName = "jarvios";
        int i = 6;int i2 =0;
        while(i<=12){
            if(c.charAt(i) !=jrvsName.charAt(i2)){
                System.out.println("Sorry sir,\nTo Activate Please type: Hello jarvios");
                break;
            }
            i2++;
            i++;
             System.out.println("Hello"+enteredName+"sir\nI Am Jarvios A Virtual Artificial Intellegence\n-----------------------------");
           break;
        }
        System.out.println("Are You Mr Prince Meena ? sir ");
        String respond = sc.nextLine();
        if(isYes(respond)){
            System.out.println("Hello Mr"+myName+ "whats goin on Sir,");
            return;
        }else {
            System.out.println("Sorry Mr"+enteredName+"\n i have not permision to activate\n");
            System.out.println("i havent permision wothout Prince \n");
            System.out.println("is any message "+enteredName+ "sir");
            return;
        }

      
       

        
    }
}