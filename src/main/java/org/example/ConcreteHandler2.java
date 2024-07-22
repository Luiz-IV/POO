package org.example;

public class ConcreteHandler2 extends RequestHandler {
    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals("Type2")) {
            System.out.println("Handling Type2 request in ConcreteHandler2");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Cannot handle the request.");
        }
    }
}