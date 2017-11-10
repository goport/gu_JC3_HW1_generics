import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.asList;

public class Main {

    public static <T> ArrayList<T> toArrlist2(T... arr) {
        ArrayList<T> arrList = new ArrayList<T>(asList(arr));
        return arrList;
    }


    public static void main(String[] args) {

        String[] strArr = new String[]{"A", "B", "C", "D", "E"};

        new ChangeElements<>().change(strArr, 0, 1);
        System.out.println(Arrays.toString(strArr));

        System.out.println(ConvertToCollection.toArrList(strArr));

        ConvertToCollection.toArrList(strArr);

        System.out.println(toArrlist2(strArr));


    }

}
