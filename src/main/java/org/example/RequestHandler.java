package org.example;

public abstract class RequestHandler {
    protected RequestHandler nextHandler;

    public void setNextHandler(RequestHandler handler) {
        this.nextHandler = handler;
    }

    public abstract void handleRequest(Request request);
}