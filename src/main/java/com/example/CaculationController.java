package com.example;

import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cqshinn on 14/03/2017.
 */
@RestController
@RequestMapping("/calculation")
public class CaculationController {
    private static final String PATTERN = "^-?+\\d+\\.?+\\d*$";

    @RequestMapping("/power")
    public Caculation pow(@RequestParam(value = "base") String b,
                          @RequestParam(value = "exponent") String e){
        List<String> input = Lists.newArrayList(b, e);
        List<String> output = Lists.newArrayList();
        String powValue = (b != null && e != null && b.matches(PATTERN) && e.matches(PATTERN)) ?
                String.valueOf(Math.pow(Double.valueOf(b), Double.valueOf(e))) :
                "Input value is not set to numeric value.";
        output.add(powValue);

        return new Caculation(input, output, "power");

    }

    @RequestMapping(value = "/sqrt/{value:.+}", method = GET)
    public Caculation sqrt(@PathVariable(value = "value") String aValue){
        List<String> input = Lists.newArrayList(aValue);
        List<String> output = Lists.newArrayList();
        String powValue = (aValue != null && aValue.matches(PATTERN)) ?
                String.valueOf(Math.sqrt(Double.valueOf(aValue))) :
                "Input value is not set to numeric value.";
        output.add(powValue);
        return new Caculation(input, output, "sqrt");
    }
}
