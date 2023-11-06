package rocks.zipcodewilmington;

import com.thoughtworks.qdox.library.JavaClassContext;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {

    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`

    @Test
    public void createDogNameTest() {

        //Given one dog to create
        String expName = "Gary";

        //When the method is called to change the name,
        Dog newDog = AnimalFactory.createDog("Gary", new Date());

        //Then check that Dog name is the name to change
        String actName = newDog.getName();
        Assert.assertTrue(expName.equals(actName));
    }

    @Test
    public void createDogBirthDateTest() {

        //Given one dog to create
        Date expDate = new Date(1946, 9, 5);

        //When the method is called to change the name,
        Dog newDog = AnimalFactory.createDog("Gary", new Date(1946, 9, 5));

        //Then check that Dog name is the name to change
        Date actDate = newDog.getBirthDate();
        Assert.assertEquals(expDate, actDate);
    }


    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatNameTest() {

        //Given one dog to create
        String expName = "Roy";

        //When the method is called to change the name,
        Cat newCat = AnimalFactory.createCat("Roy", new Date());

        //Then check that Dog name is the name to change
        String actName = newCat.getName();
        Assert.assertTrue(expName.equals(actName));
    }

    @Test
    public void createCatBirthDateTest() {

        //Given one dog to create
        Date expDate = new Date(2013, 10, 14);

        //When the method is called to change the name,
        Cat newCat = AnimalFactory.createCat("Stockholm", new Date(2013, 10, 14));

        //Then check that Dog name is the name to change
        Date actDate = newCat.getBirthDate();
        Assert.assertEquals(expDate, actDate);
    }


}
