import java.io.IOException;

public class program {
    public static void main(String[] args) throws IOException {
        ReadFileText readFileText= new ReadFileText("sum.txt");
        readFileText.readFileText();
    }
}
