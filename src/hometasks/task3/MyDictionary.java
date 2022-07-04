package hometasks.task3;


import java.util.HashMap;
import java.util.Map;


public class MyDictionary<TKey, TValue> implements IMyDictionary<TKey, TValue> {

    Map<TKey, TValue> dictionary = new HashMap<>();

    @Override
    public Map<TKey, TValue> getDictionary() {
        return dictionary;
    }

    @Override
    public void addMeth(TKey key, TValue value) {
        dictionary.put(key, value);
    }

    @Override
    public TValue indexOfMeth(TKey key) {
        return dictionary.get(key);

    }

    @Override
    public int count() {
        return dictionary.size();
    }

    public static void main(String[] args) {


        IMyDictionary<Integer, String> dict = new MyDictionary<>();
        dict.addMeth(123, "Hello");
        dict.addMeth(234, "World");
        dict.addMeth(567, "or");
        dict.addMeth(890, "not");

        System.out.println(dict.getDictionary());

        System.out.println("Index = " + dict.indexOfMeth(567));
        System.out.println("Count = " + dict.count());
    }

}

interface IMyDictionary<TKey, TValue> {

    Map<TKey, TValue> getDictionary();

    void addMeth(TKey key, TValue value);

    TValue indexOfMeth(TKey key);

    int count();
}