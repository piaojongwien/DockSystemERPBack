package com.example.docksystem_erp.entity;

public enum EquipmentStatusType {
    Operating("가동"),
    NotOperating("비가동"),
    Repair("수리"),
    Disposed("폐기");

    private final String label;

    EquipmentStatusType(String label){
        this.label = label;
    }
    public String getLabel(){
        return label;
    }
}
