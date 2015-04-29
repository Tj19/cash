groovy> List l=[1,2,3,"element1",0.3,[2,4,6],0..10]; 
groovy> l.each{  
groovy> print "${it}"+" : "+it.getClass() 
groovy> println()
groovy> }
groovy> l.get(6).get(9) 
 
1 : class java.lang.Integer
2 : class java.lang.Integer
3 : class java.lang.Integer
element1 : class java.lang.String
0.3 : class java.math.BigDecimal
[2, 4, 6] : class java.util.ArrayList
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10] : class groovy.lang.IntRange
Result: 9
