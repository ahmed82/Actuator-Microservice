# Actuator-Microservice
Actuator on Spring Boot activated and Custom endpoint 

```java
@Component
@Endpoint(id="stage")
public class StageEndpoint {
	
	Map<String, Stage> stages = new ConcurrentHashMap<>();
	
	@ReadOperation
	public Map<String,Stage> getAllStages(){
		return stages;
	}
	
	@ReadOperation
	public Stage getStage(@Selector String name){
		return stages.get(name);
	}
	
	@WriteOperation
	public void setValue(@Selector String name,int stage){
		stages.put(name, new Stage (stage));
	}
	

	static class Stage{
		int value;

		public Stage(int value) {
			super();
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
		
		
	}//Stage-end

}//StageEndpoint-
```
