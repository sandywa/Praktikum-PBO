/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package main;

import bidang.PersegiPanjang;
import ruang.Balok;
import ruang.Kerucut;



import java.util.Scanner;

/**
 *
 * @author Lenovo ideapad
 */
public class  Main {

    public static void main(String[] args) {


        int pil;
        do{
            System.out.println("Input ");
            System.out.println("1. Balok");
            System.out.println("2. Kerucut");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            Scanner scanner=new Scanner(System.in);
            pil=scanner.nextInt();

            switch (pil){
                case 1: {
                    System.out.print("Panjang : ");
                    int panjang=scanner.nextInt();
                    System.out.print("Lebar : ");
                    int lebar=scanner.nextInt();
                    System.out.print("Tinggi : ");
                    int tinggi=scanner.nextInt();
                    PersegiPanjang persegiPanjang = new PersegiPanjang(panjang,lebar);
                    Balok balok = new Balok(panjang,lebar,tinggi);
                    System.out.println("--------Output----------");
                    System.out.println("Keliling Persegi Panjang : " + persegiPanjang.kelilingPersegiPanjang());
                    System.out.println("Luas Persegi Panjang : " + persegiPanjang.bidangPersegiPanjang());
                    System.out.println("Volume Balok : "+ balok.volumeBalok());
                    System.out.println("Luas Permukaan : "+ balok.luasPermukaanBalok());
                    break;
                }
                case 2: {

                    System.out.print("Jari-jari : ");
                    int jari=scanner.nextInt();
                    System.out.print("Tinggi : ");
                    int tinggi=scanner.nextInt();
                    Kerucut kerucut = new Kerucut(jari,tinggi);
                    System.out.println("--------Output----------");
                    System.out.println("Keliling Lingkaran : " + kerucut.kelilingLingkaran(jari));
                    System.out.println("Luas Persegi Panjang : " + kerucut.luasLingkaran(jari));
                    System.out.println("Volume Balok : "+ kerucut.volumeKerucut());
                    System.out.println("Luas Permukaan : "+ kerucut.luasKerucut());
                    break;
                }

                default: break;

            }
        }while (pil!=3);
    }
    
}
