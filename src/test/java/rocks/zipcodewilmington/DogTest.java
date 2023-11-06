package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setDogNameTest() {

        //Given a Dog with a name, and the name to change to
        Dog testDog = new Dog("Bob", new Date(), 2);
        String nameTest = "Tom";

        //When the method is called to change the name,
        testDog.setName(nameTest);

        //Then check that Dog name is the name to change
        String nameActual = testDog.getName();
        Assert.assertEquals(nameTest, nameActual);
    }


    @Test
    public void setDogNameTest2() {

        //Given a Dog with a name, and the name to change to
        Dog testDog = new Dog("John", new Date(), 3);
        String nameTest = "Garfella";

        //When the method is called to change the name,
        testDog.setName(nameTest);

        //Then check that Dog name is the name to change
        String nameActual = testDog.getName();
        Assert.assertEquals(nameTest, nameActual);

    }

    // Trying test variation, but seems like its just redundant
    @Test
    public void setDogNameTest3() {

        //Given a Dog with a name, and the name to change to
        Dog testDog = new Dog("John", new Date(), 3);

        //When the method is called to change the name
        testDog.setName("Rodger");

        //Then check that Dog name is no longer original name
        String nameActual = testDog.getName();
        Assert.assertTrue(nameActual != "John");

    }

    // TODO - Create tests for `speak`
    @Test
    public void speakDogTest() {

        //Given a Dog and expected speech string
        Dog testDog = new Dog("Bob", new Date(), 2);
        String speakExpected = "bark!";

        //When the method is called to speak,
        String speakActual = testDog.speak();

        //Then check that speak string is expected
        Assert.assertEquals(speakExpected, speakActual);

    }

    // Test variation, Dog speech should not match a non-speak string
    @Test
    public void speakDogTest2() {

        //Given a Dog and expected speech string
        Dog testDog = new Dog("Molly", new Date(), 4);
        String speakNotExpected = "I'm a human, not a Dog";

        //When the method is called to speak,
        String speakActual = testDog.speak();

        //Then check that speak string is expected
        Assert.assertFalse(speakNotExpected.equals(speakActual));

    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setDogBirthdateTest() {

        //Given a Dog and expected speech string
        Dog testDog = new Dog("Bob", new Date(2021, 4, 13 ), 2);
        Date testDate = new Date(2020, 3, 25);

        //When the method is called to set birthdate
        testDog.setBirthDate(testDate);

        //Then check that speak string is expected
        Date actualDate = testDog.getBirthDate();
        Assert.assertEquals(testDate, actualDate);

    }

    @Test
    public void getDogBirthdateTest() {

        //Given a Dog and expected speech string
        Dog testDog = new Dog("Bob", new Date(1946, 9, 5 ), 2);
        Date testDate = new Date(1946, 9, 5);

        //When the method is called to set birthdate
        Date actualDate = testDog.getBirthDate();

        //Then check that speak string is expected
        Assert.assertEquals(testDate, actualDate);

    }

    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void eatDogFoodTest() {

        //Given a Dog and expected speech string
        Dog testDog = new Dog("Bob", new Date(2021, 4, 13 ), 2);
        Integer expMealsEaten = 1;
        Food testFood = new Food();

        //When the method is called to set birthdate
        testDog.eat(testFood);

        //Then check that speak string is expected
        Integer actMealsEaten = testDog.getNumberOfMealsEaten();
        Assert.assertEquals(expMealsEaten, actMealsEaten);

    }

    @Test
    public void eatDogFoodTest2() {

        //Given a Dog and expected speech string
        Dog testDog = new Dog("Bob", new Date(2021, 4, 13 ), 2);
        Integer expMealsEaten = 10;
        Food testFood = new Food();

        //When the method is called to set birthdate
        for (int i = 0; i < 10; i++) {
            testDog.eat(testFood);
        }

        //Then check that speak string is expected
        Integer actMealsEaten = testDog.getNumberOfMealsEaten();
        Assert.assertEquals(expMealsEaten, actMealsEaten);

    }


    // TODO - Create tests for `Integer getId()`
    @Test
    public void getDogIdTest() {

        //Given a Dog and expected id
        Dog testDog = new Dog("Bob", new Date(2021, 4, 13 ), 2);
        Integer expId = 2;

        //When the method is called to get the id
        Integer actId = testDog.getId();

        //Then check that expected and actual ids match
        Assert.assertEquals(expId, actId);
    }

    @Test
    public void getDogIdTest2() {

        //Given a Dog and expected id
        Dog testDog = new Dog("Jojo", new Date(2022, 7, 28 ), 5);
        Integer expId = 5;

        //When the method is called to get the id
        Integer actId = testDog.getId();

        //Then check that expected and actual ids match
        Assert.assertEquals(expId, actId);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void checkDogAnimalInheritanceTest() {

        //Given a Dog and expected id
        Dog testDog = new Dog("Jojo", new Date(2018, 7, 28 ), 5);
        Boolean expInstOf = true;

        //When the method is called to get the id
        Boolean actInstOf = (testDog instanceof Animal);

        //Then check that expected and actual ids match
        Assert.assertEquals(expInstOf, actInstOf);

    }


    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void checkDogMammalInheritanceTest() {

        //Given a Dog and expected id
        Dog testDog = new Dog("Bully", new Date(2008, 6, 22 ), 9);
        Boolean expInstOf = true;

        //When the method is called to get the id
        Boolean actInstOf = (testDog instanceof Mammal);

        //Then check that expected and actual ids match
        Assert.assertEquals(expInstOf, actInstOf);

    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
