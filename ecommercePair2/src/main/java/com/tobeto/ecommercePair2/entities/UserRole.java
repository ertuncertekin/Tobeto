package com.tobeto.ecommercePair2.entities;

public enum UserRole {
    CUSTOMER,
    ADMIN;
    public static UserRole fromString(String text) {
        for (UserRole userRole : UserRole.values()) {
            if (userRole.name().equalsIgnoreCase(text)) {
                return userRole;
            }
        }
        throw new IllegalArgumentException("Invalid user role: " + text);
    }


}
