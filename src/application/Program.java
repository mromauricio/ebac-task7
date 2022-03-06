package application;

import entities.Produto;

public class Program {
    public static void main(String[] args) {
        Produto produto = new Produto("Mini MAC M1 16Gb 256SSD","123456-US",1024.60);
        System.out.println(produto);
    }
}
