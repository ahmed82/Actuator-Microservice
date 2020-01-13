

## Micro-services

to activate Actuator

Add to the application.yml file
###################################
management:
  endpoints:
    web:
      exposure:
        include: '*'
###################################

Get that URL:
http://localhost:8191/actuator/beans

http://localhost:8191/actuator/metrics
http://localhost:8191/actuator/metrics/jvm.memory.max

http://localhost:8191/actuator/threaddump

http://localhost:8191/actuator/heapdump

----
create your end point by using annotation @Endpoint on top of the class name

example
@Endpoint(id="stage")
http://localhost:8191/actuator/stage ///should return empty till you pass your selector 

@ReadOperation // to be use in GET
Identifies a method on an @Endpoint as being a read operation.

@WriteOperation // to be use in POST


@Selector //the name passed after the /actuator/{name}



use rest clint to post to to
http://localhost:8191/actuator/stage/st001
which is the method will have annotation as
@WriteOperation
with Json body
{
	"name":"st001",
	"stage":{"value":100}
}

{
	"name":"st001",
	"stage":100
}
