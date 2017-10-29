package com.example.pc.lesson2;

import android.content.Context;

/**Класс нужен для того чтобы продемонстрировать работу с ресурсами вне Активити как пример бизнес-логики приложения.
В качестве факультативного задания можете получать значение из массива непосредственно в Активити, не создавая
дополнительных сущностей.*/

class ColorSpec {

    static String getEffect(Context context, int position) {
        //Получаем массив эффектов (для этого нам необходим контекст приложения)
        String[] strings = context.getResources().getStringArray(R.array.effect);
        //Получаем эффект из массива (для этого нам необходима позиция спиннера)
        String effect = strings[position];
        //Возвращаем эффект
        return effect;
    }
}
