package lab11;

public class Main {
    public static void main(String[] args) {
        MyCache cache = new MyCache();

        StoredObject obj1 = new StoredObject("First object", 5000);
        StoredObject obj2 = new StoredObject("Second object", 10000);
        cache.addObject(obj1);
        cache.addObject(obj2);

        cache.start();

        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
                StoredObject obj = new StoredObject("Object " + (i + 2), 368);
                cache.addObject(obj);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
