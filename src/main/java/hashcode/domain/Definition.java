package hashcode.domain;

import java.util.List;
import java.util.Map;

public class Definition {
    private String filename;
    private List<Library> libraries;
    private List<Book> books;
    private List<Integer> scores;
    private int totalDays;

    public Definition(String filename, List<Library> libraries, List<Book> books,
                      int totalDays, List<Integer> scores) {
        this.filename = filename;
        this.libraries = libraries;
        this.books = books;
        this.totalDays = totalDays;
        this.scores = scores;
    }

    public List<Library> getLibraries() {
        return libraries;
    }

    public List<Book> getBooks() {
        return books;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public List<Integer> getScores() {
        return scores;
    }

    public String getFilename() {
        if (filename.contains(".")) {
            return filename.substring(0, filename.lastIndexOf(".") - 1);
        }
        return filename;
    }
}
