package com.solvd.pattern.factory;

public class MilkProductFactory {

    public static MilkProduct create(MilkProductType milkProductType) {
        MilkProduct milkProduct;
        switch (milkProductType) {
            case MILK:
                milkProduct = new Milk();
                break;
            case KEFIR:
                milkProduct = new Kefir();
                break;
            case ICECREAM:
                milkProduct = new Icecream();
                break;
            case SOURCREAM:
                milkProduct = new Sourcream();
                break;
            default:
                throw new IllegalMilkProductException("Wrong milk product type: " + milkProductType);
        }
        return milkProduct;
    }

}
