package HelloWorld;

import java.lang.String;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping("/Nhance")
public class HelloWorldController {

	@Autowired
	@Qualifier("profileDetails")
	ProfileDetails profileDetails;

	@RequestMapping("/ProfileTable")
	@GetMapping(value = "/get", headers = "Accept=application/json")
	public List<DetailsPojo> getAllDetailsPojo() {
		List<DetailsPojo> tasks = profileDetails.getDetailsPojo();
		return tasks;
	}

	@RequestMapping("/AddProfile")
	@PostMapping(value = "/post", headers = "Accept=application/json")
	public DetailsPojo AddProfile(@RequestBody DetailsPojo dp) {
		return profileDetails.addNewProfile(dp);
	}

	/*
	 * public @ResponseBody DetailsPojo index(@RequestBody DetailsPojo pojo) {
	 * 
	 * DetailsPojo pojo1 = profileDetails.Display(pojo); return pojo1; }
	 * 
	 */
	@RequestMapping(value = "/get/{firstname}", method = RequestMethod.GET, consumes = "application/json")
	@ResponseBody
	public ResponseEntity<Optional<DetailsPojo>> getByName(@PathVariable("firstname") String firstname) {
		Optional<DetailsPojo> dp = null;
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		headers.add("Responded", "HelloWorldController");

		try {
			dp = profileDetails.getByName(firstname);
		} catch (Exception ex) {
			System.out.println("Employee not found" + ex.getMessage());
			return ResponseEntity.accepted().headers(headers).body(dp);
		}

		return ResponseEntity.ok().headers(headers).body(dp);
	}

	@RequestMapping("/index1")
	public String index1() {
		return "you have come to index1";
	}

	@RequestMapping("/index2")
	public String index2() {
		return "you have come to index2";
	}

	@RequestMapping("/index3")
	public String index3() {
		return "you have come to index3";
	}

	@RequestMapping("/index4")
	public String index4() {
		return "you have come to index4";
	}

}