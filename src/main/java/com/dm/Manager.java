package com.dm;

import java.io.File;

public class Manager {

    public static void main(String[] args) {

        String source = "/Users/muralikrishnan/Downloads";

        File file = new File(source);

        File[] fileList = file.listFiles();

        for (int i = 0; i < fileList.length; i++) {

            if (fileList[i].isDirectory()) {

                File[] nestedFileList = fileList[i].listFiles();

                for (int j = 0; j < nestedFileList.length; j++) {
                    System.out.println(nestedFileList[j].getName());
                }

            }
        }

    }
}
