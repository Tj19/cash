class Employee
{
  String Name;
  byte age;
  int salary;
}
Object[] obj=
[
new Employee(name:'anjali',age:21,salary:4500),
new Employee(name:'rinky',age:19,salary:7800),
new Employee(name:'geetika',age:25,salary:10000),
new Employee(name:'pooja',age:28,salary:6000),
new Employee(name:'bhavna',age:23,salary:3500),
new Employee(name:'mehul',age:22,salary:4500),
new Employee(name:'chunni',age:25,salary:5500),
new Employee(name:'Varun',age:19,salary:5000),
]

println "Employees who earn less than 5000 are:"
obj.each{
if(it.salary<5000)
println it.name+" "
}

println "Youngest employees:"
obj.each{
if((it.age)==obj.age.min())
println it.name+" "+it.age+" "+it.salary
}

print obj.age.min().name
println "Oldest employees:"
obj.each{
if((it.age)==obj.age.max())
println it.name+" "+it.age+" "+it.salary
}

println "employees with maximum salary:"
obj.each{
if((it.salary)==obj.salary.max())
println it.name+" "+it.age+" "+it.salary
}
println "List of employees:"+ obj.name
