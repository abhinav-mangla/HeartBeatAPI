package com.micronaut.components.heartbeat.heartbeatController;

import com.micronaut.components.heartbeat.heartbeatService.HeartbeatService;
import com.micronaut.payloads.HeartbeatResponsePayload;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/hello")
public class HeartbeatController {
    @Get
    @Produces(MediaType.TEXT_PLAIN)
    public String getBeat() {
        HeartbeatService heartbeatService = new HeartbeatService();
        String timestamp = String.valueOf(heartbeatService.getBeat().getHeartbeatTimestamp());
        HeartbeatResponsePayload payload = new HeartbeatResponsePayload(timestamp);
        return payload.getBeatTimeStamp();
    }
}