package me.aviloo.empty.Utils;

import java.util.ArrayList;

import me.aviloo.empty.models.Employer;

public class StorageUtils {

    public static ArrayList<Employer> employersArray = new ArrayList<>();

    public static void addEmployer(Employer employer){
        employersArray.add(employer);
    }


}
