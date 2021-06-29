package me.reb4ck.hyperreforge.enums;

public enum ItemType {
    WEAPONS,
    BOW,
    ARMORS;

    public final String name;

    ItemType() {
        this.name = toString();
    }
}
