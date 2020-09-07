package org.activiti;


import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class HotelListingService implements JavaDelegate {

    public void storeNewListing() {
        System.out.println("Storing and Saving New Hotel Listing ...");
    }

     
    public String HVMIactive(String name) {
    	
        System.out.println("HMC Details ..."+name);

    	return name.toUpperCase();
    }
    
    public String demoFlow(String name) {
    	
    	System.out.println("DEMO Flow");
    	return name.toUpperCase();
    }

 
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		 
		execution.setVariable("response", HVMIactive("This value from component service"));

	}
}
