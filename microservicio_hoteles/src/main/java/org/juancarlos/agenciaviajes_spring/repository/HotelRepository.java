package org.juancarlos.agenciaviajes_spring.repository;

import org.juancarlos.agenciaviajes_spring.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
