package gameVersuch;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static gameVersuch.spaceInvadersStart.*;

public class Gui extends JFrame implements ActionListener {
    private int count;
    private JLayeredPane jlp;
    private JLabel backgroundOne, rocketOne, rocketTwo, backgroundTwo, coinOne;
    private JTextArea counter;
    private JLabel[] muenzen = new JLabel[100];
    private ImageIcon background, background2, rocket, rocket2, coin;
    private int i = 0;


    public Gui() {
        this.setBounds(0, 0, 1400, 800);

        this.background = new ImageIcon("src\\gameVersuch\\galaxy.jpg");
        this.background2 = new ImageIcon("src\\gameVersuch\\galaxy2.jpg");
        this.rocket = new ImageIcon("src\\gameVersuch\\spacecraftMitFlamme.png");
        this.rocket2 = new ImageIcon("src\\gameVersuch\\spacecraftOhneFlamme.png");
        this.coin = new ImageIcon("src\\gameVersuch\\zweiterVersuch.gif");
        this.backgroundOne = new JLabel(background);
        this.backgroundOne.setBounds(0, 0, 700, 770);
        this.backgroundOne.setVisible(true);
        this.rocketOne = new JLabel(rocket);
        this.rocketOne.setBounds(400, 400, 130, 240);
        this.rocketOne.setVisible(true);
        this.rocketTwo = new JLabel(rocket2);
        this.rocketTwo.setVisible(true);
        this.rocketTwo.setBounds(400, 400, 130, 240);
        this.backgroundTwo = new JLabel(background2);
        this.backgroundTwo.setBounds(0, -770, 700, 770);
        this.backgroundTwo.setVisible(true);
        this.counter = new JTextArea("" + count);
        this.counter.setFont(new Font("Arial", 0, 30));
        this.counter.setFocusable(false);
        this.counter.setEditable(true);
        this.counter.setBackground(Color.yellow);
        this.counter.setForeground(Color.red);
        this.counter.setVisible(true);
        this.counter.setBounds(700, 0, 100, 100);
        this.counter.setSize(40, 35);
        this.jlp = new JLayeredPane();
        this.jlp.add(backgroundOne, 2);
        this.jlp.add(rocketOne, 0);
        this.jlp.add(rocketTwo, 4);
        this.jlp.add(backgroundTwo, 3);
        this.jlp.add(counter, BorderLayout.NORTH, 0);
        this.add(this.jlp);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public JLabel getRocketOne() {
        return this.rocketOne;
    }

    public JLayeredPane getJlp() {
        return this.jlp;
    }

    public JLabel getCoinOne() {
        return this.coinOne;
    }

    public ImageIcon getCoin() {
        return this.coin;
    }

    public void moveRight() {
        this.jlp.moveToBack(this.rocketOne);
        this.jlp.moveToFront(this.rocketTwo);
        int b = this.rocketOne.getX();
        int c = this.rocketTwo.getX();
        int e = this.rocketOne.getY();
        int f = this.rocketTwo.getY();
        this.rocketOne.setLocation(b + 8, e);
        this.rocketTwo.setLocation(c + 8, f);
    }

    public void moveUpRight() {
        this.jlp.moveToBack(this.rocketTwo);
        this.jlp.moveToFront(this.rocketOne);
        int b = this.rocketOne.getX();
        int c = this.rocketTwo.getX();
        int e = this.rocketOne.getY();
        int f = this.rocketTwo.getY();
        this.rocketOne.setLocation(b + 1, e - 1);
        this.rocketTwo.setLocation(c + 1, f - 1);
    }

    public void moveDownRight() {
        this.jlp.moveToBack(this.rocketOne);
        this.jlp.moveToFront(this.rocketTwo);
        int b = this.rocketOne.getX();
        int c = this.rocketTwo.getX();
        int e = this.rocketOne.getY();
        int f = this.rocketTwo.getY();
        this.rocketOne.setLocation(b + 1, e + 1);
        this.rocketTwo.setLocation(c + 1, f + 1);
    }

    public void moveUpLeft() {
        this.jlp.moveToBack(this.rocketTwo);
        this.jlp.moveToFront(this.rocketOne);
        int b = this.rocketOne.getX();
        int c = this.rocketTwo.getX();
        int e = this.rocketOne.getY();
        int f = this.rocketTwo.getY();
        this.rocketOne.setLocation(b - 1, e - 1);
        this.rocketTwo.setLocation(c - 1, f - 1);
    }

    public void moveDownLeft() {
        this.jlp.moveToBack(this.rocketOne);
        this.jlp.moveToFront(this.rocketTwo);
        int b = this.rocketOne.getX();
        int c = this.rocketTwo.getX();
        int e = this.rocketOne.getY();
        int f = this.rocketTwo.getY();
        this.rocketOne.setLocation(b - 1, e + 1);
        this.rocketTwo.setLocation(c - 1, f + 1);
    }

    public void moveLeft() {
        this.jlp.moveToBack(this.rocketOne);
        this.jlp.moveToFront(this.rocketTwo);
        int b = this.rocketOne.getX();
        int c = this.rocketTwo.getX();
        int e = this.rocketOne.getY();
        int f = this.rocketTwo.getY();
        this.rocketOne.setLocation(b - 8, e);
        this.rocketTwo.setLocation(c - 8, f);
    }

    public void moveUp() {
        this.jlp.moveToBack(this.rocketTwo);
        this.jlp.moveToFront(this.rocketOne);
        int b = this.rocketOne.getX();
        int c = this.rocketTwo.getX();
        int e = this.rocketOne.getY();
        int f = this.rocketTwo.getY();
        this.rocketOne.setLocation(b, e - 8);
        this.rocketTwo.setLocation(c, f - 8);
    }

    public void moveDown() {
        this.jlp.moveToBack(this.rocketOne);
        this.jlp.moveToFront(this.rocketTwo);
        int b = this.rocketOne.getX();
        int c = this.rocketTwo.getX();
        int e = this.rocketOne.getY();
        int f = this.rocketTwo.getY();
        this.rocketOne.setLocation(b, e + 8);
        this.rocketTwo.setLocation(c, f + 8);
    }

    public void dontMove(){
        this.jlp.moveToBack(this.rocketOne);
        this.jlp.moveToFront(this.rocketTwo);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.backgroundOne.getY() >= 770) {
            this.backgroundOne.setLocation(0, -770);
        }
        if (this.backgroundTwo.getY() >= 770) {
            this.backgroundTwo.setLocation(0, -770);
        }
        this.backgroundOne.setLocation(this.backgroundOne.getX(), this.backgroundOne.getY() + 5);
        this.backgroundTwo.setLocation(this.backgroundTwo.getX(), this.backgroundTwo.getY() + 5);

        this.rocketOne.setLocation(this.rocketOne.getX(), this.rocketOne.getY() + 2);
        this.rocketTwo.setLocation(this.rocketTwo.getX(), this.rocketTwo.getY() + 2);
        if (rechts && hoch) {
            this.moveUpRight();
        }
        if (rechts && runter) {
            this.moveDownRight();
        }
        if (links && hoch) {
            this.moveUpLeft();
        }
        if (links && runter) {
            this.moveDownLeft();
        }
        if (links) {
            this.moveLeft();
        }
        if (runter) {
            this.moveDown();
        }
        if (rechts) {
            this.moveRight();
        }
        if (hoch) {
            this.moveUp();
        }
        if(hoch == false){
            this.dontMove();
        }
        if(this.rocketOne.getX() > 580){
            this.rocketOne.setLocation(580, this.rocketOne.getY());
        }
        if(this.rocketTwo.getX() > 580){
            this.rocketTwo.setLocation(580, this.rocketTwo.getY());
        }
        if(this.rocketOne.getX() < -20){
            this.rocketOne.setLocation(-20, this.rocketOne.getY());
        }
        if(this.rocketTwo.getX() < -20){
            this.rocketTwo.setLocation(-20, this.rocketTwo.getY());
        }
        collect();
        this.jlp.remove(counter);
        this.counter = new JTextArea("" + count);
        this.counter.setFont(new Font("Arial", 0, 30));
        this.counter.setFocusable(false);
        this.counter.setBackground(Color.yellow);
        this.counter.setForeground(Color.red);
        this.counter.setVisible(true);
        this.counter.setBounds(700, 0, 100, 100);
        this.counter.setSize(40, 35);
        this.jlp.add(counter);
    }

    public void muenzenpop() {
        int x = (int) (Math.random() * 570 - 90);
        int y = (int) (Math.random() * 648 - 88);
        muenzen[i] = new JLabel(coin);
        muenzen[i].setBounds(x, y, 300, 300);
        muenzen[i].setVisible(true);
        this.jlp.add(muenzen[i]);
        this.jlp.moveToFront(muenzen[i]);
        i++;
    }

    public void collect() {
        for (int j = 0; j < i; j++) {
            if (this.rocketOne.getX() - this.muenzen[j].getX() > 0 &&
                    this.rocketOne.getX() - this.muenzen[j].getX() < 160 &&
                    this.rocketOne.getY() - this.muenzen[j].getY() > -71 &&
                    this.rocketOne.getY() - this.muenzen[j].getY() < 190) {
                this.muenzen[j].setBounds(100000, 100000, 1, 1);
                this.count++;
                this.jlp.remove(muenzen[j]);
            }
        }
    }
}
