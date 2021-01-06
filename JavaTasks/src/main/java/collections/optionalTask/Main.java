package collections.optionalTask;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ActionsWithNumbers actionsWithNumbers = new ActionsWithNumbers();
        ActionsWithTextFromFile actionsWithTextFromFile = new ActionsWithTextFromFile();
        List<String> stringsFromFile = actionsWithTextFromFile.printStringsFromFileToList();

        actionsWithTextFromFile.findDifferentWordsInText();
        actionsWithNumbers.printNumberWithDigitsInReverseOrder();
        actionsWithTextFromFile.printStringsToFileFromListInReverseOrder(stringsFromFile);
        actionsWithTextFromFile.sortStingsInListByLength(stringsFromFile);
        actionsWithTextFromFile.sortStingsUsingMethodSortInClassCollections(stringsFromFile);
    }
}
