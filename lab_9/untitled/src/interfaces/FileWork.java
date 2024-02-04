package interfaces;

import java.io.IOException;

public interface FileWork {
    void deleteFile();
    void readFromFile() throws IOException;
    void writeToFile() throws IOException, IndexOutOfBoundsException;
}