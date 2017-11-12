import java.util.ArrayList;
import java.util.Iterator;

import static java.lang.Math.abs;

public class Box<T extends Fruit> {
    private float boxWeight;
    private ArrayList<T> boxList;

    public Box() {
        boxList = new ArrayList<>();
    }

    public void addToBox(T fruit) {
        boxList.add(fruit);
    }


    public float getBoxWeight() {
        float boxWeight = 0f;
        if (this.boxList.isEmpty()) return boxWeight;
        for (T el : boxList) {
            boxWeight += el.weight;
        }
        return boxWeight;
    }

    public boolean compare(Box another) {
        return abs(this.getBoxWeight() - another.getBoxWeight()) < 0.001;
    }

    public void transferTo(Box dst) {
        if (this.equals(dst)) {
            System.out.println("Фрукты уже в этой корзине");
            return;
        }

        if (this.boxList.isEmpty()) System.out.println("Вы пытаетесь переложить фрукты из пустой корзины");
        else if ((dst.boxList.isEmpty()) || dst.boxList.get(0).getClass() == this.boxList.get(0).getClass()) {
            String fruit;
            switch (this.boxList.get(0).getClass().toString()) {
                case "class Apple":
                    fruit = "Яблоки";
                    break;
                case "class Orange":
                    fruit = "Апельсины";
                    break;
                default:
                    fruit = "Неведомые фрукты";
            }

            dst.boxList.addAll(this.boxList);
            this.boxList.removeAll(this.boxList);

            System.out.println(fruit+" переложены");
        } else System.out.println("Нельзя перекладывать разные фрукты");
    }
}



