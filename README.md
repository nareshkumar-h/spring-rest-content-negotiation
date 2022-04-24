# spring-rest-content-negotiation

* Determining what format the user has requested relies on a **ContentNegotationStrategy**. 
* There are default implementations available out of the box, but you can also implement your own if you wish.
* When making a request from frontend via HTTP it is possible to specify what type of response you would like by setting the **Accept** header property.

#### Create REST API
```java
@RestController
public class UserController {

	@GetMapping(
			value = "users",
			//consumes = {"application/json","application/xml"}, 
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
	)
	public List<User> getUsers(){
		User user1 = new User("Naresh");
		User user2 = new User("Siva");
		List<User> users = List.of(user1, user2);
		return users;
	}
}
```

#### Test 1: Get API response as JSON

* http://localhost:8080/users?mediaType=json

```json
[
  {
    "name": "Naresh"
  },
  {
    "name": "Siva"
  }
]
```

#### Test 2: Get API response as XML

* http://localhost:8080/users?mediaType=xml

```xml
<List>
<item>
<name>Naresh</name>
</item>
<item>
<name>Siva</name>
</item>
</List>
```
