package com.thbs.mis.log;

import org.apache.log4j.Appender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.Filter;
/**
 * Title : AppLogger
 * 
 * Description : This class contains methods that handle logging of the 
 * application
 *  
 * */
public class AppLogger implements AppLog {
	/**
	 * Enter method prefix
	 */
	private static final String ENTER_PREFIX = " ENTERING METHOD : ";

	/**
	 * Exit method prefix
	 */
	private static final String EXIT_PREFIX = " EXITING METHOD : ";

	/**
	 * Parameter prefix
	 */
	private static final String PARAM_PREFIX = " PARAM";

	/**
	 * Return value prefix
	 */
	private static final String RETURN_PREFIX = " RETURN VALUE = ";

	/**
	 * Query Description prefix
	 */
	private static final String QUERY_DESC_PREFIX = " QUERY DESCRIPTION = ";

	/**
	 * Query Data prefix
	 */
	private static final String QUERY_PREFIX = " QUERY = ";

	/**
	 * Name of this class.
	 */
	private static final String APP_LOGGER_CLASS_NAME = AppLogger.class
			.getName();

	/**
	 * Log4j logger for logging
	 */
	private final Logger logger;

	/**
	 * Creates a logger for the given class.
	 * 
	 * @param cls
	 *            the <code>Class</code> object interested in logging.
	 */
	public AppLogger(Class cls) {
		this.logger = Logger.getLogger(cls);
	}

	/**
	 * Returns the logger object being used for logging by this class.
	 * 
	 * @return a <code>Logger</code> object being used for logging by this
	 *         class.
	 */
	protected Logger getLogger() {
		return this.logger;
	}

	/**
	 * {@inheritDoc}
	 */
	public void debug(String message) {
		this.debug(message, null);
	}

	/**
	 * {@inheritDoc}
	 */
	public void debug(String message, Object frag1) {
		this.debug(message, new Object[] { frag1 });
	}

	/**
	 * {@inheritDoc}
	 */
	public void debug(String message, Object frag1, Object frag2) {
		this.debug(message, new Object[] { frag1, frag2 });
	}

	/**
	 * {@inheritDoc}
	 */
	public void debug(String message, Object frag1, Object frag2, Object frag3) {
		this.debug(message, new Object[] { frag1, frag2, frag3 });
	}

	/**
	 * {@inheritDoc}
	 */
	public void debug(String message, Object[] fragments) {
		logger.log(APP_LOGGER_CLASS_NAME, Level.DEBUG, this.append(message,
				fragments), null);
	}

	/**
	 * {@inheritDoc}
	 */
	public void info(String message) {
		this.info(message, null);
	}

	/**
	 * {@inheritDoc}
	 */
	public void info(String message, Object frag1) {
		this.info(message, new Object[] { frag1 });
	}

	/**
	 * {@inheritDoc}
	 */
	public void info(String message, Object frag1, Object frag2) {
		this.info(message, new Object[] { frag1, frag2 });
	}

	/**
	 * {@inheritDoc}
	 */
	public void info(String message, Object frag1, Object frag2, Object frag3) {
		this.info(message, new Object[] { frag1, frag2, frag3 });
	}

	/**
	 * {@inheritDoc}
	 */
	public void info(String message, Object[] fragments) {
		logger.log(APP_LOGGER_CLASS_NAME, Level.INFO, this.append(message,
				fragments), null);
	}

	/**
	 * {@inheritDoc}
	 */
	public void warn(String message) {
		this.warn(message, null);
	}

	/**
	 * {@inheritDoc}
	 */
	public void warn(String message, Object frag1) {
		this.warn(message, new Object[] { frag1 });
	}

	/**
	 * {@inheritDoc}
	 */
	public void warn(String message, Object frag1, Object frag2) {
		this.warn(message, new Object[] { frag1, frag2 });
	}

	/**
	 * {@inheritDoc}
	 */
	public void warn(String message, Object frag1, Object frag2, Object frag3) {
		this.warn(message, new Object[] { frag1, frag2, frag3 });
	}

	/**
	 * {@inheritDoc}
	 */
	public void warn(String message, Object[] fragments) {
		logger.log(APP_LOGGER_CLASS_NAME, Level.WARN, this.append(message,
				fragments), null);
	}

	/**
	 * {@inheritDoc}
	 */
	public void error(String message) {
		logger.log(APP_LOGGER_CLASS_NAME, Level.ERROR, message, null);
	}

	/**
	 * {@inheritDoc}
	 */
	public void error(String message, Throwable throwable) {
		logger.log(APP_LOGGER_CLASS_NAME, Level.ERROR, message, throwable);
	}

	/**
	 * {@inheritDoc}
	 */
	public void fatal(String message) {
		logger.log(APP_LOGGER_CLASS_NAME, Level.FATAL, message, null);
	}

	/**
	 * {@inheritDoc}
	 */
	public void fatal(String message, Throwable throwable) {
		logger.log(APP_LOGGER_CLASS_NAME, Level.FATAL, message, throwable);
	}

