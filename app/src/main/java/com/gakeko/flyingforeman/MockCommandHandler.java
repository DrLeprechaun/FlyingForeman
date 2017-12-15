package com.gakeko.flyingforeman;

/**
 * Created by Leprechaun on 15.12.2017.
 */

public class MockCommandHandler {

    private String response;

    MockCommandHandler() {
        this.response = "empty";
    }

    MockCommandHandler(String message) {
        this.response = "Message '" + message + "' was handled'";
    }

    public String getResponse() {
        return this.response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
