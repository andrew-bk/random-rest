package org.ak.random;

import org.springframework.web.bind.annotation.*;

import java.util.Random;

/**
 */
@RestController
@RequestMapping(path = "/random/integer")
public class RandomIntegerGeneratorController {

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody int randomInteger() {
        return generateInteger(0, 10);
    }

    @RequestMapping(path = "/from/{from}/to/{to}")
    public @ResponseBody Integer randomIntegerInRange(@PathVariable("from") int from, @PathVariable("to") int to) {
        return generateInteger(from, to);
    }

    public Integer generateInteger(int from, int to) {
        if(from == to) {
            return to;
        }

        int range = to - from + 1;

        return new Random().nextInt(range) + from;
    }
}
