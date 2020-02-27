package HelloWorld;

import org.springframework.data.repository.CrudRepository;

public interface ProfileDetailsRepository extends CrudRepository<DetailsPojo, String> {

}
