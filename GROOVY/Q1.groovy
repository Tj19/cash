class Person{
String name
Integer age
String gender
String address

public void setName(String n){
    this.name=n
}

public void setAge(Integer a){
    this.age=a
}

public String getGender(){
    return gender
}
public String getAddress(){
    return address
}

}

Person person=new Person()
person.setName('TARUN')
person.setAge(21)
person.gender='MALE'
person.address='DELHI'

println(person.name)
println(person.age)
println(person.getGender())
println(person.getAddress())
