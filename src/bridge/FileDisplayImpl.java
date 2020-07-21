package bridge;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDisplayImpl extends DisplayImpl {
    private String filename;
    private FileReader fileReader;

    public FileDisplayImpl(String filename) {
        this.filename = filename;
    }

    @Override
    public void rawOpen() {
        File file = new File(filename);
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rawPrint() {
        try {
            int ch;
            while ((ch = fileReader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void rawClose() {
        try {
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
