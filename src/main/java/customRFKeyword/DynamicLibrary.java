package customRFKeyword;

import java.util.Arrays;

import org.robotframework.javalib.library.RobotJavaLibrary;

public class DynamicLibrary implements RobotJavaLibrary {

	  public Object runKeyword(String keywordName, Object[] args) {
	    System.out.println(keywordName + ": " + Arrays.asList(args));
	    return null;
	  }

	  public String[] getKeywordNames() {
	    return new String[] {"Dynamic message from ${x} to ${y}"};
	  }

}
