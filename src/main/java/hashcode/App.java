package hashcode;

import hashcode.domain.Book;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class App
{
    public static void main(String[] args) throws IOException
    {

        Integer rowsCount = 0;
        List<Book> books = null;
        Integer booksCount = null;
        Integer libraryCount;
        Integer days;

        String fileName = "/a_example.txt";
        //ClassLoader classLoader = new App().getClass().getClassLoader();

        File file = new File(new App().getClass().getResource(fileName).getFile());

        BufferedReader reader;

        reader = new BufferedReader(new FileReader(file));

        String line = reader.readLine();

        while (line != null){
            if (rowsCount == 0) {

                booksCount = Integer.valueOf(line.charAt(0));
                libraryCount = Integer.valueOf(line.charAt(2));
                days = Integer.valueOf(line.charAt(4));
                rowsCount++;
            }
            else if(rowsCount == 1){
                int character = 0;
                for (int index=0; index<booksCount; index++){
                    Book book = new Book(index+1, line.charAt(character));
                    books.add(book);
                }
                rowsCount++;
            }
            else {

            }
        }



        reader.close();

    }
}