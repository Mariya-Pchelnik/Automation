package collections.optionalTask;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ActionsWithTextFromFile {
    private final String filename = "D:\\Java\\JavaTasks\\src\\main\\java\\" +
            "collections\\optionalTask\\file.txt";

    public List<String> printStringsFromFileToList() {
        List<String> listOfStrings = new ArrayList();
        try (FileReader fileReader = new FileReader(filename)) {
            Scanner readStringsFromFile = new Scanner(fileReader);
            while (readStringsFromFile.hasNextLine()) {
                listOfStrings.add(readStringsFromFile.nextLine());
            }
        } catch (IOException ex) {
            System.out.println("Ошибка чтения");
        }
        return listOfStrings;
    }

    public void printStringsToFileFromListInReverseOrder(List<String> listOfStrings) {
        try (BufferedWriter bufferedWriter =
                     new BufferedWriter(new FileWriter(filename, true))) {
            bufferedWriter.newLine();
            bufferedWriter.write("Вывод строк в обратном порядке:");
            for (int i = listOfStrings.size() - 1; i >= 0; i--) {
                bufferedWriter.newLine();
                bufferedWriter.write(listOfStrings.get(i));
            }
        } catch (IOException ex) {
            System.out.println("Ошибка записи");
        }
    }

    public void sortStingsInListByLength(List<String> listOfStrings) {
        listOfStrings.sort(((o1, o2) -> o1.length() - o2.length()));
        System.out.println("\nСтроки отсортированные по длине");
        for (String string : listOfStrings) {
            System.out.println(string);
        }
    }

    public void sortStingsUsingMethodSortInClassCollections(List<String> listOfStrings) {
        Collections.sort(listOfStrings, ((o1, o2) -> o1.length() - o2.length()));
        System.out.println("\nСтроки отсортированные по длине " +
                "с использованием метода sort() из класса Collections");
        for (String string : listOfStrings) {
            System.out.println(string);
        }
    }

    public void findDifferentWordsInText() {
        StringBuilder stringsFromFile = new StringBuilder();

        try (FileReader fileReader = new FileReader(filename)) {
            Scanner readStringsFromFile = new Scanner(fileReader);
            while (readStringsFromFile.hasNextLine()) {
                stringsFromFile.append(readStringsFromFile.nextLine() + "\n");
            }
        } catch (IOException ex) {
            System.out.println("Ошибка чтения");
        }

        Set<String> differentWordsFromFile = new HashSet<>(Arrays.
                asList(stringsFromFile.toString().toLowerCase().
                        split(" |\\n|, |,\\n")));
        System.out.print("\nРазличные слова из файла:");
        for (String word : differentWordsFromFile) {
            System.out.println(word);
        }
    }
}



