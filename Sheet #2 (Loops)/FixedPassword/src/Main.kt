fun main()
{
    var password = readln().toInt()
    while(true)
    {
        if(password!=1999){
            password= readln().toInt()
            println("Wrong")
        }
        else
        {
            println("Correct")
            break
        }
    }
}
