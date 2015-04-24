List l=(10..20)
println l.groupBy{
    if(it%2==0)
    return 'even'
    else
    return 'odd'
}

