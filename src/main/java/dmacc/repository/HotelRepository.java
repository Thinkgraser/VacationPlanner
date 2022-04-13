package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long>{

}
