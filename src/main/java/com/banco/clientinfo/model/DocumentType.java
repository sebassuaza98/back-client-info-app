package com.banco.clientinfo.model;

public enum DocumentType {
    CEDULA("C"),
    PASAPORTE("P");

    private final String type;

    DocumentType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static DocumentType fromString(String type) {
        for (DocumentType dt : DocumentType.values()) {
            if (dt.getType().equalsIgnoreCase(type)) {
                return dt;
            }
        }
        throw new IllegalArgumentException("Invalid document type: " + type);
    }
}
