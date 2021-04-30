package com.easylab.service.enums;

public enum ApplicationStatus {
    INACTIVE("N");
    private final String value;

    ApplicationStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
