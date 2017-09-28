package services;

import java.io.Serializable;

/**
 *
 * @author Sean Jeske
 */   
  public class Calculator implements Serializable
  {
    
    
    public static double operate(String number1, String number2, String operation){
        double result =0.00;
        
        double n1 = Double.parseDouble(number1);
        double n2 = Double.parseDouble(number2);
        
        switch(operation){
            case "+": result = n1 + n2;
                break;
            case "-": result = n1 - n2;
                break;
            case "%": result = n1 % n2;
                break;
            case "*": result = n1 * n2;
                break;
        }
        
        return result;
    }
}