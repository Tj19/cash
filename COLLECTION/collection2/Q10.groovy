String str= "http://www.google.com?name=tarun&age=23&hobby=soccer"
def var=str.tokenize("?")
println var

var.each{ 
 key=it.split("&")
}

println key

key.each{ 
 println it
}
