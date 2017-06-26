package br.com.tricard.empresarial;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;

/**
 * Created by Fuinha on 26/06/2017.
 */

public class CreateUniqueFile {

    private File newFile (String prefix, String suffix, File dir) throws IOException {
        // Create an image file name based on a prefix
        int time = (int) (System.currentTimeMillis());
        Timestamp tsTemp = new Timestamp(time);
        String ts =  tsTemp.toString();
        String fileName = prefix + "_" + ts + "_";
        File file = File.createTempFile(
                fileName,  /* prefix */
                suffix,    /* suffix */
                dir        /* directory */
        );
        return file;
    }
}
