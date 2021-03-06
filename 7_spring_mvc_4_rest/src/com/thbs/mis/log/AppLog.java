package com.thbs.mis.log;
/**
 * Title : AppLog
 * 
 * Description : This interface defines all the methods 
 * that must be implemented for logging .
 *
 */
public interface AppLog {
	/**
	 * Logs the given string in the standard log file at
	 * debug log level.
	 * 
	 * @param message the message that needs to be logged.
	 */
	void debug(String message);

	/**
	 * Logs the given string in the standard log file at
	 * debug log level.
	 * 
	 * @param message the message that needs to be logged.
	 * 
	 * @param frag1 the first fragment to be appended.
	 */
	void debug(String message, Object frag1);

	/**
	 * Logs the given string in the standard log file at
	 * debug log level.
	 * 
	 * @param message the message that needs to be logged.
	 * 
	 * @param frag1 the first fragment to be appended.
	 * 
	 * @param frag2 the second fragment to be appended.
	 */
	void debug(String message, Object frag1, Object frag2);

	/**
	 * Logs the given string in the standard log file at
	 * debug log level.
	 * 
	 * @param message the message that needs to be logged.
	 * 
	 * @param frag1 the first fragment to be appended.
	 * 
	 * @param frag2 the second fragment to be appended.
	 * 
	 * @param frag3 the third fragment to be appended.
	 */
	void debug(String message, Object frag1, Object frag2, Object frag3);

	/**
	 * Logs the given string in the standard log file at
	 * debug log level.
	 * 
	 * @param message the message that needs to be logged.
	 * 
	 * @param fragments the fragments to be appended.
	 */
	void debug(String message, Object[] fragments);

	/**
	 * Logs the given string in the standard log file at
	 * info log level.
	 * 
	 * @param message the message that needs to be logged .
	 */
	void info(String message);

	/**
	 * Logs the given string in the standard log file at
	 * info log level.
	 * 
	 * @param message the message that needs to be logged.
	 * 
	 * @param frag1 the first fragment to be appended.
	 */
	void info(String message, Object frag1);

	/**
	 * Logs the given string in the standard log file at
	 * info log level.
	 * 
	 * @param message the message that needs to be logged.
	 * 
	 * @param frag1 the first fragment to be appended.
	 * 
	 * @param frag2 the second fragment to be appended.
	 */
	void info(String message, Object frag1, Object frag2);

	/**
	 * Logs the given string in the standard log file at
	 * info log level.
	 * 
	 * @param message the message that needs to be logged.
	 * 
	 * @param frag1 the first fragment to be appended.
	 * 
	 * @param frag2 the second fragment to be appended.
	 * 
	 * @param frag3 the third fragment to be appended.
	 */
	void info(String message, Object frag1, Object frag2, Object frag3);

	/**
	 * Logs the given string in the standard log file at
	 * info log level.
	 * 
	 * @param message the message that needs to be logged.
	 * 
	 * @param fragments the fragments to be appended.
	 */
	void info(String message, Object[] fragments);

	/**
	 * Logs the given string in the standard log file at the
	 * warning level .
	 * 
	 * @param message the message that needs to be logged .
	 */
	void warn(String message);

	/**
	 * Logs the given string in the standard log file at
	 * warning log level.
	 * 
	 * @param message the message that needs to be logged.
	 * 
	 * @param frag1 the first fragment to be appended.
	 */
	void warn(String message, Object frag1);

	/**
	 * Logs the given string in the standard log file at
	 * warning log level.
	 * 
	 * @param message the message that needs to be logged.
	 * 
	 * @param frag1 the first fragment to be appended.
	 * 
	 * @param frag2 the second fragment to be appended.
	 */
	void warn(String message, Object frag1, Object frag2);

	/**
	 * Logs the given string in the standard log file at
	 * warning log level.
	 * 
	 * @param message the message that needs to be logged.
	 * 
	 * @param frag1 the first fragment to be appended.
	 * 
	 * @param frag2 the second fragment to be appended.
	 * 
	 * @param frag3 the third fragment to be appended.
	 */
	void warn(String message, Object frag1, Object frag2, Object frag3);

	/**
	 * Logs the given string in the standard log file at
	 * warning log level.
	 * 
	 * @param message the message that needs to be logged.
	 * 
	 * @param fragments the fragments to be appended.
	 */
	void warn(String message, Object[] fragments);

	/**
	 * Logs the given string in the standard log file at the
	 * error level.
	 * 
	 * @param message the message that needs to be logged.
	 */
	void error(String message);

	/**
	 * Logs the given string in the standard log file at the
	 * error level with the exception message .
	 * 
	 * @param message the message that needs to be logged.
	 * 
	 * @param throwable the <code>Throwable</code> to be logged.
	 */
	void error(String message, Throwable throwable);

	/**
	 * Logs the given string in the standard log file at the
	 * fatal level.
	 * 
	 * @param message the message that needs to be logged.
	 */
	void fatal(String message);

	/**
	 * Logs the given string in the standard log file at the
	 * fatal level with the exception message 
	 * 
	 * @param message the message that needs to be logged.
	 * @param throwable the <code>Throwable</code> to be logged.
	 */
	void fatal(String message, Throwable throwable);

	/**
	 * Logs a method entry with no parameters
	 * at debug level.
	 * 
	 * @param methodName the string containing method name.
	 */
	void entering(String methodName);

	/**
	 * Logs a method entry with one parameter
	 * at debug level.
	 * 
	 * @param methodName the method name
	 * 
	 * @param param1 the first parameter of the method
	 */
	void entering(String methodName, Object param1);

	/**
	 * Logs a method entry with two parameters
	 * at debug level.
	 * 
	 * @param methodName the string containing method name.
	 *            
	 * @param param1 the first parameter of the method.
	 * 
	 * @param param2 the second parameter of the method.
	 */
	void entering(String methodName, Object param1, Object param2);

	/**
	 * Logs a method entry with three parameters
	 * at debug level.
	 * 
	 * @param methodName the string containing method name.
	 * 
	 * @param param1 the first parameter of the method.
	 *            
	 * @param param2 the second parameter of the method.
	 * 
	 * @param param3 the third parameter of the method.
	 * 
	 */
	void entering(String methodName, Object param1, Object param2, Object param3);

	/**
	 * Logs a method entry with the list of its parameters
	 * at debug level.
	 * 
	 * @param methodName the string containing method name.
	 * 
	 * @param params  an array of the parameters of the method. 
	 *                      
	 */
	void entering(String methodName, Object[] params);

	/**
	 * Logs the exit from a method at debug level.
	 * 
	 * @param methodName the string containing method name.
	 */
	void exiting(String methodName);

	/**
	 * Logs the exit from a method which returns a value 
	 * at debug level.
	 * 
	 * @param methodName the string containing method name.
	 *
	 * @param retVal the return value of the method.
	 */
	void exiting(String methodName, Object retVal);

	/**
	 * Prints the start of use case message into the
	 * logger at info level.
	 * 
	 * @param usecase a string containing the use case name.
	 */
	void startUsecase(String usecase);

	/**
	 * Prints the end of use case message into the
	 * logger at info level.
	 * 
	 * @param usecase a string containing the use case name.
	 */
	void endUsecase(String usecase);
	
	boolean isDebugOn();
	
	boolean isInfoOn();
	
	void fatal(Throwable cause);
	
}