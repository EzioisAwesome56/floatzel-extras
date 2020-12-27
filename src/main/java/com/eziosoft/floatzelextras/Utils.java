package com.eziosoft.floatzelextras;

import java.io.InputStream;

public class Utils {

    public static InputStream getResourse(String path, String filename){
        return Utils.class.getResourceAsStream(path + filename);
    }

    public static String getFileType(String filename){
        String[] parts = filename.split("\\.");
        return parts[1];
    }
}
