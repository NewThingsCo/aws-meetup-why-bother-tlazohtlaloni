package co.newthings.tlazohtlaloni.aztecs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AztecController {

    @GetMapping("/jotain")
    public Something getSomething(){
        return new Something("woohoo it works!", "i guess its ok", "kinda doesnt do much");
    }
}
