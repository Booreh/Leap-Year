# Leap-Year Testing 

#How i uploaded the project and runned github actions.

-Uploaded the project directly to github trough the Intelliji IDE as a repository.
- Made different changes to the pom.xml file. First i added the surefire plugin. So that the tests would run in github actions.
- made a maven.yml file trough github actions, located in the workflow folder.
- Got a few errors with no tests being runned at first.
  I found out that you have to be very careful with the versions you use on junit/junit jupiter. So i had to make a few changes to see what worked and what didn't.
- After this all 4 tests runned succesfully with 0 failures. 


Example of succesfull test:
 Java CI with Maven #3: Commit 8a35241 pushed by Booreh

[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running LeapYear_Test
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.09 s - in LeapYear_Test
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
