import java.util.*;

public class Qn4to6 {

    public static void main(String[] args) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        hashmap.put(0, 1);
        hashmap.put(1, 3);
        hashmap.put(2, 5);
        hashmap.put(3, 7);
        hashmap.put(4, 9);
        hashmap.put(5, 11);

        System.out.println("Contents: " + hashmap);
        addAndSort(hashmap, 6);
        System.out.println("Contents: " + hashmap);
        swapValues(hashmap, 1, 6);
        System.out.println("Contents: " + hashmap);
        System.out.println("Contents: " + randomHashMap());

    }

    public static void addAndSort(HashMap<Integer, Integer> hashmap, int value) {
        if (hashmap.get(hashmap.size() - 1) < value){
            hashmap.put(hashmap.size(), value);
        }
        else {
            hashmap.put(hashmap.size(), value);
            List<Integer> mapKeys = new ArrayList<>(hashmap.keySet());
            List<Integer> mapValues = new ArrayList<>(hashmap.values());
            Collections.sort(mapValues);
            Collections.sort(mapKeys);

            HashMap<Integer, Integer> sortedMap =
                    new HashMap<>();
            int count = 0;
            for (int val : mapValues) {
                Iterator<Integer> keyIt = mapKeys.iterator();

                while (keyIt.hasNext()) {
                    Integer key = keyIt.next();
                    int comp1 = hashmap.get(key);

                    if (comp1 == val) {
                        keyIt.remove();
                        sortedMap.put(count, val);
                        count++;
                        break;
                    }
                }
            }
            hashmap.putAll(sortedMap);
        }
    }

    public static void swapValues(HashMap<Integer, Integer> hashmap, int indexOne, int indexTwo) {
        int temp1 = hashmap.get(indexOne);
        int temp2 = hashmap.get(indexTwo);

        hashmap.remove(indexOne);
        hashmap.put(indexOne, temp2);
        hashmap.remove(indexTwo);
        hashmap.put(indexTwo, temp1);
    }

    public static int randomHashMap() {
        Random rand = new Random();
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = -1;

        for (int i = 0; i < 500; i++) {
            map.put(i, rand.nextInt(1000, 10000));
        }

        int randomNum = rand.nextInt(1000,10000);

        for (int i = 0; i < 500; i++) {
            if (map.get(i) == randomNum) {
                index = i;
            }
        }

        return index;
    }
}