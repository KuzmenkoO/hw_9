package hm_9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class TaskOne {
    public static void validNumber(String path) {
        String ex1 = "^\\d{3}-\\d{3}-\\d{4}$";
        String ex2 = "^\\(\\d{3}\\)\\s\\d{3}-\\d{4}$";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String text = "";
            for (; (text = bufferedReader.readLine()) != null; ) {
                if (Pattern.matches(ex1, text) || Pattern.matches(ex2, text)) {
                    System.out.println(text);
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
