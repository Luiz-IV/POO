package org.example;

public class ConcreteHandler1 extends RequestHandler {
    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals("Type1")) {
            System.out.println("Handling Type1 request in ConcreteHandler1");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Cannot handle the request.");
        }
    }
}
