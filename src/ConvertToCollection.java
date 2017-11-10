import java.util.ArrayList;

import static java.util.Arrays.asList;

public class ConvertToCollection<T> {

    public static <T> ArrayList<T> toArrList(T... arr){
        ArrayList<T> arrList=new ArrayList<T>(asList(arr));
        return arrList;
    }


}
