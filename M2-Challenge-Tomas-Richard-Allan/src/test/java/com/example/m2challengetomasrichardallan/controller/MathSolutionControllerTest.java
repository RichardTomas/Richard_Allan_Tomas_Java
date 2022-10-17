package com.example.m2challengetomasrichardallan.controller;

import com.example.m2challengetomasrichardallan.model.MathSolution;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.junit.Assert.*;

// Referenced RecordStoreApplication activity on Oct 5, 2022
@RunWith(SpringRunner.class)
@WebMvcTest(MathSolutionController.class)
public class MathSolutionControllerTest {
    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    @Before
    public void setUp() {

    }
    @Test
    public void shouldAddOperands() throws Exception {
        MathSolution inputMathSolution = new MathSolution(13,6,"add",13 + 6);

        String inputMathSolutionJson = mapper.writeValueAsString(inputMathSolution);

        MathSolution outputMathSolution = new MathSolution(13,6,"add",13 + 6);

        String outputMathSolutionJson = mapper.writeValueAsString(outputMathSolution);

        mockMvc.perform(post("/add")
                        .content(inputMathSolutionJson)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputMathSolutionJson));
    }
    @Test
    public void shouldThrow422WhenAddingNullOperands() throws Exception {
        MathSolution inputMathSolution = new MathSolution();
        inputMathSolution.setOperand1(null);
        inputMathSolution.setOperand2(2);

        String inputMathSolutionJson = mapper.writeValueAsString(inputMathSolution);

        mockMvc.perform(post("/add")
                        .content(inputMathSolutionJson)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }
    @Test
    public void shouldSubtractOperands() throws Exception {
        MathSolution inputMathSolution = new MathSolution(25,12,"subtract",25 - 12);

        String inputMathSolutionJson = mapper.writeValueAsString(inputMathSolution);

        MathSolution outputMathSolution = new MathSolution(25,12,"subtract",25 - 12);

        String outputMathSolutionJson = mapper.writeValueAsString(outputMathSolution);

        mockMvc.perform(post("/subtract")
                        .content(inputMathSolutionJson)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputMathSolutionJson));
    }
    @Test
    public void shouldThrow422WhenSubtractingNullOperands() throws Exception {
        MathSolution inputMathSolution = new MathSolution();
        inputMathSolution.setOperand1(6);
        inputMathSolution.setOperand2(null);

        String inputMathSolutionJson = mapper.writeValueAsString(inputMathSolution);

        mockMvc.perform(post("/subtract")
                        .content(inputMathSolutionJson)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }
    @Test
    public void shouldMultiplyOperands() throws Exception {
        MathSolution inputMathSolution = new MathSolution(6,9,"multiply",6 * 9);

        String inputMathSolutionJson = mapper.writeValueAsString(inputMathSolution);

        MathSolution outputMathSolution = new MathSolution(6,9,"multiply",6 * 9);

        String outputMathSolutionJson = mapper.writeValueAsString(outputMathSolution);

        mockMvc.perform(post("/multiply")
                        .content(inputMathSolutionJson)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputMathSolutionJson));
    }
    @Test
    public void shouldThrow422WhenMultiplyingNullOperands() throws Exception {
        MathSolution inputMathSolution = new MathSolution();
        inputMathSolution.setOperand1(7);
        inputMathSolution.setOperand2(null);

        String inputMathSolutionJson = mapper.writeValueAsString(inputMathSolution);

        mockMvc.perform(post("/multiply")
                        .content(inputMathSolutionJson)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }
    @Test
    public void shouldThrow422WhenMultiplyingOperandsOfZero() throws Exception {
        MathSolution inputMathSolution = new MathSolution();
        inputMathSolution.setOperand1(0);
        inputMathSolution.setOperand2(7);

        String inputMathSolutionJson = mapper.writeValueAsString(inputMathSolution);

        mockMvc.perform(post("/multiply")
                        .content(inputMathSolutionJson)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }
    @Test
    public void shouldDivideOperands() throws Exception {
        MathSolution inputMathSolution = new MathSolution(51,17,"divide",51 / 17);

        String inputMathSolutionJson = mapper.writeValueAsString(inputMathSolution);

        MathSolution outputMathSolution = new MathSolution(51,17,"divide",51 / 17);

        String outputMathSolutionJson = mapper.writeValueAsString(outputMathSolution);

        mockMvc.perform(post("/divide")
                        .content(inputMathSolutionJson)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputMathSolutionJson));
    }
    @Test
    public void shouldThrow422WhenDividingNullOperands() throws Exception {
        MathSolution inputMathSolution = new MathSolution();
        inputMathSolution.setOperand1(null);
        inputMathSolution.setOperand2(3);

        String inputMathSolutionJson = mapper.writeValueAsString(inputMathSolution);

        mockMvc.perform(post("/divide")
                        .content(inputMathSolutionJson)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }
    @Test
    public void shouldThrow422WhenDividingOperandsOfZero() throws Exception {
        MathSolution inputMathSolution = new MathSolution();
        inputMathSolution.setOperand1(27);
        inputMathSolution.setOperand2(0);

        String inputMathSolutionJson = mapper.writeValueAsString(inputMathSolution);

        mockMvc.perform(post("/divide")
                        .content(inputMathSolutionJson)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }
}