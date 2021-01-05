/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.nio.charset.Charset;
import java.util.Random;

/**
 *
 * @author George.Pasparakis
 */
public class RandomTShirt extends TShirt {

    public RandomTShirt() {
        super();
        this.setSize(Size.values()[getRandomNumber(0, 6)]);
        this.setColor(Color.values()[getRandomNumber(0, 6)]);
        this.setFabric(Fabric.values()[getRandomNumber(0, 6)]);
    }

    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    // https://www.baeldung.com/java-random-string
    private void givenUsingPlainJava_whenGeneratingRandomStringUnbounded_thenCorrect() {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));

        System.out.println(generatedString);
    }
}
