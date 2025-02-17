package org.juancarlos.agenciaviajes_spring.repository;

import org.juancarlos.agenciaviajes_spring.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
