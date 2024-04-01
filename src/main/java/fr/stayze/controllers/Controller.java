package fr.stayze.controllers;

import fr.stayze.core.Logger;
import fr.stayze.core.Parameters;
import fr.stayze.core.Window;
import fr.stayze.views.View;

import java.lang.reflect.InvocationTargetException;

public abstract class Controller {

    private Window window;
    private View view;

    public Controller(Window window) {
        this.window = window;
    }

    public void render(Class<? extends View> view, Parameters parameters) {
        try {
            this.view = view.getDeclaredConstructor().newInstance();
            this.initView(parameters);
            this.window.setContentPane(this.view);
            this.window.revalidate();
            this.window.repaint();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            Logger.error(e.getMessage());
        }
    }

    private void initView(Parameters parameters) {
        this.view.setController(this.getInstance());
        this.view.setParameters(parameters);
    }

    public void render(Class<? extends View> view) {
        this.render(view, new Parameters());
    }

    public View getView() {
        return this.view;
    }

    protected abstract void init();
    protected abstract void event();
    protected abstract Controller getInstance();


}
