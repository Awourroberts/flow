fun main() {
  isOdd()
    name()
    robot()
    cool()
}
fun isOdd(){
    for (y in 1..100){
        if (y%2!=0){

        }
    }
}
fun name(){
    var students=arrayOf("consolata","magdalina","tuphena")
    for (name in students){
        if (name.length>5){
            println(name)
        }
    }

}
fun robot(){
    var age=0
    if (age<6){
        println("milk")
    }
    else if (age<15){
        println("fanta orange")
    }
    else("cococola")


}
fun cool(){
    for (l in 1..100){
        println(l)
    }
   for (l in 1..100){
       if (l%3==0){
           println("fizz")
       }
       if (l%5==0){
           println("buzz")
       }
   }
    for (l in 1..100){
        if (l%3==0 && l%5==0){
            println("fizzbuzz")
        }
    }
}












