package com.deepu.springframework.ioc;

/**
 * Hello world!
 *
 */
public class Sim 
{
    private Service service;

	public void setService(Service service) {
		this.service = service;
	}
    
    public void action() {
    	service.activate();
    }
}
