package com.krishna.patterns.singleton;

import java.io.Serializable;

public class DateUtillEx implements Serializable, Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static volatile DateUtillEx instance;

	// private static DateUtillEx instance = new DateUtillEx();

	/*
	 * static{ instance = new DateUtillEx(); }
	 */

	private DateUtillEx() {

	}

	public static DateUtillEx getInstance() {
		if (instance == null) {
			synchronized (DateUtillEx.class) {

				instance = new DateUtillEx();
			}
		}
		return instance;
	}

	protected Object readResolved() {
		return instance;

	}

	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
