package tp01;

public class Ex03 {
	public static void main(String[] args) {
	    
        String str2 = args[1];
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[2]);
        switch(str2)
        {
            case "+":
                System.out.println("Addition of "+num1+" and "+num2+" : "+(num1+num2));
                break;

            case "-":
                System.out.println("Subtraction of "+num1+" and "+num2+" : "+(num1-num2));
                break;

            case "*":
                System.out.println("Multiplication of "+num1+" and "+num2+" : "+(num1*num2));
                break;

            case "/":
                System.out.println("Division of "+num1+" and "+num2+" : "+(num1/num2));
                break;

            case "%":
                System.out.println("Modulo of "+num1+" and "+num2+" : "+(num1%num2));
                break;


            default:
                System.out.println("Please Enter '+', '-', '*', '/' & '%' operator only.");
        }
        // System.out.println(som);
        }

}
