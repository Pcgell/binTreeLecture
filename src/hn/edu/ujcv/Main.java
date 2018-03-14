package hn.edu.ujcv;

public class Main {

    public static void main(String[] args) {
	    ArbolBinario ab = new ArbolBinario();
        ab.add(5);
        ab.add(3);
        ab.add(2);
        ab.add(1);
        ab.add(4);
        ab.add(7);
        ab.add(6);
        ab.add(8);
        ab.add(9);

        System.out.println(ab.find(7));
        System.out.println(ab.find(16));

        System.out.println(ab);
        //ab.bredthFirtsSearch();
        ab.preOrderIterativo();


    }
}
