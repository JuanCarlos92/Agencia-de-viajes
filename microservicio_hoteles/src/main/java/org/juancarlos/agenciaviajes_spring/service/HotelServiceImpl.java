package org.juancarlos.agenciaviajes_spring.service;

import org.juancarlos.agenciaviajes_spring.entity.Hotel;
import org.juancarlos.agenciaviajes_spring.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public List<Hotel> getHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotel(Long id) {
        return hotelRepository.getById(id);
    }
}
