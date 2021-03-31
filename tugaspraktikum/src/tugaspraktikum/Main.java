/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum;

import java.util.Scanner;
import tugaspraktikum.Mahasiswa;
/**
 *
 * @author Lenovo ideapad
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Pilih Menu Input:");
        System.out.println("1. Input Data");
        System.out.println("0. Keluar");
        System.out.print("Pilih : ");
        Scanner scanner=new Scanner(System.in);
        int pil=scanner.nextInt();
        if (pil==1){
            System.out.println("Input Data Mahasiswa");
            System.out.print("Masukan Nama Mahasiswa : ");
            String name= scanner.next();
            System.out.print("Masukan NIM : ");
            String nim=scanner.next();
            System.out.print("Usia : ");
            int usia=scanner.nextInt();
            System.out.print("Masukan Nilai UTS :");
            int uts= scanner.nextInt();
            System.out.print("Masukan Nilai UAS : ");
            int uas= scanner.nextInt();
            Mahasiswa datamhs=new Mahasiswa(name,uts,uas,usia,nim);
        }

    }
}
