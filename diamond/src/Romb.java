import java.util.Scanner;

public class Romb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите букву: ");
        char letter = scanner.nextLine().charAt(0);
        printPattern(letter);
    }

    public static void printPattern(char letter) {
        int n = letter - 'A' + 1;

        for (int i = 0; i < n; i++) {
            StringBuilder line = new StringBuilder();
            line.append(" ".repeat(n - i - 1));
            line.append((char) ('A' + i));
            if (i > 0) {
                line.append("-").append(String.join("-", getLetters(i, 0, -1)));
            }
            line.append("-").append((char) ('A' + i));
            line.append(" ".repeat(n - i - 1));
            System.out.println(line);
        }

        for (int i = n - 2; i >= 0; i--) {
            StringBuilder line = new StringBuilder();
            line.append(" ".repeat(n - i - 1));
            line.append((char) ('A' + i));
            if (i > 0) {
                line.append("-").append(String.join("-", getLetters(i, 0, -1)));
            }
            line.append("-").append((char) ('A' + i));
            line.append(" ".repeat(n - i - 1));
            System.out.println(line);
        }
    }

    public static String[] getLetters(int start, int end, int step) {
        String[] letters = new String[Math.abs(start - end)];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = String.valueOf((char) ('A' + start + i * step));
        }
        return letters;
    }
}
