package hashcode;

import hashcode.domain.Book;
import hashcode.domain.Definition;
import hashcode.domain.Submission;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ScoringStrategy implements Strategy {

    @Override
    public Submission run(Definition definition) {
        definition.getLibraries().stream()
                .forEach(l -> {
                    List<Book> list = new ArrayList<>(l.getBooks());
                    list.sort(new Comparator<Book>() {
                        @Override
                        public int compare(Book o1, Book o2) {
                            return o2.getScore() - o1.getScore();
                        }
                    });

                    l.getBooksForScanning().addAll(list);
                });

        return new Submission(definition.getFilename(), definition.getLibraries());
    }
}
