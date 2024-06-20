import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Выберите куда переводим(1 - из двоичной в десятичную, 2 - из десятичной в двоичную): ");
        switch (scan.nextInt()){
            case 1:
                System.out.print("Введите двоичное число: ");
                String inp = scan.next();
                String rev = reverse(inp);
                char[] mas = rev.toCharArray();
                int res = 0;
                for (int i = 0; i != mas.length; i++) {
                    if (mas[i] == '1'){
                        res += step(2, i);
                    }
                }
                System.out.println("Результат: " + res);
                break;
            case 2:
                System.out.print("Введите десятичное число: ");
                int inp2 = scan.nextInt();
                ArrayList<Integer> res2 = new ArrayList<>();
                while (inp2 != 0) {
                    if (inp2 % 2 == 1) {
                        inp2 -= 1;
                        inp2 /= 2;
                        res2.add(1);
                    } else {
                        inp2 /= 2;
                        res2.add(0);
                    }
                }
                System.out.println("Результат: " + reverse(tostr(res2)));
                break;
            default:
                System.out.println("Неверный номер действия!");
                break;
        }
    }
    public static String reverse(String str) {
        char[] arr = str.toCharArray();
        String res = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            res = res + arr[i];
        }
        return res;
    }
    public static String tostr(ArrayList<Integer> itn) {
        String res = "";
        for (int i = 0; i != itn.size(); i++) {
            res += itn.get(i);
        }
        return res;
    }
    public static int step(int ch, int st){
        if (st == 0){
            return 1;
        }
        int res = ch;
        for (int i = 0; i != st - 1; i++) {
            res *= ch;
        }
        return res;
    }
}