package com.technicalex.logtailer.api.service.impl;

import com.technicalex.logtailer.api.service.LogTailingServiceV1;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LogTailingServiceImplV1 implements LogTailingServiceV1 {


    @Override
    public String getLogByMacAddr(String macAddr) {
        return "TEST";
    }
}
