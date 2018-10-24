# Tlazohtlaloni
How not to name your projects...

## How this works
This setup is intended to be a quick guide to getting something up and running quickly in AWS Elastic Beanstalk.  The code folder contains a sample that contains three spring boot projects which allow for a simple setup of a Eureka registry service, a Zuul gateway service, and finally a simple web service that serves static content with an example API thrown in for kicks.

## Running it
If using Intellij IDEA you can use the Spring dashboard which, if you import the gradle file will automatically create the run configurations for all three services.

Otherwise you can run them straight from java as you please, no special flags needed.  Spring boot contains its own Tomcat server so can be run with just a JRE

## Building jars
Remember to not build jars manually if you can avoid it!

This project uses the gradle wrapper so in linux/mac environments run the below command

```sh gradlew bootJar
```

This will run any tests that exists and produce a jar in the build folder of each service

## Explanations of Zuul and Eureka

I highly recommend the Baeldung tutorials on Spring with microservices as a starting point for using Zuul and Eureka : [https://www.baeldung.com/spring-microservices-guide](https://www.baeldung.com/spring-microservices-guide)
