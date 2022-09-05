import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> array= new ArrayList<>();

        for(int k = 0; k < 50; k++){
            int m = random.nextInt(1,100);
            arrayList.add(m);
        }
        for (int b = 0; b < 50; b++){
            if (arrayList.get(b) %2 ==0) arr.add(arrayList.get(b));
            else array.add(arrayList.get(b));
        }
        System.out.print("В №1 ArrayList "+arr.size()+" четные числа :");
        System.out.println(arr);
        System.out.print("В №2 ArrayList "+array.size()+" нечетные числа :" );
        System.out.println(array);
    }
}
