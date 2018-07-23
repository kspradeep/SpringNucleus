package com.thbs.mis.log;

import java.util.HashMap;

public final class LogFactory {
	/** 
	 * Cache of loggers.
	 */
	private static final HashMap M_LOG_INSTANCES = new HashMap();

	/**
	 * Default Constructor
	 */
	private LogFactory() {
	}

	/**  
	 * Gets the instance of logger which is associated with the given
	 *  class. 
	 * <p>
	 * This method searches its cache for the logger instance
	 * with the given class name. 
	 * <p>
	 * If an instance of the logger is not found
	 * in the cache, then a new instance of logger
	 * is created and returned.
	 *
	 * @param clss a <code>Class</code> object interested
	 *              in using the logger.
	 * 
	 * @return an implementation of <code>AppLog</code>
	 * 
	 */
	public static AppLog getLog(Class clss) {
		System.out.println("in getLog -->> "+M_LOG_INSTANCES.entrySet());
		String name = clss.getName();

		AppLog log = (AppLog) M_LOG_INSTANCES.get(name);

		if (log == null) {
			synchronized (LogFactory.class) {
				log = new AppLogger(clss);

				M_LOG_INSTANCES.put(name, log);
			}
		}
		return log;
	}
}