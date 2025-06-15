package me.aviloo.empty.models;

public class ChildFolder extends Folder{
    private Folder parentFolder;

    public ChildFolder(String name,Folder parentFolder) {
        super(name);
        this.parentFolder = parentFolder;
    }

    public ChildFolder(String name,Boolean cash,Folder parentFolder){
        super(name,cash);
        this.parentFolder = parentFolder;
    }


    public Folder getParentFolder() {
        return parentFolder;
    }

    public void setParentFolder(Folder parentFolder) {
        this.parentFolder = parentFolder;
    }

}
