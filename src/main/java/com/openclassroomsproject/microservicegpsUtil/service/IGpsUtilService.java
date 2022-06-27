package com.openclassroomsproject.microservicegpsUtil.service;

import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import java.util.List;
import java.util.UUID;

/**
 * @author jonathan GOUVEIA
 * @version 1.0
 */
public interface IGpsUtilService {

    List<Attraction> getAttractionList();

    VisitedLocation getUserLocation(UUID userId);
}