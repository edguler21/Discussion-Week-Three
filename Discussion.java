import java.util.ArrayList;

public class Discussion {
    public static void main(String[] args) {

        int[] numberArray = new int[3];
        numberArray[0] = 10;
        numberArray[1] = 20;
        numberArray[2] = 30;

        System.out.println("Array values:");
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("Index " + i + ": " + numberArray[i]);
        }

        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40); 
        System.out.println("\nArrayList values:");
        for (int i = 0; i < numberList.size(); i++) {
            System.out.println("Index " + i + ": " + numberList.get(i));
        }

        numberList.remove(0); 
        numberList.add(100); 

        System.out.println("\nModified ArrayList:");
        for (int num : numberList) {
            System.out.println(num);
        }
    }
}