import java.util.ArrayList;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        int prev = 0;
        int current = 1;

        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 1; i <= 50; i++) {
            integers.add(prev);

            prev = prev + current;
            current = prev - current;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual número você quer verificar se encontra-se na sequência Fibonacci? ");
        int n = scanner.nextInt();

        if (integers.contains(n)) {
            System.out.println("O número "+n+" está na sequência Fibonacci");
        } else {
            System.out.println("O número "+n+" não está na sequência Fibonacci");
        }
    }
}
