# jersey2-spring-seed-project
[![Build Status](https://travis-ci.org/julesbond007/jersey2-spring-seed-project.svg?branch=master)](https://travis-ci.org/julesbond007/jersey2-spring-seed-project)
[![Coverage Status](https://coveralls.io/repos/julesbond007/jersey2-spring-seed-project/badge.svg?branch=master&service=github)](https://coveralls.io/github/julesbond007/jersey2-spring-seed-project?branch=master) 

Seed project to create REST API using Jersey2 and Spring Framework for dependency injection.  

- Spring beans and dependencies are configured using annotations.
- Database access is provided by spring data/jpa/hibernate
- Gradle as build management
- Testng with hsqldb for unit testing.

This also comes with a gradle task to aggregate unit test coverage from subprojects: `gradle jacocoRootReport`

#full tech stack
- Java
- Jersey 2.22.1
- Spring 4.2.2
- Spring Data/JPA 1.9.0
- PostGreSQL 9.4.5
- Gradle 2.2.1
- TestNG 6.8.8
- HSQLDB 2.3.3

#setup
The goal of this project is to make it super easy to create a restful application using Jersey2 and Spring
- Rename subprojects `project-*` with 'yourproject name' i.e: 'project-api' --> 'fantastic-api'
- Rename the default package from  `com.project` to `com.your-comany`
- Update `gradle.settings` with new project names
- Update `web.xml` with new package names
