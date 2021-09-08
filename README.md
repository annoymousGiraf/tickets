# tickets
[![Build-CI](https://github.com/annoymousGiraf/tickets/actions/workflows/gradle.yml/badge.svg)](https://github.com/annoymousGiraf/tickets/actions/workflows/gradle.yml)
#### Table of Contents
1. [Run And Build](#runAndBuild)
2. [Further Work](#further)
3. [Basic Diagram](#diagram)
4. [Assumptions](#assumptions)  

The idea behind the solution is to be lean and elegant, easy to change as we are
in the software industry requirements are chaining fast and we need to be able to adjust fast.
for example the task requires to support local json files, but with some addition we can add support for remote db in fact if you pass 2 
urls as Args it will try to resolve it (without success at the moment). most of the types are generic as it can be to support multiple implementations such as the use
of Collection rather then just List. the use of Data Classes eases the movement and storage of the parsed data. Extension function is used to
have a syntactic sugar approach. also because this is interactive CLI the use of Errors over Exceptions is heavily used.

Coroutine was used to demonstrate faster searching in parallel with less overhead.

most of the trade off done is prework is to flaten the structure and map as much as needed the heavy search parts.

<a name="runAndBuild"/>

### Local Env And Building

* Using `Docker` and `docker-compose`
    * `docker-compose run build`
    * `docker-compose build release`
    * `docker run -it tickets:latest ["remote ticket url", "remote users url"] `

also in ops directory there is a script to automate all the steps

* Using docker with automate sample run
    * `./dev-env/build-and-run-sample-with-docker.sh

* Using Java
    * ./gradlew test
    * ./gradlew jar
    * java -jar build/libs/tickets-1.0.jar

* using intelij or any other IDE
    * simply load the project

<a name="further"/>   

### Further Work
in order to not over engineering the task i avoided demonstrated possible features such as
1. enabling date search by range
2. assumed some inputs are in strict format
3. copied the file locally in the same directory
4. adding test coverage tool.
5. Improve basic logger.
6. ArgParser could be utilized
7. Hashing and having a sort of mapping for each ticket
8. Capture user last searches as a cache to improve run time of last search
9. everything is memory such that we trade off memory usage to give better run time
10. security measures  


<a name="diagram"/>

### Basic Diagram

```dtd
                                             +-------------------------+
+--------------+   +---------------+         |                         |
|              |   |               |         |  CLI Aplication         |
|   userService|   | TicketService |         |                         |
|              |   |               |         |                         |
+---------^----+   +---------------+         +-----------+-------------+
          |              ^                               |
          |              |                               |
          |              |                               |
          |              |                               |
    +-----+--------------+---+                           v
    |                        |              +--------------------------+
    |                        |              |                          |
    |  Seacrh Data Store     |<-------------+   DataStore Factory      |
    |                        |              |                          |
    |                        |              |    +----------------+    |
    +------------------------+              |    |                |    |
                                            +----+-+-File+Reader+-+----+
                                                 | |            | |
                                                 +-+------------+-+ +-----------------------+
                           +-----------------+     |            |   |                       |
                           |                 |<----+            +-> |   JsonTicketDataStore |
                           |JsonUserDataStore|                      |                       |
                           |                 |                      |                       |
                           |                 |                      +-----------------------+
                           +-----------------+
```

<a name="assumptions"/>

### Assumptions

1. only json files given are supported locally
2. no remote storage
3. basic user interaction
4. In Tags and Subject we can ignore case e.g Ohio == ohio