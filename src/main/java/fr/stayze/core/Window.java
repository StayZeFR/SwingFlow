package fr.stayze.core;

import fr.stayze.controllers.Controller;

import javax.swing.*;

public class Window extends JFrame {

    public Window() {
        this("SwingFlow");
    }

    public Window(String title) {
        super(title);
        this.init();
    }

    public void init() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void setView(Controller controller) {
        this.setContentPane(controller.getView());
        this.removeAll();
        this.repaint();
        this.revalidate();
    }

}
