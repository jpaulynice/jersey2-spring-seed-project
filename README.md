# jersey2-spring-seed-project
[![Build Status](https://travis-ci.org/julesbond007/jersey2-spring-seed-project.svg?branch=master)](https://travis-ci.org/julesbond007/jersey2-spring-seed-project)
[![Coverage Status](https://coveralls.io/repos/julesbond007/jersey2-spring-seed-project/badge.svg?branch=master&service=github)](https://coveralls.io/github/julesbond007/jersey2-spring-seed-project?branch=master) 

Seed project to create REST API using Jersey2 and Spring Framework.  This project uses spring annotations to configure spring beans and dependencies, spring data/jpa/hibernate for database entities, gradle as build management, and testng with hsqldb for unit testing.

This also comes with a gradle task to create unit test coverage for each subproject when gradle build or test is invoked.

#tech stack
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
- Find 'project-' and replace with 'yourproject name' i.e: 'project-api' --> 'fantastic-api'
- Find 'com.project' and replace with 'com.your-comany' i.e: 'com.project' --> 'com.fantastic.company'
