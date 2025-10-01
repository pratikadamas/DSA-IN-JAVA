package ARRAY_STRING;
import java.util.*;

// Rotate Matrix in 90 degree

public class RotateMatrix {
    public static void main(String[] args) {
        Vector<Vector<Integer>> vec = new Vector<>();
        vec.add(new Vector<>(Arrays.asList(1, 2, 3, 4)));
        vec.add(new Vector<>(Arrays.asList(5, 6, 7, 8)));
        vec.add(new Vector<>(Arrays.asList(9, 10, 11, 12)));
        vec.add(new Vector<>(Arrays.asList(13, 14, 15, 16)));

        int n = vec.size(); // assuming square matrix

        // Transpose in place
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Integer temp = vec.get(i).get(j);
                vec.get(i).set(j, vec.get(j).get(i));
                vec.get(j).set(i, temp);
            }
        }

        // reverse each row

        for (int i = 0; i < n; i++) {
            Collections.reverse(vec.get(i));
        }

        // Print result
        for (Vector<Integer> row : vec) {
            System.out.println(row);
        }
    }
            
        }

//                [13, 9, 5, 1]
//                [14, 10, 6, 2]
//                [15, 11, 7, 3]
//                [16, 12, 8, 4]





