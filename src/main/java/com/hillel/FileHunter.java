package com.hillel;

import java.io.File;

public class FileHunter {

    private File foundFile;

    public File findAbsoluteFile(File dir, String fileName) {
        for (File currentFile : dir.listFiles()) {
            if (currentFile.getName().equals(fileName)) {
                foundFile = currentFile.getAbsoluteFile();
                break;
            } else if (foundFile == null && currentFile.isDirectory()) {
                findAbsoluteFile(currentFile, fileName);
            }
            if (foundFile != null) break;
        }
        return foundFile;
    }

}
