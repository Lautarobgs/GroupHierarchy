package org.example.model;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Tablet extends Device{

    private static final Logger log = LogManager.getLogger(Tablet.class);
    private int tabletId;
    private boolean hasCellular;

    public Tablet(Integer id, String brand, String model, Double price, DeviceType type, int tabletId, boolean hasCellular) {
        super(id, brand, model, price, type);
        this.tabletId = tabletId;
        this.hasCellular = hasCellular;
    }

    public Tablet() {
        super();
    }

    public Tablet(int tabletId, boolean hasCellular) {
        this.tabletId = tabletId;
        this.hasCellular = hasCellular;
    }

    public int getTabletId() {
        return tabletId;
    }

    public void setTabletId(int tabletId) {
        this.tabletId = tabletId;
    }

    public boolean getHasCellular() {
        return hasCellular;
    }

    public void setHasCellular(boolean hasCellular) {
        this.hasCellular = hasCellular;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "tabletId=" + tabletId +
                ", hasCellular=" + hasCellular +
                super.toString() +
                '}';
    }
}
