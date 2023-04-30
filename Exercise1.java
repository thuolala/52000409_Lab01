import java.util.*;

public class Exercise1 {
    public static void main(String[] args){
        if(args.length == 0 || Arrays.stream(args).anyMatch(" "::equals)){
            System.out.println("Invalid Expression!");
        }
        else{
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[2]);
            String ope = args[1];
            String[] operators = {"+", "-", "x", "/", "^"};
            boolean contains = Arrays.stream(operators).anyMatch(ope::equals);
            if(contains == true){
                double res = 0.0;
                switch (ope) {
                    case "+":
                        res = a + b;
                        break;
                    case "-":
                        res = a - b;
                        break;
                    case "x":
                        res = a * b;
                        break;
                    case "/":
                        res = a / b;
                        break;
                    case "^":
                        res = Math.pow(a, b);
                        break;      
                }
                System.out.println(res);
            }
            else{
                System.out.println("Unsupported operator!");
            }
        }
    }
}
