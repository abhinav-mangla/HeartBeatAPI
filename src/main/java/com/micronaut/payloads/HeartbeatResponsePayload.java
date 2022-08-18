package com.micronaut.payloads;

public class HeartbeatResponsePayload {
    private String beatTimeStamp;

    public HeartbeatResponsePayload(String timestamp)
    {
        this.beatTimeStamp = timestamp;
    }

    public String getBeatTimeStamp() {
        return beatTimeStamp;
    }
}
