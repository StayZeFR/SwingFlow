package fr.stayze.controllers;

import fr.stayze.core.Window;

public class ExampleController extends Controller {

    public ExampleController(Window window) {
        super(window);
    }

    @Override
    protected void init() {

    }

    @Override
    protected void event() {

    }

    @Override
    protected Controller getInstance() {
        return this;
    }

}
