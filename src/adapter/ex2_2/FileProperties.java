package adapter.ex2_2;

import java.io.*;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {
    @Override
    public void readFromFile(String filename) throws IOException {
        File file = new File(filename);
        FileInputStream fs = new FileInputStream(file);
        load(fs);
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        File file = new File(filename);
        FileOutputStream fs = new FileOutputStream(file);
        store(fs, "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key);
    }
}
