package lab11;

import java.sql.Timestamp;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MyCache extends Thread {
    private Map<Integer, StoredObject> cache = new ConcurrentHashMap<>();
    private int counter = 1;

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(2000);
                Timestamp crt = new Timestamp(System.currentTimeMillis());
                boolean allExpired = true;

                for (Map.Entry<Integer, StoredObject> entry : cache.entrySet()) {
                    StoredObject storedObject = entry.getValue();
                    if (!storedObject.isExpired() && crt.after(storedObject.getExpirationTime())) {
                        storedObject.setExpired(true);
                        System.out.println("Object with key " + entry.getKey() + " has expired.");
                    }
                    if (!storedObject.isExpired()) {
                        allExpired = false;
                    }
                }

                if (allExpired) {
                    System.out.println("All objects have expired. Stopping the cache thread.");
                    break;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void addObject(StoredObject obj) {
        cache.put(counter++, obj);
        System.out.println("Added object with key " + (counter - 1));
    }
}
