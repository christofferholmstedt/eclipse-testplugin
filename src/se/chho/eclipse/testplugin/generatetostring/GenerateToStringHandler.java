package se.chho.eclipse.testplugin.generatetostring;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

public class GenerateToStringHandler extends AbstractHandler {
	 
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		  System.out.println("GenerateToStringHandler");
		return null;
	}
	 
}