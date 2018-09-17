import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bookexample {

	public static void main(String[] args) throws IOException {
        Path path = Paths.get("dane.txt");
        List<String> allLines = Files.readAllLines(path);




         List<Book> books = allLines.stream()
                .map(x -> convert(x))
                .collect(Collectors.toList());

        books.forEach(x -> System.out.println(x));





    }

    public static Book convert(String lineToConvert) {
        String[] split = lineToConvert.split(";");
        return new Book(split[0], split[1], Integer.parseInt(split[2]), Integer.parseInt(split[3]), split[4], split[5], Integer.parseInt(split[6]) );
    }

}
