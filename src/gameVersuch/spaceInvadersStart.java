package gameVersuch;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class spaceInvadersStart{
    static boolean rechts;
    static boolean links;
    static boolean hoch;
    static boolean runter;
    public static void main(String[] args) {
        gameVersuch.Gui gui = new gameVersuch.Gui();
        new JLabel(gui.getCoin());
        KeyListener l = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    hoch = true;
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    runter = true;
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    rechts = true;
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    links = true;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    hoch = false;
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    rechts = false;
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    links = false;
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    runter = false;
                }
            }
        };
        Runnable runnabledelayedTask = new Runnable() {
            @Override
            public void run() {
                gui.muenzenpop();
            }
        };
        gui.addKeyListener(l);
        Timer updateBackgroundAndRocket = new Timer(1, gui);
        updateBackgroundAndRocket.start();

        ScheduledExecutorService scheduledPool = Executors.newScheduledThreadPool(1);
        scheduledPool.scheduleWithFixedDelay(runnabledelayedTask, 4, 1, TimeUnit.SECONDS);
    }
}
