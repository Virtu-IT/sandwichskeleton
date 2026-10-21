package be.abis.sandwich;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SandwichskeletonApplication {

    public static void main(String[] args) {
        // H2 AUTO_SERVER: advertise 127.0.0.1 so IntelliJ's Database tool can connect,
        // even when the PC has a VPN/company network adapter that is not reachable.
        System.setProperty("h2.bindAddress", "127.0.0.1");
        SpringApplication.run(SandwichskeletonApplication.class, args);
    }

}
