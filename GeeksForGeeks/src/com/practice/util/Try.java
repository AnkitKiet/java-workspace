package com.practice.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Try {

	public static void main(String[] args) {
		CustomClassLoader customClassLoader = new CustomClassLoader();
		try {
			Class<?> c = customClassLoader.findClass("com.practice.util.IOWorker");
			Object ob=c.newInstance();
			Method method=c.getDeclaredMethod("readFile");
			method.setAccessible(true);
			method.invoke(ob);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | SecurityException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}

	}

}
