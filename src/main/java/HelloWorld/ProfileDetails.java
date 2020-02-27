package HelloWorld;

import java.util.List;
import java.util.Optional;

public interface ProfileDetails {
	public List<DetailsPojo> getDetailsPojo();

	Optional<DetailsPojo> getByName(String firstname);

	DetailsPojo addNewProfile(DetailsPojo dp);

	DetailsPojo updateProfile(DetailsPojo dp);

	void deleteProfileByName(DetailsPojo dp);

}
 