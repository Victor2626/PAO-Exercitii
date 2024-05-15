package lab11;

import java.sql.Timestamp;

public class StoredObject {
    private Object myInfo;
    private boolean expired;
    private Timestamp expirationTime;

    public StoredObject(Object myInfo, long expirationDurationMs) {
        this.myInfo = myInfo;
        this.expirationTime = new Timestamp(System.currentTimeMillis() + expirationDurationMs);
    }

    public Object getMyInfo() {
        return myInfo;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public Timestamp getExpirationTime() {
        return expirationTime;
    }
}
