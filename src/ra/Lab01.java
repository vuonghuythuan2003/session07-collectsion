package ra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lab01 {
    public static void main(String[] args) {
        List<Integer> listInt =new ArrayList<>();
        Random addInt = new Random();
        for(int i = 0; i < 10; i++){
            listInt.add(addInt.nextInt(100));
        }
        System.out.println("Danh sách các số nguyên là :" + listInt);
        int maxValue = Collections.max(listInt);
        System.out.println("Giá trị lớn nhất trong mảng là : " +maxValue);
    }
}
