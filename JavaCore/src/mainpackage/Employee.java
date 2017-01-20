package mainpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements  Serializable {
String name;
int age;
 
private void readObject(ObjectInputStream o){
	
}
private void writeObject(ObjectOutputStream i){
	
}
}
