fun main() {
    val number= readln().toInt()
    if (number==1)
    {
        println(-1)
    }
    else
    {
        for ( i in 1..number)
        {
            if (i%2==0)
            {
                println(i)
            }
        }
    }

}