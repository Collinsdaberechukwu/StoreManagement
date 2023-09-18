package org.collins_romeo_code;

import javax.sound.sampled.Line;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReaderFile {
         public ReaderFile()throws IOException{
        String path = "/Users/deca/IdeaProjects/StoreManagement/src/main/java/org/collins_romeo_code/Form/ProducList52919e14854a24821ba3c76db7478948034c7ac48756e2bf4b0607f46cb6fb84.csv";
//        String Line = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            String Line ;
            while ((Line = reader.readLine()) != null);
            String value[]  = Line.split(",");
            System.out.println(Arrays.toString(value));
        }

    }

    public static void main(String[] args) throws IOException{

    }
}
