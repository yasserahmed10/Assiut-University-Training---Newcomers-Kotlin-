fun main() {
   val num = readlnOrNull().toString()
    val x= num[0].toString().toInt()
    if (x.mod(2)==0)
    {
        println("EVEN")
    }
    else if(x.mod(2)!=0)
    {
        println("ODD")
    }
}