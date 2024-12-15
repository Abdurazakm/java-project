package package1;

public class TestLocal{
    public void pupAge(){
       int age = 0; // scope is limited to pupAge method only
       age = age + 7;
        System.out.println("Puppy age is : " + age);
    }
    public static void main(String args[]){
       TestLocal test = new TestLocal();
        test.pupAge();
    }
 }
 
