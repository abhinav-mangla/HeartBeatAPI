package com.micronaut.common.models.heartbeatModel;

import java.util.Date;

public class HeartbeatModel {
    private Date heartbeatTimestamp;

    public HeartbeatModel(Date timestamp)
    {
        this.heartbeatTimestamp = timestamp;
    }

    public Date getHeartbeatTimestamp() {
        return heartbeatTimestamp;
    }
}
