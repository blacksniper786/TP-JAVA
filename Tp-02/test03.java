public class test03{
int id;
String name;
String city;
test03(int id, String name, String city){
this.id=id;
this.name=name;
this.city=city;
}
public String toString(){//overriding the toString() method
return id+" "+name+" "+city;
}
public static void main(String args[]){
test03 e1=new test03(01,"Ari","NewYork");
test03 e2=new test03(02,"Jon","Chicago");
System.out.println(e1);
System.out.println(e2);
}
}