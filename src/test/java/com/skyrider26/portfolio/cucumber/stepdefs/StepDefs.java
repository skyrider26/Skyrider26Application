package com.skyrider26.portfolio.cucumber.stepdefs;

import com.skyrider26.portfolio.Skyrider26ApplicationApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = Skyrider26ApplicationApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
