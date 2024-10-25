package org.example.model;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Tablet extends Device{
    private static final Logger log = LogManager.getLogger(Tablet.class);
    private int tabletId;
    private boolean hasCelullar;

    public Tablet(int tabletId, boolean hasCelullar) {
        this.tabletId = tabletId;
        this.hasCelullar = hasCelullar;
    }

    public Tablet() {
    }

    public int getTabletId() {
        return tabletId;
    }

    public void setTabletId(int tabletId) {
        this.tabletId = tabletId;
    }

    public boolean isHasCelullar() {
        return hasCelullar;
    }

    public void setHasCelullar(boolean hasCelullar) {
        this.hasCelullar = hasCelullar;
    }
}
