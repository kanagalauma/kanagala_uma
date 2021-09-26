package com.practice.application;

import java.util.Random;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class WeatherDelegate implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execute) throws Exception {
		Random random = new Random();
		execute.setVariable("Name", "Demo");
		execute.setVariable("WeatherOk", random.nextBoolean());
	}

}
