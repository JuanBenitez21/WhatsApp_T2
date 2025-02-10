package edu.unisabana.dyas.patterns.util;

public class MessagingClient implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
    }
}