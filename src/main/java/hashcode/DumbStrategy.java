package hashcode;

import hashcode.domain.Definition;

public class DumbStrategy implements Strategy {

    @Override
    public void run(Definition definition) {
        definition.getLibraries().stream()
                .forEach(l -> {
                    l.getBooksForScanning().addAll(l.getBooks());
                });
    }
}
