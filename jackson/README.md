```
mvn package
mvn exec:java
```
Uses the mainClass as declared in the pom (based on exec-maven-plugin)


	// Convert object to JSON string and pretty print
	String prettyJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
	

## Interesting links

https://github.com/FasterXML/jackson

http://www.mkyong.com/java/jackson-2-convert-java-object-to-from-json/

Custom serializer
https://github.com/FasterXML/jackson-docs/wiki/JacksonHowToCustomSerializers