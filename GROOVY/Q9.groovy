new File("/home/tj/Desktop/intelligrape/groovy/answer/file2.txt").eachLine({
line,it->
println("Line"+it+":"+line.replaceAll("\\s",""))
})


