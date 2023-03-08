# ReadMe

## Background

Brazilian Jiu Jitsu (BJJ) is growing in popularity with academies opening to meet the surging demand. 
BJJ academies enroll students and must track not only their membership but their progression from beginner to increasingly
advanced student. This application provides cloud based data management for academy management. 

## Glossary

- Academy 
- Owner
- Instructor
- Student
- Rank
- Mat Hours
- Proficiency 

## Business Requirements

- As a user I want to be able to enroll a new student at my academy.
- As a user I want to be able to assign a membership type to any student.
- As a user I want to be able to check students into class.
- As a user I want to be able to get total mat hours for any student. 
- As a user I want to be able to view all attributes of a given student. 
- As a user I want to be able to view all students of a given rank.
- As a user I want to be able to update a student's information, including their rank.

## Architecture

### Implementation Notes

### Endpoint Requirements

### Data Model

This section maps out the attributes of our table. 

The audience for this project is small jiu-jitsu academy owners who will likely only be managing databases of students in the scale of hundreds. 
For this reason, when considering how to structure the DynamoDB table, I accepted the possibility of having to pull more data etc etc. 

```
students

memberId // partion key, number
firstName // string
lastName // string
matTime // map
rank // string
membership // string
notes // stringSet
memberSince // string
isActive // boolean

FirstAndLastName (Global secondary index) -> a way to query by last name and first name

lastName // primary key, string
firstName // sort key, string
memberId // number

memberships 

memberId // partition key, number
membershipType // string
isActive // boolean
isPaused // boolean
membershipLength // ZonedDateTime
paymentMethod: string



```





### Class Diagram

### Sequence Diagrams
