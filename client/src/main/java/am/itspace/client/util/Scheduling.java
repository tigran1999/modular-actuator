package am.itspace.client.util;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Scheduling {
    @Scheduled(fixedDelay = 1000)
    public void printDate(){
        System.out.println(new Date());
    }


}
