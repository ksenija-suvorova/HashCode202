package hashcode;

import hashcode.domain.Book;
import hashcode.domain.Definition;
import hashcode.domain.Library;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Mock {

    public static Definition createDefinition1() {
        Book book;
        List<Book> books = new ArrayList<>();

        book = new Book(0, 7);
        books.add(book);

        book = new Book(1, 10);
        books.add(book);

        book = new Book(2, 3333);
        books.add(book);

        book = new Book(3, 4);
        books.add(book);

        List<Library> libraries = new ArrayList<>();

        Library library;

        library = new Library(0, 3, 4, new HashSet<>(Arrays.asList(new Integer[] {2, 3})));
        libraries.add(library);

        List<Integer> scores = Arrays.asList(new Integer[] {2, 3});

        Definition definition = new Definition("aaa.txt", libraries, books, 10, scores);

        definition.getLibraries().stream().forEach(l -> l.loadBooks(books));

        return definition;
    }
}
