package week_2.OOPS.music.live;

import week_2.OOPS.music.Playable;
import week_2.OOPS.music.string.Veena;
import week_2.OOPS.music.wind.Saxophone;


public class Test {

    public static void main(String[] args) {

        // a. Create Veena object and call play()
        Veena veena = new Veena();
        veena.play();

        // b. Create Saxophone object and call play()
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        // c. Using Playable reference
        Playable p;

        p = new Veena();
        p.play();

        p = new Saxophone();
        p.play();
    }
}