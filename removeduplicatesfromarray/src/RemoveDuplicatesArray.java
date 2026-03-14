import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RemoveDuplicatesArray {

//    public int removeduplicates(int[] array) {
//
//        HashSet<Integer> map = new HashSet<>();
//
//        int index = 0;
//
//        for (int i = 0; i < array.length; i++) {
//
//            if (!map.contains(array[i])) {
//                map.add(array[i]);
//                array[index++] = array[i];
//            }
//
//        }
//
//        return index;
//
//    }


    public int[] removeDupes(int[] array) {

        HashSet<Integer> seen = new HashSet<>();

        // ✅ Loop over array, not seen
        for (int num : array) {
            seen.add(num);
        }

        int[] resultArray = new int[seen.size()];

        int index = 0;

        for (int num : seen) {
            resultArray[index++] = num;
        }

        return resultArray;
    }


}
