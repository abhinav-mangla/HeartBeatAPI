package com.micronaut.components.heartbeat.heartbeatRepository;

import com.micronaut.common.models.heartbeatModel.HeartbeatModel;

import java.util.Date;

public class HeartbeatRespository {

    public HeartbeatRespository() {
    }

    public HeartbeatModel getBeat()
    {
        return new HeartbeatModel(new Date());
    }
}
