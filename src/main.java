import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        String result = readAndWriteFile.readFile("source.txt");
        readAndWriteFile.writeFile("target.txt",result);
    }
}
