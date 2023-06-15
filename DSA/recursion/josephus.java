package DSA.recursion;

import java.util.Vector;

public class josephus {
    static void solve(Vector vec,int k,int index,int ans){

        if(vec.size()==1){
            ans=vec[0];
            return;
        }
        index=(index+k)%vec.size();
        vec.removeElementAt(index);//reomiving one person
        solve(vec, k, index, ans);


    }
    public static void main(String[] args) {
        int n=40;
        int k=7;
        //vec is persons
        //index is sword
        Vector<Integer> vec=new Vector<Integer>();
        for (int i=1;i<=n;i++){
            vec.add(i);
        }
        // System.out.println(vec);
        k=k--;
        int index=0;
        int ans=-1;
        solve(vec, k, index, ans);
    }
    
}
