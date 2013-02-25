package se.chho.eclipse.testplugin.builders;

import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

public class MyBuilder extends IncrementalProjectBuilder {

 public static final String BUILDER_ID = "se.chho.eclipse.testplugin.builders.MyBuilder";

	@Override
	protected IProject[] build(int kind, Map<String, String> args,
		IProgressMonitor monitor) throws CoreException {
	// TODO Auto-generated method stub
	
	System.out.println("Custom builder triggered");

	  // get the project to build
	  getProject();
	
	  switch (kind) {
	
	  case FULL_BUILD:
	   break;
	
	  case INCREMENTAL_BUILD:
	   break;
	
	  case AUTO_BUILD:
	   break;
	  }
	
	  return null;	 
	}
}