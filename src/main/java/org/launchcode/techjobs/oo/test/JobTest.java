package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.CoreCompetency;

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
      asserEquals(testJob.getName(), "Product tester");
      assertTrue(testJob.getEmployer() instanceof Employer);
      asserEquals(testJob.getEmployer(), "ACME");
      assertTrue(testJob.getLocation() instanceof Location);
      asserEquals(testJob.getLocation(), "Desert");
      assertTrue(testJob.getPositionType() instanceof PositionType);
      asserEquals(testJob.getPositionType(), "Quality control");
      assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
      asserEquals(testJob.getCoreCompetency(), "Persistence");
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





}
