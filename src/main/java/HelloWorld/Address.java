package HelloWorld;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;

/*@Table(name = "profile_details")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })*/
//@Entity
@Data
//@AllArgsConstructor
@Embeddable
public class Address {
	/* @Id */
	/* @OneToOne(cascade = { CascadeType.ALL },fetch = FetchType.LAZY) */
	/*
	 * @Column(name = "firstname") public String firstname;
	 */
	/* @Column(name = "line1") */
	public String line1;
	/* @Column(name = "line2") */
	public String line2;

	/*
	 * DetailsPojo dtpojo;
	 */
	public Address(String Line1, String Line2) {
		this.line1 = Line1;
		this.line2 = Line2;
	}

	/*
	 * public String getfirstname(DetailsPojo dtpojo) {
	 * 
	 * firstname = dtpojo.getFirstname(); return firstname; }
	 */
	/*
	 * public String getLine1() { return line1; }
	 */

	public Address() {
		super();
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	/*
	 * public void callback() { dtpojo.setAddress(line1,line2); }
	 */
	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", line2=" + line2 + "]";
	}

}
