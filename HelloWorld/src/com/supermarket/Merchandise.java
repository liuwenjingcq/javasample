package com.supermarket;

import javax.crypto.spec.PSource;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.net.PortUnreachableException;

public class Merchandise {
    public String name;
    public String id;
    public int count = 999;
    public double soldPrice;
    public double purchasePrice;
    public static double DISCONT_FOR_VIP = 0.95;//静态变量名

    //>> todo 构造方法
    private Merchandise(String name, String id, int count, double soldPrice, double purchasePrice) {
        this.name = name;
        this.count = count;
        this.id = id;
        this.soldPrice = soldPrice;
        this.purchasePrice = purchasePrice;
    }
    public static Merchandise createMerchandise(String name, String id, int count, double soldPrice, double purchasePrice){
        if(soldPrice<0||purchasePrice<0){
            return null;
        }
        return new  Merchandise(name, id, count, soldPrice,purchasePrice);
    }

    //>> todo 构造方法
    public Merchandise(String name, String id, int count, double soldPrice) {
        this(name, id, count, soldPrice, soldPrice * 0.8);
    }

    //>> todo 构造方法
    public Merchandise() {
        this("无名", "000", 0, 1, 1.1);
    }

    public static void main(String[] args) {
        Merchandise merchandise = new Merchandise("lwj", "001", 23, 23.4, 21);
        System.out.println("欢迎");
        System.out.println("最近main方法的的SVIP_DISCOUNT " +SVIP_DISCOUNT);
    }

        public static double BASE_DISCOUNT;
        public static double VIP_DISCOUNT;
        public static double SVIP_DISCOUNT;

        static {
            BASE_DISCOUNT = 0.99;
            VIP_DISCOUNT = 0.85;
            SVIP_DISCOUNT = 0.75;
            //静态代码块里当然可以有任意的合法代码
            System.out.println("静态代码快1里的SVIP_DISCOUNT " + SVIP_DISCOUNT);

        }
        static {
            SVIP_DISCOUNT = 0.1;
            //静态代码块里当然可以有任意的合法代码
            System.out.println("静态代码快2里的SVIP_DISCOUNT " + SVIP_DISCOUNT);

        }

}
