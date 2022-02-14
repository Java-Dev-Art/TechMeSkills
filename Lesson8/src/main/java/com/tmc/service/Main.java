package com.tmc.service;

import com.tmc.module.library.Book;
import com.tmc.module.library.Reader;
import com.tmc.module.market.Bouquet;
import com.tmc.module.market.Flower;
import com.tmc.module.market.FlowerEnum;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Flower f1 = new Flower();
        f1.setName(FlowerEnum.ASTER.getName());
        f1.setPrice(FlowerEnum.ASTER.getPrice());

        Flower f2 = new Flower();
        f2.setName(FlowerEnum.ROSE.getName());
        f2.setPrice(FlowerEnum.ROSE.getPrice());

        Flower f3 = new Flower();
        f3.setName(FlowerEnum.TULIP.getName());
        f3.setPrice(FlowerEnum.TULIP.getPrice());

        Flower f4 = new Flower();
        f4.setName(FlowerEnum.ASTER.getName());
        f4.setPrice(FlowerEnum.ASTER.getPrice());

        Flower f5 = new Flower();
        f5.setName(FlowerEnum.ROSE.getName());
        f5.setPrice(FlowerEnum.ROSE.getPrice());

        Flower f6 = new Flower();
        f6.setName(FlowerEnum.ASTER.getName());
        f6.setPrice(FlowerEnum.ASTER.getPrice());

        List<Flower> flw = new ArrayList<>();
        flw.add(f1);
        flw.add(f2);
        flw.add(f3);
        flw.add(f4);
        flw.add(f5);
        flw.add(f6);

        Bouquet bouquet = new Bouquet(flw);
        bouquet.priceBouquet();

        Book book = Book.builder().author("Art").name("Lew Tolstoy").year(1896).build();
        Book book1 = Book.builder().author("Mort").name("mesc").year(1999).build();
        Book book2 = Book.builder().author("Luk").name("Love").year(1200).build();
        Book book3 = Book.builder().author("Hardy").name("zor").year(1998).build();
        Book book4 = Book.builder().author("ArtMar").name("ty").year(1998).build();

        Reader reader = Reader.builder().id(1).telNumber(123540).
                dayOfBirthDay("10.04.1991").
                firstName("Petrov").
                lastName("Ivanov").build();

        reader.takeBook(book);
        reader.takeBook(book1);
        reader.takeBook(book2);
        reader.takeBook(book3);
        reader.takeBook(book4);

        reader.returnBook(book);
        reader.returnBook(book3);

    }
}
