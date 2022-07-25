package JavaLearnings;

import java.io.File;

public class GetFile {



    public static void main(String[] args) {


        File dir = new File("C:\\Users\\002S4W744\\Desktop\\ADP");
        File[] files = dir.listFiles();
        File lastModifiedFile = files[0];
        if (files != null || files.length != 0) {

            for (int i = 1; i < files.length; i++) {
                if (lastModifiedFile.lastModified() < files[i].lastModified()) {
                    lastModifiedFile = files[i];

                }

            }
            System.out.println(lastModifiedFile);


        }


    }
}
