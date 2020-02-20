package hashcode;

import hashcode.domain.Definition;
import hashcode.domain.Library;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Mock {

    @Test
    public void test() {
        Library library;

        Map<Integer, Library> libraries = new HashMap<>();

        library = new Library(0, 3, 4, new HashSet<>(Arrays.asList(new Integer[] {2, 3})));
        libraries.put(library.getId(), library);

        List<Integer> scores = Arrays.asList(new Integer[] {2, 3});

        Definition definition = new Definition(libraries, 10, scores);
    }
}
