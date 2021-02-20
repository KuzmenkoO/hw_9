package hm_9;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class TaskTwo {
    public static void newFile(String link) {
        File file = new File(link);
        File userJson = new File("src/main/resources/EX2/user.json");
        List<User> user = extracted(file);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(userJson))) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(user);
            bufferedWriter.write(json);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Створено файл - " + userJson.getName() + " за посиланням - " + userJson.getPath());
    }

    private static List<User> extracted(File file) {
        List<User> userList = new LinkedList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String ex = bufferedReader.readLine();
            while ((ex = bufferedReader.readLine()) != null) {
                String[] part = ex.split(" ");
                User user = new User(part[0], Integer.parseInt(part[1]));
                userList.add(user);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return userList;
    }
}

class User {
    private final String name;
    private final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
