new File("/home/tj/Desktop/intelligrape/groovy/answer/file").eachFile({file-> new File("${file}").eachLine({line-> new File("file1.txt").append(line)})})
