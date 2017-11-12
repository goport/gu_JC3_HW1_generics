public class ChangeElements<T> {

    public static <T> void change(T[] element,int index1, int index2){
        T bufElement;
        bufElement=element[index1];
        element[index1]=element[index2];
        element[index2]=bufElement;
    }
}