public class ChangeElements<T> {

    private T bufElement;

    public void change(T[] element,int index1, int index2){
        bufElement=element[index1];
        element[index1]=element[index2];
        element[index2]=bufElement;
    }
}