import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Tinh tien lai---");
        System.out.println("Nhap so tien gui VND :");
        double money = scanner.nextDouble();
        System.out.println("Nhap so thang gui :");
        int month = scanner.nextInt();
        System.out.println("Nhap lai suat thang :");
        double interestRate = scanner.nextDouble();

        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Tien lai la : "+ totalInterest);
    }
}
