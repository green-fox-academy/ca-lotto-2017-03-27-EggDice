import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Lotto {
  final public static String CSV_PATH = "assets/otos.csv";

  public static void main(String[] args) {
    try {
      Path rawCsv = Paths.get(CSV_PATH);
      List<String> lines = Files.readAllLines(rawCsv);
    } catch (IOException e) {
      System.out.println("Unable to read the file :(");
    }
    System.out.println("File is loaded");
  }
}
