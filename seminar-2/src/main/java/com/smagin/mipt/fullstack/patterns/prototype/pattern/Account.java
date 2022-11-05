package com.smagin.mipt.fullstack.patterns.prototype.pattern;


public abstract class Account implements Cloneable{
	abstract public void accountType();
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
