package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addCatTest() {

        //Given a cat with an id
        Cat newCat = new Cat("Gary", new Date(), 0);

        //When the method is called to add the cat to the cat house
        CatHouse.add(newCat);

        //Then check that the cat retrieved by id is the cat added to the cat house
        Cat testCat = CatHouse.getCatById(0);
        Assert.assertEquals(testCat, newCat);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeCatByIdTest() {

        //Given a cat in a cat hosue with an id
        Cat newCat = new Cat("Gary", new Date(), 5);
        CatHouse.add(newCat);

        //When the method is called to remove the cat
        CatHouse.remove(5);

        //Then check that getting the cat by id returns null
        Cat testCat = CatHouse.getCatById(5);
        Assert.assertNull(testCat);
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatByCatTest() {

        //Given a cat in a cat hosue with an id
        Cat newCat = new Cat("Gary", new Date(), 5);
        CatHouse.add(newCat);

        //When the method is called to remove the cat using its variable name
        CatHouse.remove(newCat);

        //Then check that getting the cat by id returns null
        Cat testCat = CatHouse.getCatById(5);
        Assert.assertNull(testCat);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest() {

        //Given a cat in a cat hosue with an id
        Cat newCat = new Cat("Popo", new Date(), 23);
        CatHouse.clear();
        CatHouse.add(newCat);

        //When the method is called to remove the cat
        Cat testCat = CatHouse.getCatById(23);

        //Then check that getting the cat by id returns null
        Assert.assertEquals(testCat, newCat);
    }

    // returning null when we want test
    @Test
    public void getCatByIdTest2() {

        //Given a cat in a cat house with an id
        Cat newCat = new Cat("Popo", new Date(), 23);
        CatHouse.add(newCat);

        //When the method is called to get the cat by id
        Cat testCat = CatHouse.getCatById(20);

        //Then check that getting the cat by non existent returns null
        Assert.assertNull(testCat);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getCatsInCatHouseTest() {

        //Given a cat in a cat house with an id
        Cat newCat1 = new Cat("Popo", new Date(), 33);
        Cat newCat2 = new Cat("Popo2", new Date(), 34);
        Cat newCat3 = new Cat("Popo3", new Date(), 35);
        Cat newCat4 = new Cat("Popo4", new Date(), 36);
        CatHouse.clear();
        CatHouse.add(newCat1);
        CatHouse.add(newCat2);
        CatHouse.add(newCat3);
        CatHouse.add(newCat4);
        Integer expCount = 4;

        //When the method is called to get the cat by id
        Integer actCount = CatHouse.getNumberOfCats();

        //Then check that getting the cat by non existent returns null
        Assert.assertEquals(expCount, actCount);
    }


    @Test
    public void getCatsInCatHouseTest2() {

        //Given a cat in a cat house with an id
        Cat newCat1 = new Cat("Coco", new Date(), 40);
        Cat newCat2 = new Cat("Coco2", new Date(), 41);
        Cat newCat3 = new Cat("Coco3", new Date(), 42);
        CatHouse.clear();
        CatHouse.add(newCat1);
        CatHouse.add(newCat2);
        CatHouse.add(newCat3);
        Integer expCount = 3;

        //When the method is called to get the cat by id
        Integer actCount = CatHouse.getNumberOfCats();

        //Then check that getting the cat by non existent returns null
        Assert.assertEquals(expCount, actCount);
    }
}
