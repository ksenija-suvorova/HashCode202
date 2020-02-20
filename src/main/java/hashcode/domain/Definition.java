package hashcode.domain;

import java.util.List;
import java.util.Map;

public class Definition {
    private List<Library> libraries;
    private List<Book> books;
    private List<Integer> scores;
    private int totalDays;

    public Definition(List<Library> libraries, List<Book> books,
                      int totalDays, List<Integer> scores) {
        this.libraries = libraries;
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
}
