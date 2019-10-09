package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Class получение числа по номеру, который вводит пользователь
 * @author Belyanin
 * @since 08.10.2019
 * @version 1
 */
public class Fibo {

    public static void main(String[] args) throws IOException {
        Fibo fibo = new Fibo();
        fibo.run();
    }

    /**
     * Взаимодействие с пользователем
     * @throws IOException
     */
    public void run() throws IOException {
        int number;
        BufferedReader bufferedReader;
        String ans;
        while (true) {
            System.out.println("Введите число от 1 до 50");
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            number = Integer.parseInt(bufferedReader.readLine());
            if (number >= 1 && number <= 50) {
                int result = calculationResult(number);
                System.out.println("Число по номеру "+ number +" равно " + result);
            } else {
                System.out.println("Число должно быть от 1 до 50");
            }
            System.out.println("Продолжить? (Y/N)");
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            ans = bufferedReader.readLine();
            if(!(ans.equals("Y")||ans.equals("y"))) {
                break;
            }
        }
    }

    /**
     * Вычисление числа по номеру в последовательности
     * первое и второе число последовательности равно 1
     * @param number номер числа по порядку
     * @return число по номеру
     */
    public int calculationResult(int number) {
        int result = 1;
        if(!(number == 1 || number == 2)) {
            int a = 1;
            int currentResult = 1;
            for (int i = 3; !(i>number); i++) {
                currentResult = currentResult + a;
                a = currentResult - a;
            }
            result = currentResult;
        }
        return result;
    }
}
