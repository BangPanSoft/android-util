package io.freefair.android.util.logging;

/**
 * Created by larsgrefer on 06.11.15.
 */
public class ClassLogger extends BaseLogger {

	ClassLogger(Class<?> clazz) {
		super(clazz.getSimpleName());
	}

}