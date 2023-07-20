package com.technicalex.logtailer.api.facade;

import com.technicalex.logtailer.api.service.LogTailingServiceV1;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class LogTailingFacadeV1 {

    private final LogTailingServiceV1 logTailingServiceV1;

    public String getLogByMacAddr( String macAddr ){
        return logTailingServiceV1.getLogByMacAddr( macAddr );
    }
}
