package dmacc.beans;

import javax.persistence.*;

@Entity
@Table(name = "missions")
public class Mission {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String name;
    private int fromYear;
    private int mannedYear;
    private int thruYear;
    private int flights;
    private String notes;
    
	public Mission() {
		super();
	}

	public Mission(String name, int fromYear, int mannedYear, int thruYear, int flights, String notes) {
		super();
		this.name = name;
		this.fromYear = fromYear;
		this.mannedYear = mannedYear;
		this.thruYear = thruYear;
		this.flights = flights;
		this.notes = notes;
	}

	public Mission(long id, String name, int fromYear, int mannedYear, int thruYear, int flights, String notes) {
		super();
		this.id = id;
		this.name = name;
		this.fromYear = fromYear;
		this.mannedYear = mannedYear;
		this.thruYear = thruYear;
		this.flights = flights;
		this.notes = notes;
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getFromYear() {
		return fromYear;
	}


	public void setFromYear(int fromYear) {
		this.fromYear = fromYear;
	}


	public int getMannedYear() {
		return mannedYear;
	}


	public void setMannedYear(int mannedYear) {
		this.mannedYear = mannedYear;
	}


	public int getThruYear() {
		return thruYear;
	}


	public void setThruYear(int thruYear) {
		this.thruYear = thruYear;
	}


	public int getFlights() {
		return flights;
	}


	public void setFlights(int flights) {
		this.flights = flights;
	}


	public String getNotes() {
		return notes;
	}


	public void setNotes(String notes) {
		this.notes = notes;
	}


	@Override
	public String toString() {
		return "Mission [id=" + id + ", name=" + name + ", fromYear=" + fromYear + ", mannedYear=" + mannedYear
				+ ", thruYear=" + thruYear + ", flights=" + flights + ", notes=" + notes + "]";
	}

    
}
