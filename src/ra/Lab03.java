package ra;

import java.util.ArrayList;
import java.util.List;

public class Lab03 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        final int[] sum = {0};
        list.forEach(number -> {
            sum[0] += number;
        });
        System.out.println(sum[0]);

    }
}
