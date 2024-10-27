package org.example.model;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Tablet extends Device{

    private static final Logger log = LogManager.getLogger(Tablet.class);
    private int tabletId;
    private boolean hasCellular;

    public Tablet(int tabletId, boolean hasCellular) {
        super();
        this.tabletId = tabletId;
        this.hasCellular = hasCellular;
    }

    public Tablet() {
    }

    public int getTabletId() {
        return tabletId;
    }

    public void setTabletId(int tabletId) {
        this.tabletId = tabletId;
    }

    public boolean getHasCelullar() {
        return hasCellular;
    }

    public void setHasCelullar(boolean hasCelullar) {
        this.hasCellular = hasCelullar;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "tabletId=" + tabletId +
                ", hasCellular=" + hasCellular +
                '}';
    }
}
