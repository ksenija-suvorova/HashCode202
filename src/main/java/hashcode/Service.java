package hashcode;

import hashcode.domain.Definition;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Collectors;

public class Service {
    public static final SimpleDateFormat FORMAT = new SimpleDateFormat("HH-mm-ssZ");
    public static final String LF = "\n";

    public void output(Definition definition) {
        StringBuilder sb = new StringBuilder();

        sb.append(definition.getLibraries().size()).append(LF);

        definition.getLibraries().stream().forEach(l -> {
            //1st row
            sb.append(l.getId())
                    .append(" ")
                    .append(l.getBooks().size())
                    .append(LF);

            //2nd row
            sb.append(l.getBooksForScanning().stream()
                    .map(b -> "" + b.getId())
                    .collect(Collectors.joining(" ")))
                    .append(LF);
        });

        try {
            FileUtils.writeStringToFile(new File("output/" + FORMAT.format(new Date()) + ".txt"), sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
