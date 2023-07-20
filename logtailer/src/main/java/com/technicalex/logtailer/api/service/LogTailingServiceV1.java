package com.technicalex.logtailer.api.service;

import org.springframework.stereotype.Service;

@Service
public interface LogTailingServiceV1 {
    String getLogByMacAddr( String macAddr );
}
