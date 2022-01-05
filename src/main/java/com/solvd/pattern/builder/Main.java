package com.solvd.pattern.builder;

import java.time.LocalDate;


/**
 * В API тестировании при создании\изменении аккаунта\учётной записи нужно указывать огромное количество полей, не все из них обязательные.
 * В DataProvider можно создать объекты содержащие всю информацию(обязательную и нет), ну и постить это всё дело, а потом проверять респонс.
 * Визуально симпатичнее и читабельнее будет использовать паттерн билдер.
 * Ещё, к примеру, у нас есть DataProvider и там куча объектов с разным количеством полей(обязательных и нет),
 * и мы эти объекты засовываем в базу данных и обратно достаём для проверки.
 * Везде, где есть большое количество полей у класса, для читабельности и экономии места это можно применять.
 */
public class Main {

    public static void main(String[] args) {
        Human human1 = Human.builder()
                .firstName("Ivan")
                .lastName("Ivanov")
                .patronymic("Ivanovich")
                .birthday(LocalDate.of(1950, 10, 26))
                .weight(85.4)
                .growth(1.85)
                .skinColor("red")
                .eyeColor("black")
                .build();

        Human human2 = Human.builder()
                .weight(3.566)
                .growth(47)
                .eyeColor("blue")
                .skinColor("white")
                .build();
    }

}
