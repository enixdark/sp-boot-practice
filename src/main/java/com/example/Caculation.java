package com.example;

import java.util.List;

/**
 * Created by cqshinn on 14/03/2017.
 */
public class Caculation {
    String function;
    private List<String> input;
    private List<String> output;

    public Caculation(List<String> input, List<String> output, String function){
        this.setFunction(function);
        this.setInput(input);
        this.setOutput(output);
    }


    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public List<String> getInput() {
        return input;
    }

    public void setInput(List<String> input) {
        this.input = input;
    }

    public List<String> getOutput() {
        return output;
    }

    public void setOutput(List<String> output) {
        this.output = output;
    }
}
