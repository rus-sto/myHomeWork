package by.jrr.ruslan.bean;

import org.junit.Assert;
import org.junit.Test;
public class DemoAnimalTest {

    @Test
    public void parrotTest() {
        Parrot parrot = new Parrot(2, true, "wavy", "pink", "Kesha");
        String expected = "Parrot{name='Kesha', beakColor='pink', countOfLegs=2, canSwim=true, color='wavy'}";
        Assert.assertEquals(expected, parrot.toString());
    }

    @Test
    public void allMethodsTest() {
        Parrot parrot = new Parrot(2, true, "wavy", "pink", "Kesha");
        String expected = " Hello, I'm " + parrot.getName() + " and I can really speak";
        Assert.assertEquals(expected, parrot.speak());
        Assert.assertEquals("I can breath", parrot.breath());
        Assert.assertEquals("Yep, I'm flying", parrot.fly());
        Assert.assertEquals("kurly-kurly", parrot.voice());
    }

    @Test
    public void catTest() {
        Cat cat = new Cat(4, false, "red", true, "Murzik");
        String expected = "Cat{name='Murzik', mustaches=true, countOfLegs=4, canSwim=false, color='red'}";
        Assert.assertEquals(expected, cat.toString());
    }

    @Test
    public void allCatTest() {
        Cat cat = new Cat(4, false, "red", true, "Murzik");
        Assert.assertEquals("I drink milk", cat.drinkMilk());
        Assert.assertEquals("Myau-Myau", cat.voice());
        Assert.assertEquals("running fast", cat.run());
        Assert.assertEquals("I can breath", cat.breath());
    }
@ Test
    public void dogTest(){
        Dog dog = new Dog(4, true, "ultra red", true, "ridgback");
    String expected = "Dog{breat='ridgback', mustaches=true, countOfLegs=4, canSwim=true, color='ultra red'}";
        Assert.assertEquals(expected,dog.toString());
}
@Test
    public void allMethodsDogTest(){
    Dog dog = new Dog(4, true, "ultra red", true, "ridgback");
Assert.assertEquals("I always wagging the tail",dog.wagTheTail());
    Assert.assertEquals("I can breath",dog.breath());
    Assert.assertEquals("running fast",dog.run());
    Assert.assertEquals("RRHau-rrhau",dog.voice());

}
}