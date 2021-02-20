package hm_9;

class TestHome {
    public static void main(String[] args) {
        // Задача №1
        System.out.println("Завдання №1");
        String link = "src/main/resources/EX1/file1.txt";
        TaskOne.validNumber(link);
        System.out.println();

        // Задача №2
        System.out.println("Завдання №2");
        String linkTwo = "src/main/resources/EX2/file2.txt";
        TaskTwo.newFile(linkTwo);
        System.out.println();

        // Задача №3
        System.out.println("Завдання №3");
        String linkThree = "src/main/resources/EX3/words.txt";
        TaskThree.frequencyOfWordsInTheText(linkThree);

    }
}
