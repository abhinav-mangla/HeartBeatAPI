package com.micronaut.components.heartbeat.heartbeatService;

import com.micronaut.common.models.heartbeatModel.HeartbeatModel;
import com.micronaut.components.heartbeat.heartbeatRepository.HeartbeatRespository;

public class HeartbeatService {
    public HeartbeatModel getBeat()
    {
        HeartbeatRespository heartbeatRepo = new HeartbeatRespository();
        HeartbeatModel timestamp = heartbeatRepo.getBeat();
        return timestamp;
    }
}
