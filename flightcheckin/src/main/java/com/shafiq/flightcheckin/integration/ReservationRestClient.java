package com.shafiq.flightcheckin.integration;

import com.shafiq.flightcheckin.dto.Reservation;
import com.shafiq.flightcheckin.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Long id);
	
	public Reservation updateReservation(ReservationUpdateRequest request);
}
