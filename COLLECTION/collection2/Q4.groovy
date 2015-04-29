Map m=[Anjali:23,Swati:22,Pinku:22,Kunal:16,Aanchal:23,Ruchi:45,rishab:22,harsh:23,paras:26,Swastika:27]
print m.each{
    it
}
print "\n"
m.eachWithIndex{e,i->
    print e.key+":"+e.value+", "
}
