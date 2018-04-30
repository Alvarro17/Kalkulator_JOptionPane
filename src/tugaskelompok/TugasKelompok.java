package tugaskelompok;

import javax.swing.*;

public class TugasKelompok {
public static void main(String[] args) {
    String ulang;
    do{
        
        String pilihan = "";
        pilihan = JOptionPane.showInputDialog(" Masukkan pilihan anda : "
        + "\n(1 = Akar), "
        + "\n(2 = Perpangkatan), "
        + "\n(3 = sisa hasil bagi), "
        + "\n(4 = Pembagian tanpa sisa hasil bagi), "
        + "\n(5 = Mencari nilai MIN), "
        + "\n(6 = Mencari nilai MAX)");
        int pil = Integer.parseInt(pilihan);
        if (pil == 1) {
            String nilai1 = "";
            nilai1 = JOptionPane.showInputDialog(" Masukkan angka yang ingin diakarkan kuadratkan = ");
            double a = Integer.parseInt(nilai1);
            double x ;
            x = Math.sqrt(a);
            JOptionPane.showMessageDialog(null, "HASIL = " + x);
            JOptionPane.showMessageDialog(null, "EXIT");
            System.out.println("\nHasil = " + x);
        } else if (pil == 2) {
            String nilai1 = "";
            nilai1 = JOptionPane.showInputDialog("Masukkan Angka = ");
            double a = Integer.parseInt(nilai1);
             String nilai2 = "";
            nilai2 = JOptionPane.showInputDialog("Masukkan Nilai Pangkat");
            double b = Integer.parseInt(nilai2);
            double x = Math.pow(a, b); 
            
            JOptionPane.showMessageDialog(null, "Hasil = " +x);
            JOptionPane.showMessageDialog(null, "EXIT ");
            System.out.println("\nHasil = " + x);
        }else if (pil == 3) {
            String nilai1 = "";
            nilai1 = JOptionPane.showInputDialog("Masukkan Nilai = ");
            int a = Integer.parseInt(nilai1);
            String nilai2 = "";
            nilai2 = JOptionPane.showInputDialog("Masukkan Nilai = ");
            int b = Integer.parseInt(nilai2);
            double x = Math.floorMod(a, b);
            
            JOptionPane.showMessageDialog(null, "HASIL = " + x);
            JOptionPane.showMessageDialog(null, "EXIT");
            System.out.println("\nHasil = " + x);
        }else if (pil == 4) {
            String nilai1 = "";
            nilai1 = JOptionPane.showInputDialog("Masukkan Nilai = ");
            int a = Integer.parseInt(nilai1);
            String nilai2 = "";
            nilai2 = JOptionPane.showInputDialog("Masukkan Nilai = ");
            int b = Integer.parseInt(nilai2);
            double x = Math.floorDiv(a, b);
            
            JOptionPane.showMessageDialog(null, "HASIL = " + x);
            JOptionPane.showMessageDialog(null, "EXIT");
            System.out.println("\nHasil = " + x);
        }else if (pil == 5) {
            String nilai1 = "";
            nilai1 = JOptionPane.showInputDialog("Masukkan Angka 1");
            int a = Integer.parseInt(nilai1);
            String nilai2 = "";
            nilai2 = JOptionPane.showInputDialog("Masukkan Angka 2");
            int b = Integer.parseInt(nilai2);
            int x = Math.min(a, b);
            
            JOptionPane.showMessageDialog(null, "Nilai Minimum Angka 1 dan Angka 2 = " + x);
            JOptionPane.showMessageDialog(null, "EXIT");
            System.out.println("\nNilai Minimum angka 1 dan angka 2 = " + x);

        }else if (pil == 6) {
            String nilai1 = "";
            nilai1 = JOptionPane.showInputDialog("Masukkan Angka 1");
            int a = Integer.parseInt(nilai1);
            String nilai2 = "";
            nilai2 = JOptionPane.showInputDialog("Masukkan Angka 2");
            int b = Integer.parseInt(nilai2);
            int x = Math.max(a, b);
            
            JOptionPane.showMessageDialog(null, "Nilai Maxsimum Angka 1 dan Angka 2 = " + x);
            JOptionPane.showMessageDialog(null, "EXIT");
            System.out.println("\nNilai Maximum angka 1 dan angka 2 = " + x);
        
}
    ulang = JOptionPane.showInputDialog(null,"Apakah Anda Ingin Mengulanginya: (1 = ya), (2 = tidak)");
    }while("1".equals(ulang));   
}
}