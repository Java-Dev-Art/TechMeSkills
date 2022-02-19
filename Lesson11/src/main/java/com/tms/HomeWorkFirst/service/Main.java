package com.tms.HomeWorkFirst.service;

import com.tms.HomeWorkFirst.model.Guitar;
import com.tms.HomeWorkFirst.model.Instrument;
import com.tms.HomeWorkFirst.model.Type;

import java.util.ArrayList;

public class Main {

    static ArrayList<Instrument> instruments = new ArrayList<>();

    public static void main(String[] args) {
        Guitar guitar = new Guitar(6, Type.GUITAR);
        guitar.play();
        guitar.create(Type.GUITAR).play();

        createInstrument(Type.BASS);
        createInstrument(Type.DRUMS);
        createInstrument(Type.FLUTE);
        createInstrument(Type.GUITAR);
    }

    public static void createInstrument(Type type) {
        Instrument instrument = null;
        instruments.add(instrument.create(type));//Еще не доехало, как сделаьб прапильно
        instrument.play();
    }
}
