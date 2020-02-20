package hashcode.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Library {
    private int id;
    private int signup;
    private int booksPerDay;
    private Set<Integer> bookIds;
    private Set<Book> books;
    private List<Book> booksForScanning = new ArrayList<>(); //will be filled during the process

    public Library(int id, int signup, int booksPerDay, Set<Integer> bookIds) {
        this.id = id;
        this.signup = signup;
        this.booksPerDay = booksPerDay;
        this.bookIds = bookIds;
    }

    public int getId() {
        return id;
    }

    public int getSignup() {
        return signup;
    }

    public int getBooksPerDay() {
        return booksPerDay;
    }

    public Set<Integer> getBookIds() {
        return bookIds;
    }

    public int signupLoss() {
        return signup * booksPerDay;
    }

    public void loadBooks(final List<Book> allBooks) {
        books = bookIds.stream()
                .map(i -> allBooks.get(i))
                .collect(Collectors.toSet());

    }

    public Set<Book> getBooks() {
        return books;
    }

    public List<Book> getBooksForScanning() {
        return booksForScanning;
    }
}
