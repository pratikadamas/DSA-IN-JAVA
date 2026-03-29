package ArrayString;
import java.util.*;

public class FirstuniquecharacterinString {

    public static void main(String[] args) {
//        String s1="fourbyfourfrog";
        String s1="ilovetocode";
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
//        System.out.println(map);
        for(int i = 0; i < s1.length(); i++){
            char curr = s1.charAt(i);
            if(map.get(curr) == 1){

                System.out.println(curr+" index value " + i);
                break;
            }
        }


    }
}
