package com.easylab.service.enums;

public enum ApplicationErrors {
    INQ_ID_NOT_FOUND("error.inquiry.id.not.found");
    private final String value;

    ApplicationErrors(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
