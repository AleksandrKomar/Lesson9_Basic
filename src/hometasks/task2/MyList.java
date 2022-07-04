package hometasks.task2;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> implements IList<T> {

    List<T> list = new ArrayList<>();

    @Override
    public List<T> getList() {
        return list;
    }

    @Override
    public void addMeth(T t) {
        list.add(t);
    }

    @Override
    public int indexOfMeth(T t) {
        return list.indexOf(t);
    }

    @Override
    public int count() {
        return list.size();
    }

    public static void main(String[] args) {

        ///////////////пример сj String
        IList<String> list_s = new MyList<>();

        list_s.addMeth("Hello");
        list_s.addMeth("world");

        System.out.println(list_s.getList());

        System.out.println("Index = " + list_s.indexOfMeth("Hello"));
        System.out.println("Count = " + list_s.count());

        System.out.println("--------------------------------");

        ///////////////пример с Integer
        IList<Integer> list_i = new MyList<>();

        list_i.addMeth(123);
        list_i.addMeth(456);
        list_i.addMeth(789);

        System.out.println(list_i.getList());

        System.out.println("Index = " + list_i.indexOfMeth(456));
        System.out.println("Count = " + list_i.count());

    }
}

interface IList<T> {

    List<T> getList();

    void addMeth(T t);

    int indexOfMeth(T t);

    int count();

}
