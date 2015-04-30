def l=1..100
l.each{
if((it%5==0) && (it%3==0))
print 'FIXXBUzz'+' '  
  
else if(it%3==0)
print ' '+'Fizz'+" "

else if(it%5==0)
print 'Buzz'+' '

else print it+" "
}
