package org.juancarlos.agenciaviajes_spring.service;

import org.juancarlos.agenciaviajes_spring.entity.Hotel;

import java.util.List;

public interface HotelService {
    List<Hotel> getHotels();
    Hotel getHotel(Long id);
}
