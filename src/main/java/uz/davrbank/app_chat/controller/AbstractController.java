package uz.davrbank.app_chat.controller;

public abstract class AbstractController<S> {
    protected final S service;

    public AbstractController(S service) {
        this.service = service;
    }
}
