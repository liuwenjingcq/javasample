public class City {
    String name;
    double latitude;
    double longitude;

    public static void main(String[] args) {
        City bj = new City();
        bj.name = "Beijing";
        bj.latitude = 39.903;
        bj.longitude = 116.401;
        System.out.println(bj.name);
        System.out.println("location: " + bj.latitude + ", " + bj.longitude);
        Person ming = new Person();
        ming.setName("xiaoming");
        ming.setAge(12);
        System.out.println(ming.getName() +","+ming.getAge());

         Group group =new Group();
         group.setNames("xiaoming","xiaohong","xiaolan");
         group.setNames();
         group.setNames("xiaoming","xiaohong");

    }
}

