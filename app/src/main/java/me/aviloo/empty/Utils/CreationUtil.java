package me.aviloo.empty.Utils;

import me.aviloo.empty.MainActivity;
import me.aviloo.empty.models.ChildFolder;
import me.aviloo.empty.models.Folder;

public class CreationUtil {

    public static Class<?> getParentFolder(){
        if(ActivityUtil.getActivityClass().equals(MainActivity.class)){
            return null;
        }
        if(ActivityUtil.getActivityClass().equals(Folder.class)){
            return null;
        }
        if(ActivityUtil.getActivityClass().equals(ChildFolder.class)){
            return ActivityUtil.getActivityClass();
        }


        return null;
    }

}
