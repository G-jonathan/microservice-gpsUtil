package com.openclassroomsproject.microservicegpsUtil.service.impl;

import com.openclassroomsproject.microservicegpsUtil.service.IGpsUtilService;
import gpsUtil.location.Attraction;
import gpsUtil.GpsUtil;
import gpsUtil.location.VisitedLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

/**
 * This class contains the methods allowing to call the functions of the GpsUtil library
 *
 * @author jonathan GOUVEIA
 * @version 1.0
 */
@Service
public class GpsUtilServiceImpl implements IGpsUtilService {

    private static final Logger LOGGER = LoggerFactory.getLogger(GpsUtilServiceImpl.class);
    private final GpsUtil gpsUtil;

    /**
     * Constructor
     *
     * @param gpsUtil The library used by the methods of this class
     */
    public GpsUtilServiceImpl(GpsUtil gpsUtil) {
        this.gpsUtil = gpsUtil;
    }

    /**
     * This method retrieves the list of all available attractions
     *
     * @return A list of Attraction object from the gpsUtil library
     */
    @Override
    public List<Attraction> getAttractionList() {
        LOGGER.info("#[MS-GpsUtil]-> Call - SERVICE: getAttractionList() method ");
        return gpsUtil.getAttractions();
    }

    /**
     * This method allows to retrieve an object containing the current location of a user
     *
     * @param userId The user id
     * @return A VisitedLocation object who contains the user id, the location of the mobile phone or the user's laptop
     * and the actual date. It's a gpsUtil library object
     */
    @Override
    public VisitedLocation getUserLocation(UUID userId) {
        LOGGER.info("#[MS-GpsUtil]-> Call - SERVICE: getUserLocation(UUID userId) method ");
        return gpsUtil.getUserLocation(userId);
    }
}