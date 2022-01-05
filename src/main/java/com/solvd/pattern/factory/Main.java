package com.solvd.pattern.factory;

/**
 * В веб тестировании можно испльзовать. Когда много каких-то UI-элементов или страниц похожих друг на друга, с похожим поведением, но разной реализацией.
 * Всё это можно собрать под общий класс или интерфейс и создавать это всё таким образом.
 * Ещё видется такой вариант: Мы не знаем какая именно информация к нам прийдёт откуда-либо, к примеру, с базы данных.
 * Но мы знаем, что на основе этой информации программе нужно создать объект, пришёл один тип - один объект, пришёл другой - другой.
 * Ну и вот фабрика отлично подходит под это дело.
 */
public class Main {

    public static void main(String[] args) {
        MilkProduct milkProduct1 = MilkProductFactory.create(MilkProductType.ICECREAM);
        MilkProduct milkProduct2 = MilkProductFactory.create(MilkProductType.KEFIR);
        MilkProduct milkProduct3 = MilkProductFactory.create(MilkProductType.SOURCREAM);
        MilkProduct milkProduct4 = MilkProductFactory.create(MilkProductType.MILK);

        milkProduct1.eat();
        milkProduct2.eat();
        milkProduct3.eat();
        milkProduct4.eat();
    }

}




