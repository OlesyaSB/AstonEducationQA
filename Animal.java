
class Animal{
  private String name;
  private int runLength;
  private int swimLength;
 
  public Animal(String name,int runLength, int swimLength) {
  this.name = name;
  this.runLength = runLength;
  this.swimLength = swimLength;
  }
  
  public String getName(){
  return name;
  }
 
  public void setName(String name) {
  this.name = name;
  }
  public void run(int a) {
      if ((a <= runLength) && (a > 0)){
    System.out.printf(name + " пробежал "+a+ " м");
    System.out.println();
  } else if (a > runLength) {
    System.out.printf(name + " не может пробежать больше " + runLength +" м"); 
    System.out.println();
  } else if (a<=0){
    System.out.printf(name + " стоит на месте");
    System.out.println();
  }   
  }
  public void swim(int b) {
      if ((b <= swimLength) && (b > 0)){
    System.out.printf(name + " проплыл "+b+ " м");
  } else if (b > swimLength) {
    System.out.printf(name + " не может проплыть больше " + swimLength +" м");
    System.out.println();
  } else if (b<=0){
    System.out.printf(name + " стоит на месте");
    System.out.println();
  }   
  }
 }
 

  class Dog extends Animal {
  
  public Dog(String name){
  super(name, 500, 10);
  
  }
  }
  
  class Cat extends Animal {
  public boolean fullness;
 
  public void swim(int b) {
      System.out.printf("Коты не умеют плавать");
      System.out.println();
  }   
  
  public Cat(String name) {
  super(name, 200, 0);
  this.fullness = false;
  }
 
  public void eat(int food) {
    if (food <= 0) {
      System.out.println("Нельзя поесть отрицательное колличество еды");
      System.out.println();
  return;
  }
    if (food>10) {
      System.out.println("Кот не сможет сьесть столько еды");
      System.out.println();
    return;
  }
    System.out.printf("Кот " + getName() + " поел");
    System.out.println();
    fullness = true;
  }
  }
 
  class Miska {
  private int food;
  
  public Miska (int food){
  this.food = food;
  }
  
  public void putFood (int put){
  food += put;
  }
  
  public void geteatCat (Cat cat, int food){
  if (food<=0) {
    System.out.println("Нельзя добавить отрицательное количесвто еды!");
  return;
  }
  if (food>this.food) {
    System.out.println("В миске мало еды для кота");
  return;
  }
  
  cat.eat(food);
  this.food -= food;
}
}
public class Main {
public static void main(String[] args) {
Cat cat = new Cat("Мурзик");
Dog dog = new Dog("Бобик");
Miska miska = new Miska(13);
miska.geteatCat(cat, 10);
cat.eat(3);
if (cat.fullness) {
System.out.print("Кот сыт");
System.out.println();
} else {
System.out.print("Кот голоден");
}
cat.run(10);
dog.swim(180);
cat.swim(1);
}
}