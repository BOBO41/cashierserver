package com.archy.cash.scheduler;

import com.archy.cash.service.CashService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class SchedulerBill {

    @Resource
    private CashService cashService;

    @Scheduled(fixedRate = 1000)
    private void tick(){
        this.cashService.tick();
    }

}
