//Instance variable
class InstanceVariable{
    int id;
    String name;
    
    public static void main(String[] args){
        InstanceVariable s1 = new InstanceVariable();
        s1.id = 101;
        s1.name = "Mishty";
        System.out.println(s1.id + " " + s1.name);
    }
}