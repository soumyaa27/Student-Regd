package HelloWorld;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("profileDetails")
@Transactional
public class ProfileDetaisImpl implements ProfileDetails {

	public String firstname, secondname;
	public Address address;
	@Autowired
	ProfileDetailsRepository profileDetailsRepository;
	/*
	 * public DetailsPojo Display(DetailsPojo pojo) { DetailsPojo detailspojo = new
	 * DetailsPojo();
	 * 
	 * detailspojo.setFirstname("Soumya");
	 * detailspojo.setSecondname("Ranjan Sahoo");
	 * 
	 * detailspojo.setFirstname(pojo.getFirstname());
	 * detailspojo.setSecondname(pojo.getSecondname());
	 * detailspojo.setAddress(pojo.getAddress());
	 * 
	 * 
	 * firstname = detailspojo.getFirstname(); secondname =
	 * detailspojo.getSecondname();
	 * 
	 * return detailspojo; }
	 */

	public List<DetailsPojo> getDetailsPojo() {
		return (List<DetailsPojo>) profileDetailsRepository.findAll();
	}
	   @Override
	    public Optional<DetailsPojo> getByName(String firstname) {
	        return profileDetailsRepository.findById(firstname);
	    }
	    @Override
	    public DetailsPojo addNewProfile(DetailsPojo dp) {
	        return profileDetailsRepository.save(dp);
	    }
	    @Override
	    public DetailsPojo updateProfile(DetailsPojo dp) {
	        return profileDetailsRepository.save(dp);
	    }
	    @Override
	    public void deleteProfileByName(DetailsPojo dp) {
	    	profileDetailsRepository.deleteById(firstname);
	    }
}