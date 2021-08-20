package com.training.generics;

/**
 * Exercise:        3
 * Description:     Create and test a SixTuple generic.
 *
 * @author Argishti_Tigranyan
 */

class Person{
    private int age;
    private String firstName;
    private String lastName;

    public Person(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return this.firstName+" "+this.lastName+" "+ this.age;
    }
}

class Car{
    private int productionYear;
    private String brand;
    private String model;

    public Car(int productionYear, String brand, String model) {
        this.productionYear = productionYear;
        this.brand = brand;
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return this.brand + " " + this.model + " " + this.productionYear;
    }
}

class TwoTuple<A, B>{
    public final A first;
    public final B second;

    public TwoTuple(A a, B b){
        this.first = a;
        this.second = b;
    }

    @Override
    public String toString(){
        return "("+first+", "+second+")";
    }
}

class ThreeTuple<A, B, C> extends TwoTuple<A, B>{
    public final C third;

    public ThreeTuple(A a, B b, C c){
        super(a, b);
        this.third = c;
    }

    @Override
    public String toString(){
       return "("+first+", "+second+", "+third+")";
    }
}

class FourTuple<A, B, C, D> extends ThreeTuple<A, B, C>{
    public final D fourth;

    public FourTuple(A a, B b, C c, D d){
        super(a, b, c);
        this.fourth = d;
    }

    @Override
    public String toString(){
        return "("+first+", "+second+", "+third+", "+fourth+")";
    }
}

class FiveTuple<A, B, C, D, E> extends FourTuple<A, B, C, D>{
    public final E fifth;

    public FiveTuple(A a, B b, C c, D d, E e){
        super(a, b, c, d);
        this.fifth = e;
    }

    @Override
    public String toString(){
        return "("+first+", "+second+", "+third+", "+fourth+", "+fifth+")";
    }
}

class SixTuple<A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E>{
    public final F sixth;

    public SixTuple(A a, B b, C c, D d, E e, F f){
        super(a, b, c, d, e);
        this.sixth = f;
    }

    @Override
    public String toString(){
        return "("+first+", "+second+", "+third+", "+fourth+", "+fifth+", "+sixth+")";
    }
}

public class Exercise3 {
    public static void main(String[] args) {

        Robot robot = new Robot("Wall-E");
        Person person = new Person(20, "Argishti", "Tigranyan");
        Car car = new Car(2008, "Infinity", "G37Xs");
        String name = new String("Generics");
        Integer number = new Integer(7);
        Boolean statement = new Boolean(true);

        TwoTuple<Integer, String> two = new TwoTuple<>(number, name);
        ThreeTuple<Integer, String, Boolean> three = new ThreeTuple<>(number, name, statement);
        FourTuple<Integer, String, Boolean, Robot> four = new FourTuple<>(number, name, statement, robot);
        FiveTuple<Integer, Boolean, String, Car, Robot> five = new FiveTuple<>(number, statement, name, car, robot);
        SixTuple<Person, Car, Robot, String, Integer, Boolean> six = new SixTuple<>(person, car, robot, name, number, statement);

        Object[] array = {two, three, four, five, six};
        for (Object x: array){
            System.out.print(x+";\n");
        }
    }
}
