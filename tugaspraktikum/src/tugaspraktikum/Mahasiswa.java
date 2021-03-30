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
    String name;
    int uts,uas;
    public Mahasiswa(String name, int uts, int uas) {
        System.out.println("Nama : "+name);
        System.out.println("UTS : "+uts);
        System.out.println("UAS : "+uas);
        int nilai;
        nilai= (uts+uas)/2;

        System.out.println(nilai);
    }
}
