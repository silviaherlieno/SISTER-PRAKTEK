/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Silvia111023;

/**
 *
 * @author ASUS TUF GAMING
 */
public class Enkrip2 {
    public static void main(String[] args){
        String text = "Selamat Datang";
        String temp = "";
        int key = 40;
        for(int i=0;i<text.length();i++){
            int h = (int) (text.charAt(i));
            char t = (char) (h ^ key);
            temp += t;
        }
        System.out.println("Sebelum : " + text);
        System.out.println("Hasil   : " + temp);
    }
}
