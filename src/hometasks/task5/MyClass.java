package hometasks.task5;

public class MyClass<T> {

    static <T> void factoryMethod(T t) {
        System.out.println(t.toString());
    }

    public static void main(String[] args) {

        factoryMethod(4.47);
        factoryMethod(588564565455455556L);
        factoryMethod(2.587f);
        factoryMethod("Hello");
        factoryMethod(3);

    }

}
