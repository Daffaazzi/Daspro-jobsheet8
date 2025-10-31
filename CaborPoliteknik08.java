import java.util.Scanner;

public class CaborPoliteknik08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] Cabor = {"Badminton", "Tenis Meja", "Basket", "Bola Voly"};
        
        System.out.println("Daftar Cabang Olahraga di Politeknik Negeri Malang:");
        System.out.print("Masukkan jumlah Politeknik: ");
        int JumlahPoltek = sc.nextInt();
        sc.nextLine(); 
        
        int totalAtlet = 0;
        
        for (int i = 1; i <= JumlahPoltek; i++) {
            System.out.println("== Data Politeknik ke-" + i + " ==");
            System.out.print("Nama Politeknik: ");
            String namaPoltek = sc.nextLine();

            for (int j = 0; j < Cabor.length; j++) {
                System.out.print("Jumlah Atlet Cabang " + Cabor[j] + ": ");
                int jumlahAtlet = sc.nextInt();
                sc.nextLine(); 
                
                totalAtlet += jumlahAtlet;
                
                for (int k = 1; k <= jumlahAtlet; k++) {
                    System.out.print("Nama atlet ke-" + k + ": ");
                    String namaAtlet = sc.nextLine();
                }
                System.out.println("== " + jumlahAtlet + " atlet cabang " + Cabor[j] + " dari " + namaPoltek + " berhasil ditambahkan!");
            }
        }
        
        System.out.println("==SEMUA DATA ATLET BERHASIL DITAMBAHKAN==");
        System.out.println("Total Politeknik        : " + JumlahPoltek);
        System.out.println("Total Cabang Olahraga   : " + Cabor.length);
        System.out.println("Total Keseluruhan Atlet : " + totalAtlet);
        sc.close();
    }
}