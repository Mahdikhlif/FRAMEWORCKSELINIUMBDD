package com.up2test.e2etest.automation; 

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/spec/features"},
plugin = {"pretty", "html:target/cucumber_report.html","json:target/report_cucumber.json", 
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
tags=("@moketest"),
snippets = SnippetType.CAMELCASE ,
monochrome = true)

public class TestRanner {
}