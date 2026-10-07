import java.util.Scanner;

public class StudiKasus118 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hargapercup = 18000;
        int jumlahcup, uangbayar, totalharga, kembalian, diskon, totalbayar, kurang;

        System.out.print("Masukkan jumlah cup yang dibeli: ");
        jumlahcup = scanner.nextInt();
        System.out.print("Masukkan uang yang dibayarkan: ");
        uangbayar = scanner.nextInt();

        totalharga = hargapercup * jumlahcup;
        diskon = 0;
        if (totalharga > 10000) {
            diskon = totalharga * 10 / 100;
        }
        totalbayar = totalharga - diskon;

        System.out.println("Total harga: " + totalharga);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total bayar: " + totalbayar);


        if (uangbayar >= totalbayar) {
            kembalian = uangbayar - totalbayar;
            System.out.println("Kembalian: " + kembalian);
        } else {
            kurang = totalbayar - uangbayar;
            System.out.println("Uang yang dibayarkan kurang sebesar: " + kurang);
        }
    }
    

}