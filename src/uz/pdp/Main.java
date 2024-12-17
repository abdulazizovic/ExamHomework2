package uz.pdp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Random;

import static uz.pdp.DB.objects;
import static uz.pdp.DB.randomObject;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("""
                1 - Add 1000 book
                2 - Delete books
                3 - Delete pens
                """);
        switch (Input.num("Choose:")) {
            case 1->addBook();
            case 2->deleteBooks();
            case 3->deletePens();
        }
    }

    private static void deletePens() {

    }

    private static void deleteBooks() {

    }

    private static void addBook() {
        for (int i = 0; i < 1000; i++) {
            Random random=new Random();
            int i1 = random.nextInt(5);
            randomObject.add(objects.get(i1));
            try {
                Files.write(Path.of("Files/a.txt"),(objects.get(i1)+"\n").getBytes(), StandardOpenOption.CREATE,StandardOpenOption.APPEND);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(randomObject.size());
    }
}