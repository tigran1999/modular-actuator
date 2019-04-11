package am.itspace.client.util;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ActuatorInfo implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        Map<String,String> information = new HashMap<>();
        information.put("Created By","Tigran Mkrtchyan");
        information.put("Spring Boot Version","2.1.4.RELEASE");
        builder.withDetail("project info",information);
    }
}
