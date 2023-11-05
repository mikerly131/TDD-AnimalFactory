package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest() {

        //Given a cat with a name, and the name to change to
        Cat testCat = new Cat("Bob", new Date(), 2);
        String nameTest = "Tom";

        //When the method is called to change the name,
        testCat.setName(nameTest);

        //Then check that Cat name is the name to change
        String nameActual = testCat.getName();
        Assert.assertEquals(nameTest, nameActual);
    }


    @Test
    public void setNameTest2() {

        //Given a cat with a name, and the name to change to
        Cat testCat = new Cat("John", new Date(), 3);
        String nameTest = "Garfella";

        //When the method is called to change the name,
        testCat.setName(nameTest);

        //Then check that Cat name is the name to change
        String nameActual = testCat.getName();
        Assert.assertEquals(nameTest, nameActual);

    }

    // Trying test variation, but seems like its just redundant
    @Test
    public void setNameTest3() {

        //Given a cat with a name, and the name to change to
        Cat testCat = new Cat("John", new Date(), 3);

        //When the method is called to change the name
        testCat.setName("Rodger");

        //Then check that Cat name is no longer original name
        String nameActual = testCat.getName();
        Assert.assertTrue(nameActual != "John");

    }

    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {

        //Given a cat and expected speech string
        Cat testCat = new Cat("Bob", new Date(), 2);
        String speakExpected = "meow!";

        //When the method is called to speak,
        String speakActual = testCat.speak();

        //Then check that speak string is expected
        Assert.assertEquals(speakExpected, speakActual);

    }

   // Test variation, cat speech should not match a non-speak string
    @Test
    public void speakTest2() {

        //Given a cat and expected speech string
        Cat testCat = new Cat("Molly", new Date(), 4);
        String speakNotExpected = "I'm a human, not a cat";

        //When the method is called to speak,
        String speakActual = testCat.speak();

        //Then check that speak string is expected
        Assert.assertFalse(speakNotExpected.equals(speakActual));

    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthdateTest() {

        //Given a cat and expected speech string
        Cat testCat = new Cat("Bob", new Date(2021, 4, 13 ), 2);
        Date testDate = new Date(2020, 3, 25);

        //When the method is called to set birthdate
        testCat.setBirthDate(testDate);

        //Then check that speak string is expected
        Date actualDate = testCat.getBirthDate();
        Assert.assertEquals(testDate, actualDate);

    }

    @Test
    public void getBirthdateTest() {

        //Given a cat and expected speech string
        Cat testCat = new Cat("Bob", new Date(1946, 9, 5 ), 2);
        Date testDate = new Date(1946, 9, 5);

        //When the method is called to set birthdate
        Date actualDate = testCat.getBirthDate();

        //Then check that speak string is expected
        Assert.assertEquals(testDate, actualDate);

    }

    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void eatFoodTest() {

        //Given a cat and expected speech string
        Cat testCat = new Cat("Bob", new Date(2021, 4, 13 ), 2);
        Integer expMealsEaten = 1;
        Food testFood = new Food();

        //When the method is called to set birthdate
        testCat.eat(testFood);

        //Then check that speak string is expected
        Integer actMealsEaten = testCat.getNumberOfMealsEaten();
        Assert.assertEquals(expMealsEaten, actMealsEaten);

    }

    @Test
    public void eatFoodTest2() {

        //Given a cat and expected speech string
        Cat testCat = new Cat("Bob", new Date(2021, 4, 13 ), 2);
        Integer expMealsEaten = 10;
        Food testFood = new Food();

        //When the method is called to set birthdate
        for (int i = 0; i < 10; i++) {
            testCat.eat(testFood);
        }

        //Then check that speak string is expected
        Integer actMealsEaten = testCat.getNumberOfMealsEaten();
        Assert.assertEquals(expMealsEaten, actMealsEaten);

    }


    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
