import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileText  {
    private String path="";
    File file=null;
    double sum=0;

    public ReadFileText(String path) throws IOException{
        this.path=path;
    }
    private boolean createFile(){
         this.file= new File(path);
         if (file.exists()){
             System.out.println("Not exist");
             return false;
         }
         return true;
    }
    public void readFileText() throws IOException {
        boolean existFile=createFile();
        if (existFile) return;
        FileReader fileReader= new FileReader(file);
        BufferedReader bufferedReader= new BufferedReader(fileReader);

        String line =null;
        while ((line=bufferedReader.readLine())!=null){
            System.out.println(line);
            try {
                sum+= Double.parseDouble(line);
            }catch (Exception e){
                System.out.println("File not invalid");
                return;
            }
        }
        System.out.println("Sum: "+sum);
    }
}