	/**
	 * {@inheritDoc}
	 */
	public void startUsecase(String usecase) {
		logger.log(APP_LOGGER_CLASS_NAME, Level.INFO, "-----Start Use Case: "
				+ usecase + " -----", null);

	}

	/**
	 * {@inheritDoc}
	 */
	public void endUsecase(String usecase) {
		logger.log(APP_LOGGER_CLASS_NAME, Level.INFO, "-----End Use Case: "
				+ usecase + " -----", null);

	}

	/**
	 * {@inheritDoc}
	 */
	public void entering(String methodName) {
		logger.log(APP_LOGGER_CLASS_NAME, Level.DEBUG, this
				.getEnterMethodLogStr(methodName, null), null);
	}

	/**
	 * {@inheritDoc}
	 */
	public void entering(String methodName, Object param1) {
		Object[] params = { param1 };

		logger.log(APP_LOGGER_CLASS_NAME, Level.DEBUG, this
				.getEnterMethodLogStr(methodName, params), null);
	}

	/**
	 * {@inheritDoc}
	 */
	public void entering(String methodName, Object param1, Object param2) {
		Object[] params = { param1, param2 };

		logger.log(APP_LOGGER_CLASS_NAME, Level.DEBUG, this
				.getEnterMethodLogStr(methodName, params), null);
	}

	/**
	 * {@inheritDoc}
	 */
	public void entering(String methodName, Object param1, Object param2,
			Object param3) {
		Object[] params = { param1, param2, param3 };

		logger.log(APP_LOGGER_CLASS_NAME, Level.DEBUG, this
				.getEnterMethodLogStr(methodName, params), null);
	}

	/**
	 * {@inheritDoc}
	 */
	public void entering(String methodName, Object[] params) {
		logger.log(APP_LOGGER_CLASS_NAME, Level.DEBUG, this
				.getEnterMethodLogStr(methodName, params), null);

	}

	/**
	 * {@inheritDoc}
	 */
	public void exiting(String methodName) {
		StringBuffer buf = new StringBuffer();
		buf.append(EXIT_PREFIX);
		buf.append(methodName + "(..)");

		logger.log(APP_LOGGER_CLASS_NAME, Level.DEBUG, buf.toString(), null);
	}

	/**
	 * {@inheritDoc}
	 */
	public void exiting(String methodName, Object retVal) {
		StringBuffer buf = new StringBuffer();
		buf.append(EXIT_PREFIX);
		buf.append(methodName + "(..)");
		buf.append(RETURN_PREFIX);
		buf.append("[ ");
		buf.append(retVal);
		buf.append(" ]");

		logger.log(APP_LOGGER_CLASS_NAME, Level.DEBUG, buf.toString(), null);
	}

	/**
	 * Returns the log string for entry of a method.
	 * 
	 * @param methodName
	 *            a string containing the method name as the parameter.
	 * 
	 * @param params
	 *            an array of objects containing the parameters to the method.
	 * 
	 * @return a string to be logged indicating the entry of this method.
	 */
	private String getEnterMethodLogStr(String methodName, Object[] params) {
		StringBuffer buf = new StringBuffer(ENTER_PREFIX);
		buf.append(methodName + "(..)");

		if (params != null) {
			for (int i = 0; i < params.length; i++) {
				if (i > 0 && i != params.length) {
					buf.append(",");
				}

				buf.append(PARAM_PREFIX);
				buf.append(i + 1);
				buf.append(" = [");
				buf.append(params[i]);
				buf.append("]");

			}

		}

		return buf.toString();
	}

	/**
	 * Appends the fragments to the message.
	 * 
	 * @param message
	 *            the initial string.
	 * 
	 * @param fragments
	 *            these will be appended to the message.
	 * 
	 * @return a string containing the complete message.
	 */
	private String append(String message, Object[] fragments) {
		StringBuffer buf = new StringBuffer(message);

		if (fragments != null) {
			for (int i = 0; i < fragments.length; i++) {
				buf.append(fragments[i]);
			}
		}

		return buf.toString();
	}

	/**
	 * Attaches the provided filter to an appender with the given name; if it
	 * could be found.
	 * 
	 * @param appenderName
	 *            the name of the appender.
	 * 
	 * @param filter
	 *            the filter.
	 */
	private static void attachFilter(String appenderName, Filter filter) {
		Appender appender = Logger.getRootLogger().getAppender(appenderName);

		if (appender != null) {
			appender.addFilter(filter);
		}
	}

	/* (non-Javadoc)
	 * @see com.ing.log.AppLog#isDebugOn()
	 */
	public boolean isDebugOn() {
		return logger.isDebugEnabled();

	}

	/* (non-Javadoc)
	 * @see com.ing.log.AppLog#isInfoOn()
	 */
	public boolean isInfoOn() {
		return logger.isInfoEnabled();
	}

	/* (non-Javadoc)
	 * @see com.ing.log.AppLog#fatal(java.lang.Throwable)
	 */
	public void fatal(Throwable cause) {
		logger.log(APP_LOGGER_CLASS_NAME, Level.FATAL, null, cause);

	}
}