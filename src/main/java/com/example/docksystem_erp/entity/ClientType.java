package com.example.docksystem_erp.entity;

public enum ClientType {
    MATERIAL("자재"),
    EQUIPMENT("장비");

    private final String label;

    ClientType(String label){
        this.label=label;
    }
    public String getLabel(){
        return label;
    }

}
