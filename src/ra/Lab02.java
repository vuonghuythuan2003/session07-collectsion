package ra;

import java.util.ArrayList;
import java.util.List;

public class Lab02 {
    public static void main(String[] args) {
        String str1 = "Tôi là Vương Huy Thuận";
        String srt2 = "Người sẽ trở thành VHT trong tương lai";
        String str3 = "hi";
        List<String> strArrList = new ArrayList<String>();
        strArrList.add(str1);
        strArrList.add(str3);
        strArrList.add(srt2);
        for(int i = 0; i < strArrList.size(); i++){
            String stringArrList = strArrList.get(i);
            if(stringArrList.length() >= 3) {
                System.out.println(stringArrList);
            }
            }
        }
    }

