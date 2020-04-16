package Web;

import java.util.function.BiFunction;

public class Calculator {
       private int toInt(String number){
           return Integer.valueOf(number);
       }

       public String doOperation(String sx , String sy , String  op){
           String result;
           try{
               int x = toInt(sx);
               int y = toInt(sy);
               int res = doParse(x,y,op);
               result = String.valueOf(res);
           }catch (NumberFormatException ex) {
               result = "Number is in wrong format";
           } catch (IllegalArgumentException ex) {
               result = ex.getMessage();
           } catch (ArithmeticException ex) {
               result = "Division by zero caught";
           } catch (Exception x) {
               result = String.format("Smth went wrong %s", x.getMessage());
           }
           return result;

       }

       private  int doOpCore(int x , int y , BiFunction<Integer ,Integer , Integer> function){
           return function.apply(x,y);
       }

    public int doParse(int x, int y, String op) {
         switch (op){
             case "add" : return doOpCore(x, y, (a, b)-> a+b);
             case "sub" : return doOpCore(x, y, (a, b)-> a-b);
             case "mul" : return doOpCore(x, y, (a, b)-> a*b);
             case "div" : return doOpCore(x, y, (a, b)-> a/b);
             default: throw  new IllegalArgumentException("Wrong Operation.");
         }
    }


}
