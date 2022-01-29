package com.mboard.controller;

public class ActionFactory {
	private ActionFactory() {}
	private static ActionFactory ist = new ActionFactory();
	public static ActionFactory getInstance() { return ist;}
	
	public Action getAction(String command) {
		Action ac = null;
		
		if( command.equals("main")) ac = new MainAction();
		//else if( command.equals("login") ) ac = new LoginAction();
		return ac;
	}
}
