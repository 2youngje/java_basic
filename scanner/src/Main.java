import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);

        System.out.print("국어 점수 입력: ");
        int kor = sc.nextInt();
        System.out.print("영어 점수 입력: ");
        int eng = sc.nextInt();
        System.out.print("수학 점수 입력: ");
        int mat = sc.nextInt();

        int tot = kor+eng+mat;
        double avg = tot/3.0;

        sc.close();

        System.out.println("총점 : " + tot);
        System.out.printf("평균 : %f\n", avg);

    }
}