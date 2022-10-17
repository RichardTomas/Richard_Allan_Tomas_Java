package com.example.m2challengetomasrichardallan.controller;

import com.example.m2challengetomasrichardallan.model.MathSolution;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MathSolutionController {

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public MathSolution addOperands(@RequestBody MathSolution mathSolution) {

        if (mathSolution.getOperand1() == null || mathSolution.getOperand2() == null) {
            throw new NullPointerException("Values must not be null");
        }
        mathSolution.setOperation("add");
        mathSolution.setAnswer(mathSolution.getOperand1() + mathSolution.getOperand2());
        return mathSolution;
    }

    @RequestMapping(value = "/subtract", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public MathSolution subtractOperands(@RequestBody MathSolution mathSolution) {
        if (mathSolution.getOperand1() == null || mathSolution.getOperand2() == null) {
            throw new NullPointerException("Values must not be null");
        }
        mathSolution.setOperation("subtract");
        mathSolution.setAnswer(mathSolution.getOperand1() - mathSolution.getOperand2());
        return mathSolution;
    }

    @RequestMapping(value = "/multiply", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public MathSolution multiplyOperands(@RequestBody MathSolution mathSolution) {
        if (mathSolution.getOperand1() == null || mathSolution.getOperand2() == null) {
            throw new NullPointerException("Values must not be null");
        }
        if (mathSolution.getOperand1() == 0 || mathSolution.getOperand2() == 0) {
            throw new ArithmeticException("Values must not be 0");
        }
        mathSolution.setOperation("multiply");
        mathSolution.setAnswer(mathSolution.getOperand1() * mathSolution.getOperand2());
        return mathSolution;
    }

    @RequestMapping(value = "/divide", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public MathSolution divideOperands(@RequestBody MathSolution mathSolution) {
        if (mathSolution.getOperand1() == null || mathSolution.getOperand2() == null) {
            throw new NullPointerException("Values must not be null");
        }
        if (mathSolution.getOperand1() == 0 || mathSolution.getOperand2() == 0) {
            throw new ArithmeticException("Values must not be 0");
        }
        mathSolution.setOperation("divide");
        mathSolution.setAnswer(mathSolution.getOperand1() / mathSolution.getOperand2());
        return mathSolution;
    }
}
