public class changeElements<T> {


    public T obj;
    private T bufObj;

    public void change(changeElements<T> another){
        bufObj=this.obj;
        this.obj=another.obj;
        another.obj=bufObj;
    }
}
