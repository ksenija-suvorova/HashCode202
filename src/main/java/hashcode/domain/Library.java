package hashcode.domain;

import java.util.Set;

public class Library {
    private int id;
    private int signup;
    private int booksPerDay;
    private Set<Integer> books;

    public Library(int id, int signup, int booksPerDay, Set<Integer> books) {
        this.id = id;
        this.signup = signup;
        this.booksPerDay = booksPerDay;
        this.books = books;
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

    public Set<Integer> getBooks() {
        return books;
    }

    public int signupLoss() {
        return signup * booksPerDay;
    }
}
