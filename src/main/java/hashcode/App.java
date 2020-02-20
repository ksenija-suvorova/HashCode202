package hashcode;

import hashcode.domain.Book;
import hashcode.domain.Definition;
import hashcode.domain.Library;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        Definition definition = loadDefinition("a_example.txt");
        System.out.println("definition" + definition);
    }

    public static Definition loadDefinition(String filename) {
        List<Book> books = new ArrayList<>();
        Integer libraryCount;
        Integer days;
        int lines = 0;

        File file = new File(App.class.getClassLoader().getResource(filename).getFile());
        String content = null;
        try {
            content = FileUtils.readFileToString(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        content = content.replaceAll("\r", "");

        String[] line = content.split("\n");

        String[] initialLine = line[lines].split(" ");
        lines++;

        Integer booksCount = Integer.valueOf(initialLine[0]);
        libraryCount = Integer.valueOf(initialLine[1]);
        days = Integer.valueOf(initialLine[2]);

        String[] booksScore = line[lines].split(" ");
        List<Integer> scores = Arrays.asList(booksScore)
                .stream()
                .map(s -> Integer.valueOf(s))
                .collect(Collectors.toList());
        lines++;

        for (int index=0; index<booksScore.length; index++){
            Book book = new Book(index, Integer.valueOf(booksScore[index]));
            books.add(book);
        }

        List<Library> libraries = new ArrayList<>();
        for (int libraryId = 0; libraryId<libraryCount; libraryId++) {
            String[] libraryInformation = line[lines].split(" ");
            lines++;
            String[] libraryBooks = line[lines].split(" ");
            lines++;
            Set<Integer> bookIds = new HashSet(Arrays.asList(libraryBooks));
            libraries.add(new Library(libraryId, Integer.valueOf(libraryInformation[1]), Integer.valueOf(libraryInformation[2]), bookIds));
        }

        return new Definition(filename, libraries, books, days, scores);
    }
}