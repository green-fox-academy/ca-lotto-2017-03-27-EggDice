import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Lotto {
  final public static String CSV_PATH = "assets/otos.csv";

  public static void main(String[] args) {
    List<String> lines = readFileLines();
    for (String line : lines) {
      System.out.println(line);
    }
  }

  public static List<String> readFileLines() {
    List<String> lines;
    try {
      Path rawCsv = Paths.get(CSV_PATH);
      lines = Files.readAllLines(rawCsv);
    } catch (IOException e) {
      System.out.println("Unable to read the file :(");
      lines = new ArrayList<>();
    }
    System.out.println("File is loaded");
    return lines;
  }
}
