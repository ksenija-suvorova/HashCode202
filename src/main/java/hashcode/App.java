package hashcode;

import hashcode.domain.Book;
import hashcode.domain.Library;
import org.apache.commons.io.FileUtils;
import sun.rmi.server.InactiveGroupException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class App
{
    public static void main(String[] args) throws IOException
    {

        Integer rowsCount = 0;
        Set<Book> books = null;
        Integer booksCount = null;
        Integer libraryCount;
        Integer days;
        int character=3;
        int lines = 0;

        File file = new File(App.class.getClassLoader().getResource("/a_example.in").getFile());

        String content = FileUtils.readFileToString(file);

        String[] line = content.split("\n");

        String[] initialLine = line[lines].split(" ");
        lines++;

        booksCount = Integer.valueOf(initialLine[0]);
        libraryCount = Integer.valueOf(initialLine[1]);
        days = Integer.valueOf(initialLine[2]);

        String[] booksScore = line[lines].split(" ");
        lines++;

        for (int index=1; index<=booksScore.length; index++){
            Book book = new Book(index,Integer.valueOf(booksScore[index-1]));
            books.add(book);
        }

        for (int library = 0; library<libraryCount; library++){
            Set<Integer> booksIds = null;
            String[] libraryInformation = line[lines].split(" ");
            lines++;
            String[] libraryBooks = line[lines].split(" ");
            lines++;

            for (int i=0; i<libraryBooks.length; i++){
                booksIds.add(Integer.valueOf(libraryBooks[i]));
            }

            List<String> a = new ArrayList<>(books);



            Library librarys = new Library(library, Integer.valueOf(libraryInformation[1]), Integer.valueOf(libraryInformation[2]), booksIds, null)

        }

    }
}