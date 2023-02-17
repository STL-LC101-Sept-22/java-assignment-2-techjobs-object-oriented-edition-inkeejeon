package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
//import org.launchcode.techjobs.oo.CoreCompetency;
//import org.launchcode.techjobs.oo.Employer;
//import org.launchcode.techjobs.oo.Location;
//import org.launchcode.techjobs.oo.PositionType;
//
//import org.launchcode.techjobs.oo.Job;
import org.launchcode.techjobs.oo.*;
import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    //  In JobTest, define a test called testSettingJobId. Do not forget to annotate it with @Test.
    @Test
    public void testSettingJobId() {
        //    Create two Job objects using the empty constructor.
        Job jobOne = new Job();
        Job jobTwo = new Job();
        //  Use assertNotEquals to verify that the IDs of the two objects are distinct.
         assertNotEquals(jobOne, jobTwo);
        //   Run the test using the run configuration that you created above.
        //  If the test doesn’t pass, what should be your first thought?
        //  “Drat! I need to fix the unit test.”
        //  “Drat! I need to fix my Job() constructor code.”
    }

  //  In JobTest, define a test called testJobConstructorSetsAllFields.
  @Test
  public void testJobConstructorSetsAllFields() {
      //   Declare and initialize a new Job object with the following data:
      Job testJob =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
      // Use assertTrue and assertEquals statements to test that the constructor correctly assigns both the class and value of each field. Your test should have 5 assert statements of each type.
      assertTrue(testJob.getName() instanceof String);
      assertEquals(testJob.getName(), "Product tester");
      assertTrue(testJob.getEmployer() instanceof Employer);
      assertEquals(testJob.getEmployer(), "ACME");
      assertTrue(testJob.getLocation() instanceof Location);
      assertEquals(testJob.getLocation(), "Desert");
      assertTrue(testJob.getPositionType() instanceof PositionType);
      assertEquals(testJob.getPositionType(), "Quality control");
      assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
      assertEquals(testJob.getCoreCompetency(), "Persistence");
    }
  //  In JobTest, define a test called testJobsForEquality.
    @Test
    public void testJobsForEquality() {
        //  Generate two Job objects that have identical field values EXCEPT for id. Test that equals returns false.
    Job jobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job jobTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertNotEquals(jobOne, jobTwo);
        //assertFalse(jobOne.equals(jobTwo));
    }

  // add a new test named testToStringStartsAndEndsWithNewLine to check the first requirement.
    // Be sure to use assertEquals to verify that these characters are correct, and to use the exact formatting demonstrated above.

    // Requirements
    // 1. When passed a Job object, it should return a string that contains a blank line before and after the job information.
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //TA help
        assertEquals(testJob.toString().charAt(0), '\n');
        assertEquals(testJob.toString().charAt(testJob.toString().length() - 1), '\n');
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJob =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expectedValue =
                "\n" +
                        "ID: " + testJob.getId() +
                        "\nName: " + testJob.getName() +
                        "\nEmployer: " + testJob.getEmployer() +
                        "\nLocation: " + testJob.getLocation() +
                        "\nPosition Type: " + testJob.getPositionType() +
                        "\nCore Competency: " + testJob.getCoreCompetency() +
                        "\n";
        String actualValue = testJob.toString();
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void testToStringHandlesEmptyField() {
        Job testJob =  new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

        assertEquals(testJob.toString(), "\n" +
                "ID: " + testJob.getId() +
                "\nName: Data not available"  +
                "\nEmployer: Data not available"  +
                "\nLocation: Data not available" +
                "\nPosition Type: Data not available" +
                "\nCore Competency: Data not available" +
                "\n");
    }

}
