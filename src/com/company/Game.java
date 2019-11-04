package com.company;

import javax.swing.*;
import java.awt.*;

class Main extends Canvas implements Runnable {

    public static final int PLOTIS = 1366, AUKSTIS = 768;
    private boolean vykdymas = false;
    private  Thread gija;

    public Main(){
        Dimension matmenys = new Dimension(Main.PLOTIS, Main.AUKSTIS);
        setPreferredSize(matmenys);
    }

    public static void main(String[] args) {

        JFrame kadras = new JFrame("Žaidimas");
        Main game = new Main();
        kadras.add(game);

        kadras.setResizable(false);
        kadras.pack();

        kadras.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        kadras.setLocationRelativeTo(null);
        kadras.setVisible(true);

        //testing 123

    }

    //Runnable metodas:
    @Override
    public void run() {
        update();
        render();

    }

    private void update() {

    }

    private void render() {

    }
}
