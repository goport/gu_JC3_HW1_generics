import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] strArr = new String[]{"A", "B", "C", "D", "E"};
        //------------------task1----------------------
        ChangeElements.change(strArr, 0, 1);
        System.out.println(Arrays.toString(strArr));
        //------------------task2-----------------------
        System.out.println(ConvertToCollection.toArrList(strArr));
        //------------------task3-----------------------
        Apple apl=new Apple();
        Orange org=new Orange();

        Box<Apple> box1=new Box<>();
        Box<Apple> box2=new Box<>();
        Box<Orange> box3=new Box<>();

        box1.addToBox(apl);
        box1.addToBox(apl);

        box2.addToBox(apl);

        box3.addToBox(org);
        box3.addToBox(org);

        box2.transferTo(box1);
        System.out.println("Веса корзин равны: "+box3.compare(box1));

        System.out.println(box1.getBoxWeight());
        System.out.println(box3.getBoxWeight());

    }

}
