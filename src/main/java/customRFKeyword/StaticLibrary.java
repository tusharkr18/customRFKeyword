package customRFKeyword;

import org.robotframework.javalib.library.AnnotationLibrary;
//import org.robotframework.javalib.library.RobotJavaLibrary;

public class StaticLibrary extends AnnotationLibrary {

	  public static final String ROBOT_LIBRARY_SCOPE = "GLOBAL";

	  /** Path, under which the keyword implementing classes can be found. */
	  private static final String KEYWORD_PATTERN = "customRFKeyword/keywords/**/*.class";

	  public StaticLibrary() {
	    addKeywordPattern(KEYWORD_PATTERN);
	  }
	

}
