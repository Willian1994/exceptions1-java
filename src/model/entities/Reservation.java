package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	private Integer roomNumber;
	private Date checkIn;
	private Date chekOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	public Reservation(Integer roomNumber, Date checkKin, Date chekOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkKin;
		this.chekOut = chekOut;
	}


	public Integer getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}


	public Date getCheckKin() {
		return checkIn;
	}

	
	public Date getChekOut() {
		return chekOut;
	}

	public long duration() {
		long diff = chekOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkIn, Date checkOut) {
		this.checkIn = checkIn;
		this.chekOut = chekOut;
	}
	
	@Override
	public String toString() {
		return "Room"
				+ roomNumber
				+ ", check-in"
				+ sdf.format((checkIn)
				+ ", check-out: "	
				+ sdf.format(chekOut)
				+ ", "
				+ duration()
				+ "nights";
	}
}
