
//subsequence is contiguous a noncontiguous sequence which follows the order
//Total number of subsequences for an array of size n = 2^n

package Recursion;
import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequence
{
    public static  void subsequnece(int index, List<Integer> li ,List<Integer> list,int size){

        if(index>=size){
            System.out.println(list);
            return;
        }
        list.add(li.get(index));// take that index into subsequence

        subsequnece(index+1,li,list,size);

        list.remove(li.get(index)); // not take that index into subsequence
        subsequnece(index+1,li,list,size);

    }
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        li.add(3);
        li.add(1);
        li.add(2);
        li.add(4);
        int size=li.size();
        List<Integer> list=new ArrayList<>();
        subsequnece(0,li,list,size);

    }
}
