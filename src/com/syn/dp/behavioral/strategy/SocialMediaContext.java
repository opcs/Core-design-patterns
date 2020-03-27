package com.syn.dp.behavioral.strategy;

public class SocialMediaContext {
	ISocialMediaStrategy smStrategy;

	public void setSocialmediaStrategy(ISocialMediaStrategy smStrategy) {
		this.smStrategy = smStrategy;
	}

	public void connect(String name) {
		smStrategy.connectTo(name);
	}
}
