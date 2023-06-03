package collection_framework;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(9);
        st.push(8);
        st.push(7);
        st.push(6);
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        System.out.println(st);
        st.pop();
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());

    
    }
    
}
