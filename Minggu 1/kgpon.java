 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SYNSGATS
 */
import java.util.Scanner;
public class kgpon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah panjang data: ");
        int jumlah = sc.nextInt();
        jumlah++;
        for(int i=0; i<jumlah; i++){
            int hasil= i*2;
            System.out.println(i +" KG = " +hasil +" pon");
        }
    }
}
