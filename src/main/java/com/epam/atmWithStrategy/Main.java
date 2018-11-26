package com.epam.atmWithStrategy;

public class Main {
    /**
     * This is method for launching our ATMs
     *
     * @param args
     */

    public static void main(String[] args) {
        ThreadToTestAtm a = new ThreadToTestAtm();
        ThreadToTestAtm b = new ThreadToTestAtm();
        ThreadToTestAtm c = new ThreadToTestAtm();
        ThreadToTestAtm d = new ThreadToTestAtm();
        ThreadToTestToyAtm w = new ThreadToTestToyAtm();
        ThreadToTestToyAtm x = new ThreadToTestToyAtm();
        ThreadToTestToyAtm y = new ThreadToTestToyAtm();
        ThreadToTestToyAtm z = new ThreadToTestToyAtm();
        a.start();
        b.start();
        c.start();
        d.start();
        w.start();
        x.start();
        y.start();
        z.start();
    }
}
