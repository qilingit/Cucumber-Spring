package qilin.zhang.test.AddressModification;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/address")
public class AppController {

    Map<String, SubScriber> dataMap = new HashMap<>();

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/init")
    public String initSubscriber() {
        dataMap.put("FACE", new SubScriber("address1", "u1", "FACE", false));
        dataMap.put("EC", new SubScriber("address2", "u2", "EC", true));

        return dataMap.toString();
    }

    @GetMapping("/modify/{channelID}/address={address}")
    public String modifyAddress(@PathVariable String channelID, @PathVariable String address) {
        System.out.println("channelID: " + channelID + "\n, address=" + address);
        // modification of address
        for(Map.Entry<String, SubScriber> e : dataMap.entrySet()) {
            SubScriber s = e.getValue();
            if(e.getKey().equals(channelID)) {
                    s.setAddress(address);
                    e.setValue(s);
            }
        }

        return dataMap.toString();
    }
}
