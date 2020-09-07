package org.activiti;

import org.activiti.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController
public class HotelProcessRestController {

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private HotelListingRepository hotelListingRepository;

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/new-listing-process", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void startHireProcess(@RequestBody Map<String, String> data) {

        HotelListing hotelListing = new HotelListing(data.get("name"), data.get("email"), data.get("phoneNumber"),
        		                            data.get("noOfRooms"),data.get("sizeOfRooms"),data.get("noOfPerson"));
        hotelListingRepository.save(hotelListing);

        Map<String, Object> vars = Collections.<String, Object>singletonMap("hotelListing", hotelListing);
        runtimeService.startProcessInstanceByKey("listingStateWorkFlow", vars);
        //runtimeService.startProcessInstanceByKey("hmcworkflow", vars);

        
    }

}