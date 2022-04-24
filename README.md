# spring-rest-content-negotiation


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
