import java.util.LinkedList;
import java.util.Random;

public class Qn1to3 {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(9);
        linkedList.add(11);

        System.out.println("Contents: " + linkedList);
        addAndSort(linkedList, 6);
        System.out.println("Contents: " + linkedList);
        swapValues(linkedList, 1, 6);
        System.out.println("Contents: " + linkedList);
        System.out.println("Contents: " + randomLinkedList());
    }

    public static void addAndSort(LinkedList<Integer> linkedList, int value) {
        if (linkedList.get(linkedList.size()-1) < value){
            linkedList.add(linkedList.size(), value);
        }
        else {
            int i = 0;
            while(linkedList.get(i) < value) {
                i++;
            }
            linkedList.add(i, value);
        }
    }

    public static void swapValues(LinkedList<Integer> linkedList, int indexOne, int indexTwo) {
        int temp1 = linkedList.get(indexOne);
        int temp2 = linkedList.get(indexTwo);

        linkedList.remove(indexOne);
        linkedList.add(indexOne, temp2);
        linkedList.remove(indexTwo);
        linkedList.add(indexTwo, temp1);
    }

    public static int randomLinkedList() {
        Random rand = new Random();
        LinkedList<Integer> linkedList = new LinkedList<>();
        int index = -1;

        for (int i = 0; i < 500; i++) {
            linkedList.add(rand.nextInt(1000, 10000));
        }

        int randomNum = rand.nextInt(1000, 10000);

        for (int i = 0; i < 500; i++) {
            if (linkedList.get(i) == randomNum) {
                index = i;
            }
        }

        return index;
    }
}
