# Lesson: Introduction to JetBrains AI
## JetBrains AI
What are active Profiles in Spring Boot? Explain the use cases for Active Profiles. Provide examples for
using different databases, and docker deployments. Explain how profile specific properties are set.

# Lesson: Using Spring Boot Active Profiles With Junie
## Junie
In the package `guru.springframework.diexample.database`, examine the class `DiDataStore`. Based on this class
create a new class called `SpanishDiDataStore` which returns "hello world" in Spanish. Annotate the new class
with the profile of "spanish". Update the class `DiDataStore` with the profile not equal to "spanish".

Add a unit test to verify the controller DiController returns "hello world" in Spanish when the "spanish" profile is
active. Use a SpringBootTest, do not use mocks for this test.

# Assignment: Create New Profile
## Junie
In the package `guru.springframework.diexample.database`, examine the class `DiDataStore`. Based on this class
create a new class called `PolishDiDataStore` which returns "hello world" in Polish. Annotate the new class
with the profile of "polish". Update the class `DiDataStore` and add the profile not equal to "polish".

Add a unit test to verify the controller DiController returns "hello world" in Polish when the "polish" profile is
active. Use a SpringBootTest, do not use mocks for this test.

# Lesson: Using Primary Beans and Qualifiers
# Junie:
Your goal is to implement an example of using Spring's `@Primary` and `@Qualifier` annotations to manage dependency
injection ambiguity. Complete the following tasks:

In the package `guru.springframework.diexample.service` to the following:
1. Add a new interface called `MessageService`. The interface will have one method sendMessage accepting a String
   property called message.
2. Create an implementation of `MessageService` called `EmailService`, the sendMessage method will output to the
   console "Sending email: " + message value. Mark this class as the primary component, with the bean name of "emailService".
3. Create an implementation of `MessageService` called `SmsService`, the sendMessage method will output to the
   console "Sending SMS: " + message value. Mark this class as a component, with the bean name of "smsService".
4. In the implementation DiServiceImpl add two private final properties for MessageService called emailService and
   smsService. Update the constructor and use qualifiers to properly inject the beans. When the getGreeting method is
   called, use the emailService bean to send the message to email, and use the smsService to send the message to sms.
5. Create a new test to test the services are called. Use Mockito a mockito mock for the Repo dependency. Use mockito
   spies to verify the email and sms services are called.










