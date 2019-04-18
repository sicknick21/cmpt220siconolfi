import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayList {

    public static void sort(ArrayList<Integer> list) {
        Integer temp;
        for(int i = 0; i < list.size(); ++i) {
            for(int j = 0; j < list.size()-1; ++j) {
                if(list.get(j).compareTo(list.get(j+1)) > 0) {
                    temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 5;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter " + n + " integers: ");
        for(int i = 0; i < n; ++i) {
            list.add(input.nextInt());
        }
        sort(list);
        System.out.println("Sorted array is: " + list);   
        }

}
