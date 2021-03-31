/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum;

import java.util.Scanner;

/**
 *
 * @author Lenovo ideapad
 */
public class Mahasiswa {
    String name,nim;
    int uts,uas,usia;
    public Mahasiswa(String name, int uts, int uas, int usia, String nim) {
        System.out.println("Nama : "+name);
        System.out.println("NIM : "+nim);
        System.out.println("Usia : "+usia);
        System.out.println("UTS : "+uts);
        System.out.println("UAS : "+uas);
        System.out.println("Rata rata : "+ratarata(uts,uas));
    }
    double ratarata(int uts, int uas){
        int nilai;
        nilai= (uts+uas)/2;
        return(nilai);
    }

}
