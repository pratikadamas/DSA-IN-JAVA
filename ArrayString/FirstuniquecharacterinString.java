package ArrayString;
import java.util.*;

public class FirstuniquecharacterinString {

    public static void main(String[] args) {
        String s1="fourbyfourfrog";

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char curr=s1.charAt(i);
            if(map.containsKey(curr)){
                map.put(curr,map.get(s1.charAt(i))+1);
            }
            else{
                map.put(curr,1);
            }
        }

        for(char key:map.keySet()){
            if(map.get(key)==1){
                System.out.println("index value "+s1.indexOf(key));
                break;
            }
        }


    }
}
