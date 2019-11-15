package com.xm4399.log4j2;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LOGGER {
	public static Logger logger = LoggerFactory.getLogger(LOGGER.class);


	public static Logger FILE_OUT = LoggerFactory.getLogger("fileOut");
	public static Logger CONSOLE = LoggerFactory.getLogger("Console");


}
