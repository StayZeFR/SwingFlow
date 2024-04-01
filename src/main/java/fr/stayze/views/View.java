package fr.stayze.views;

import fr.stayze.controllers.Controller;
import fr.stayze.core.Parameters;

import javax.swing.*;

public abstract class View extends JPanel {

    private Parameters parameters;
    private Controller controller;

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

}
