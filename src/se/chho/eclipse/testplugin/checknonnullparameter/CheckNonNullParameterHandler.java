package se.chho.eclipse.testplugin.checknonnullparameter;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

public class CheckNonNullParameterHandler extends AbstractHandler {
	 
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		  System.out.println("Check Non-Null parameter");
		return null;
	}
	 
}