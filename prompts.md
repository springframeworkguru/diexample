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