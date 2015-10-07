package com.cpl.factory_easy;

public abstract class AbstarctHumanFactory {
	public abstract <T extends IHuman> T createHuman(Class<T> c);
}
