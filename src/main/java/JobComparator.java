import java.util.HashMap;


// Code adapted from https://stackoverflow.com/questions/14682079/java-arraylist-hashmap-how-to-sort
public class JobComparator implements java.util.Comparator<HashMap<String, String>> {
    public int compare(HashMap<String, String> hash1, HashMap<String, String> hash2) {
        int c = -1;

        //Test each key in the HashMap
        for (String key : hash1.keySet()) {
            c = hash1.get(key).compareTo(hash2.get(key));
            if (c != 0) {
                return c; // Values are different and sorted
            }
            // Else continue to next key
        }
        return c;   //Ensure return statement
    }
}



