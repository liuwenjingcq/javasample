public class Person {
    private String name;
    private int age;
    public  String getName(){
        return this.name;
    }
    public void setName(String name){
        if(name == null||name.isBlank()){
            throw new IllegalArgumentException("invalid name");
        }
        this.name=name.strip();//去掉首位空格
    }
    public  int getAge(){
        return this.age;
    }

    public void setAge(int age) {
        if(age<0||age>100){
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }
}
