package com.openclassroomsproject.microservicegpsUtil.controller;

import com.openclassroomsproject.microservicegpsUtil.service.IGpsUtilService;
import com.openclassroomsproject.microservicegpsUtil.utils.CustomRequestLoggingFilter;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.UUID;

/**
 * This is the controller of this microService
 *
 * @author jonathan GOUVEIA
 * @version 1.0
 */
@RestController
public class GpsUtilController extends CustomRequestLoggingFilter {

    @Autowired
    private IGpsUtilService gpsUtilService;

    /**
     * This method provides the list of possible attractions
     *
     * @return A list of attractions
     */
    @GetMapping("/attractions")
    public List<Attraction> getAttractionList() {
        return gpsUtilService.getAttractionList();
    }

    /**
     * This method allow to obtain the current location of a user
     *
     * @param userId The user id
     * @return A VisitedLocation object who contains the user id, the location of the mobile phone or the user's laptop
     * and the actual date. It's a gpsUtil library object
     */
    @GetMapping("/user-location")
    public VisitedLocation getUserLocation(@RequestParam UUID userId) {
        return gpsUtilService.getUserLocation(userId);
    }
}