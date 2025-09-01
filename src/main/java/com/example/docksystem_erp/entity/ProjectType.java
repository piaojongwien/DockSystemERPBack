package com.example.docksystem_erp.entity;

public enum ProjectType {
    Waiting("대기"),
    Processing("진행"),
    Complete("완료");

    private final String label;

    ProjectType(String label){
        this.label = label;
    }
    public String getLabel(){
        return label;
    }
}
