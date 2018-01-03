package model;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Checker {

	public Checker(){}

	public boolean checkInputs(String iDate, String iStore, String iPurchase) {

		Logger logger = LogManager.getLogger(Checker.class);
		logger.debug("Input Check");
		boolean result = true;

		List<String> inputs = new ArrayList<>();
		inputs.add(iDate);
		inputs.add(iStore);
		inputs.add(iPurchase);

		return result;
	}

}
