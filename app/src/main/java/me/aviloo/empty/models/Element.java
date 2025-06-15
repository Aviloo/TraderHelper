package me.aviloo.empty.models;

import java.util.ArrayList;

public class Element {

    private String name;
    private ArrayList<String> description;
    private Folder parentFolder;
    // Тут добавить способ хранения картинок

    public Element(String name,ArrayList<String> description,Folder parentFolder){
        this.name = name;
        description = new ArrayList<>();
        this.description = description;
        this.parentFolder = parentFolder;
    }
}
