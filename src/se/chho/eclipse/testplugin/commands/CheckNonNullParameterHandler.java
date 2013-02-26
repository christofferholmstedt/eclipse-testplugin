package se.chho.eclipse.testplugin.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.handlers.HandlerUtil;

public class CheckNonNullParameterHandler extends AbstractHandler {
	 
	private static final String JAVA_EDITOR_ID =
			"org.eclipse.jdt.ui.CompilationUnitEditor";
	
	@Override		 
	public Object execute(ExecutionEvent event) throws ExecutionException {
	  //this object is needed to render wizards, messages and so on
	  Shell activeShell = HandlerUtil.getActiveShell(event);
	  //get selected items or text
	  ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
	 
	  //identify active GUI part
	  String activePartId = HandlerUtil.getActivePartId(event);
	  if (JAVA_EDITOR_ID.equals(activePartId)) {
	    //get edited file
	    IEditorInput input = HandlerUtil.getActiveEditorInput(event);
	    //currentSelection contains text selection inside input file
	    //... locate class selected in that file ...
	  } else {
	    //currentSelection contains all selected classes
	    //... collect all selected classes ...
	  }
	 
	  return null;
	}

}