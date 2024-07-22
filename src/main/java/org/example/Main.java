package org.example;

public class Main {
    public static void main(String[] args) {
        // Configurando a cadeia de manipuladores
        RequestHandler handler1 = new ConcreteHandler1();
        RequestHandler handler2 = new ConcreteHandler2();
        handler1.setNextHandler(handler2);

        // Criando diferentes tipos de solicitações
        Request request1 = new Request("Type1");
        Request request2 = new Request("Type2");
        Request request3 = new Request("Type3");

        // Tratando as solicitações
        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
        handler1.handleRequest(request3);
    }
}