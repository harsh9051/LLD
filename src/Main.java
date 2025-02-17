import java.util.*;
public class Main {
    public static HashSet<String> set = new HashSet<>();
    public static void main(String[] args) {
        System.out.println(reverseParentheses("a(bcdefghijkl(mno)p)q"));
    }
    public static String reverseParentheses(String s) {
        Stack<String> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(')st.add("(");
            else if(c == ')'){
                String temp = new String();
                while(!st.peek().equals("(")){
                    StringBuilder s1 = new StringBuilder(st.pop());
                    if(s1.length() > 1){
                        s1 = s1.reverse();
                        temp = temp + s1;
                    }else{
                        temp = temp + s1;
                    }
                }
                st.pop();
                st.push(temp);
            }else{
                st.push(String.valueOf(c));
            }
        }
        String ans = "";
        if(st.size() > 1){
            while (!st.isEmpty()){
                ans = st.pop() + ans;
            }
            return ans;
        }
        return st.peek();
    }
}