package com.smiley.enums;

public enum DessertType {
    CAKE(0), MOUSSE(1);

    private int value;

    DessertType(int value) {
        this.value = value;
    }

    public static DessertType valueOf(int value) {
        for (DessertType type : DessertType.values()) {
            if (type.value == value) {
                return type;
            }
        }
        return null;
    }
}
