package me.aviloo.empty.models;

public class Folder {
    private String name;
    private boolean none_cash;

    public Folder(String name,Boolean cash){
        this.name = name;
        this.none_cash = cash;
    }

    public Folder(String name){
        this.name = name;
        this.none_cash = false;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNone_cash() {
        return none_cash;
    }

    public void setNone_cash(boolean none_cash) {
        this.none_cash = none_cash;
    }

}
