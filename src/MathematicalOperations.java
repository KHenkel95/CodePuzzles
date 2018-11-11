/*Write a method that takes 3 arguments- an operation and 2 numbers and use the operation on the two numbers
and return the answer
 */
public class MathematicalOperations {
    public static Integer basicMath(String op, int v1, int v2){
        int answer = 0;
        if (op.equals("+")){
            answer = v1+v2;
        }
        else if (op.equals("-")){
            answer = v1-v2;
        }
        else if (op.equals("*")){
            answer = v1*v2;
        }
        else if (op.equals("/")){
            answer = v1/v2;
        }
        else if (op.equals("%")){
            answer = v1%v2;
        }
        return answer;
    }
}
