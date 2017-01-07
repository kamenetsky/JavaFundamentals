/**
 * Created by Leonid on 07.01.2017.
 */
public class ConstructorExample {

    private String title;
    public ConstructorExample(){
    }


    public ConstructorExample(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
    public static void main(String[] args) {
        ConstructorExample ConstructorExample_1 = new ConstructorExample();
        System.out.println("1st constructor: " + ConstructorExample_1.getTitle());

        ConstructorExample ConstructorExample_2 = new ConstructorExample("title");
        System.out.println("2nd constructor: " + ConstructorExample_2.getTitle());
    }

}
