import java.io.*;

public class ReadAndWriteFile {
    public String readFile(String filePath) throws IOException {
        File file =new File(filePath);
        BufferedReader br =new BufferedReader(new FileReader(file));
        String line="";
        String result="";
        while ((line= br.readLine())!=null){
            result+=line+"\n";
        }
        br.close();
        return result;
    }
    public void writeFile(String filePath,String result) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write(result);
        bufferedWriter.close();
    }
}
