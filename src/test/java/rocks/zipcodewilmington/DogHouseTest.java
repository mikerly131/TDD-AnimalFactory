package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog Dog)`
    @Test
    public void addDogTest() {

        //Given a Dog with an id
        Dog newDog = new Dog("Gary", new Date(), 0);

        //When the method is called to add the Dog to the Dog house
        DogHouse.add(newDog);

        //Then check that the Dog retrieved by id is the Dog added to the Dog house
        Dog testDog = DogHouse.getDogById(0);
        Assert.assertEquals(testDog, newDog);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeDogByIdTest() {

        //Given a Dog in a Dog hosue with an id
        Dog newDog = new Dog("Gary", new Date(), 5);
        DogHouse.add(newDog);

        //When the method is called to remove the Dog
        DogHouse.remove(5);

        //Then check that getting the Dog by id returns null
        Dog testDog = DogHouse.getDogById(5);
        Assert.assertNull(testDog);
    }

    // TODO - Create tests for `void remove(Dog Dog)`
    @Test
    public void removeDogByDogTest() {

        //Given a Dog in a Dog hosue with an id
        Dog newDog = new Dog("Gary", new Date(), 5);
        DogHouse.add(newDog);

        //When the method is called to remove the Dog using its variable name
        DogHouse.remove(newDog);

        //Then check that getting the Dog by id returns null
        Dog testDog = DogHouse.getDogById(5);
        Assert.assertNull(testDog);
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest() {

        //Given a Dog in a Dog hosue with an id
        Dog newDog = new Dog("Popo", new Date(), 23);
        DogHouse.add(newDog);

        //When the method is called to remove the Dog
        Dog testDog = DogHouse.getDogById(23);

        //Then check that getting the Dog by id returns null
        Assert.assertEquals(testDog, newDog);
    }

    // returning null when we want test
    @Test
    public void getDogByIdTest2() {

        //Given a Dog in a Dog house with an id
        Dog newDog = new Dog("Popo", new Date(), 23);
        DogHouse.add(newDog);

        //When the method is called to get the Dog by id
        Dog testDog = DogHouse.getDogById(20);

        //Then check that getting the Dog by non existent returns null
        Assert.assertNull(testDog);
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getDogsInDogHouseTest() {

        //Given a Dog in a Dog house with an id
        Dog newDog1 = new Dog("Popo", new Date(), 33);
        Dog newDog2 = new Dog("Popo2", new Date(), 34);
        Dog newDog3 = new Dog("Popo3", new Date(), 35);
        Dog newDog4 = new Dog("Popo4", new Date(), 36);
        DogHouse.clear();
        DogHouse.add(newDog1);
        DogHouse.add(newDog2);
        DogHouse.add(newDog3);
        DogHouse.add(newDog4);
        Integer expCount = 4;

        //When the method is called to get the Dog by id
        Integer actCount = DogHouse.getNumberOfDogs();

        //Then check that getting the Dog by non existent returns null
        Assert.assertEquals(expCount, actCount);
    }


    @Test
    public void getDogsInDogHouseTest2() {

        //Given a Dog in a Dog house with an id
        Dog newDog1 = new Dog("Coco", new Date(), 40);
        Dog newDog2 = new Dog("Coco2", new Date(), 41);
        Dog newDog3 = new Dog("Coco3", new Date(), 42);
        DogHouse.clear();
        DogHouse.add(newDog1);
        DogHouse.add(newDog2);
        DogHouse.add(newDog3);
        Integer expCount = 3;

        //When the method is called to get the Dog by id
        Integer actCount = DogHouse.getNumberOfDogs();

        //Then check that getting the Dog by non existent returns null
        Assert.assertEquals(expCount, actCount);


    }
}
