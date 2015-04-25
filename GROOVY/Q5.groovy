10.times{print 3*(it+1)+" "}
println()
List l =1..10
l.each{print 3*it+" "}
println()
l.eachWithIndex{it,i-> print(3*it+" ")}
