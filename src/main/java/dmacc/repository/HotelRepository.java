package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Hotel;
/**
 * @author Carson Allbee callbee
 *CIS175 - Fall 2021
 * Apr 12, 2022
 */

public interface HotelRepository extends JpaRepository<Hotel, Long>{

}
