package StackQueue;
import java.util.Stack;

public class InfixtoPostfix {

    static String InfixToPostfix(String s){
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();
       for( int i = 0; i < s.length(); i++ ){
           char ch = s.charAt(i);
           // Operand
           if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')||(ch>='0'&&ch<='9')){
               res.append(ch);
           }
           //opening bracket
           else if (ch=='(') {
               st.push('(');

           }
           else if (ch==')') {
               while (!st.isEmpty() && st.peek()!='('){
                   res.append(st.pop());
               }
               st.pop();
           }
           //operator
//           Because there can be multiple operators already in the stack that must come out before the new one goes in.
           else {
              while (!st.isEmpty() && priority(st.peek())>=priority(ch)){
                  res.append(st.pop());

              }
              st.push(ch);
           }


       }

       // remaing element
        while (!st.isEmpty()){
            res.append(st.pop());
        }

        return res.toString();
    }


    static int priority(char ch){
        switch(ch){
            case '+':
                case '-': return 1;
                    case '*':
                        case '/': return 2;
                            case '^': return 3;
        }
        return -1;
    }

    public static void main(String[] args) {
        String infix = "a+b*(c^d-c)";
        System.out.println(InfixToPostfix(infix));


    }
}
