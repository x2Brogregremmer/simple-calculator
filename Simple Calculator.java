import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double var1, var2;
        double result = 0;
        char op = '=';
        boolean bad = false;
        boolean loop = true;
        
        while (loop == true){
            System.out.println("Write the operator");
            op = scanner.next().charAt(0);
            System.out.println("Write the first number: ");
            var1 = scanner.nextInt(); 
            System.out.println("Write the second number: ");
            var2 = scanner.nextInt();
            switch (op)
            {
                case '+':
                    result = var1 + var2;
                    break;
                case '-':
                    result = var1 - var2;
                    break;
                case '*':
                    result = var1 * var2;
                    break;
                case '/':
                    if (var1 == 0 || var2 == 0)
                    {
                        System.out.println("Error!");
                        break;
                    }else{
                        result = var1 / var2;
                        break;
                    }
                    
                default:
                    bad = true;
                    if (bad == true ){
                        System.out.println("Bad!");
                    }
                    break;
            }
            
            System.out.println(result);
            System.out.println("Do you want to use it again? true/false?");
            
            loop = scanner.nextBoolean();
            
            
        }
        
        
    }
    
}
