package HelloWorld;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;

@Table(name = "profile_details")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Entity

@Data

@AllArgsConstructor

public class DetailsPojo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	public int id;
	
	@Column(name = "firstname")
	public String firstname;
	@Column(name = "secondname")
	public String secondname;
	/* private List<Address> address; */

//	  @OneToOne(mappedBy = "index", cascade = CascadeType.ALL, orphanRemoval =
//	  true)
	@Embedded
	public Address address;

	/*
	 * public DetailsPojo() { super(); }
	 */

	public DetailsPojo(/* String firstname, String secondname, Address address */) {
		/*
		 * super(); this.firstname = firstname; this.secondname = secondname;
		 * this.address = address;
		 */
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSecondname() {
		return secondname;
	}

	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "DetailsPojo [firstname=" + firstname + ", secondname=" + secondname + ", address=" + address + "]";
	}

}
   