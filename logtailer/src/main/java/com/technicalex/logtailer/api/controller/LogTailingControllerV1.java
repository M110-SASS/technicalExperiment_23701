package com.technicalex.logtailer.api.controller;

import com.technicalex.logtailer.api.facade.LogTailingFacadeV1;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor

@RestController
@RequestMapping("/api/v1/logtail")
public class LogTailingControllerV1 {

    private final LogTailingFacadeV1 logTailingFacadeV1;

    @GetMapping("/getByMacAddr/{addr}")
    public String getByMacAddr(
            @PathVariable("addr") String addr
    ){
        return this.logTailingFacadeV1.getLogByMacAddr( addr );
    }

    @GetMapping("/test")
    public String test(){
        return "OK";
    }
}
