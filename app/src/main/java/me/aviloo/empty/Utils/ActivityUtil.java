package me.aviloo.empty.Utils;

public class ActivityUtil {

    private static Class<?> activity_class;

    public static void addCurrentActivity(Class<?> aClass){
        activity_class = aClass;
    }

    public static Class<?> getActivityClass(){
        return activity_class;
    }

}
