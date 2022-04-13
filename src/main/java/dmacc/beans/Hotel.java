package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Carson Allbee callbee
 *CIS175 - Fall 2021
 * Apr 11, 2022
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {
	@Id
	@GeneratedValue
	private long id;
	private String hotelName;
	private int roomNumber;
	private boolean occupied;
	private Address hotelAddress;
}
