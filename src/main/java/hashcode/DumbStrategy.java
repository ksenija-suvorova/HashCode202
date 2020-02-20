package hashcode;

import hashcode.domain.Definition;
import hashcode.domain.Submission;

public class DumbStrategy implements Strategy {

    @Override
    public Submission run(Definition definition) {
        definition.getLibraries().stream()
                .forEach(l -> {
                    l.getBooksForScanning().addAll(l.getBooks());
                });

        return new Submission(definition.getFilename(), definition.getLibraries());
    }
}
