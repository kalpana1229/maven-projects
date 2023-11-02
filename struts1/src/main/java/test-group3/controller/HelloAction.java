/*
 * HelloWorld! test Class 
 *  IMPORTANTE *********************************************
 *  
 *  REMOVE THESE CLASS AND THE DEFAULT USER CREATED FOR TEST!
*/
package test-group3.controller;


import javax.inject.Inject;

import test-group3.business.LoginService;



public class HelloAction extends BaseAction{
	@Inject
	LoginService sv;
	
	public String execute(){
		sv.createFirst();
		return "success";
	}

}
