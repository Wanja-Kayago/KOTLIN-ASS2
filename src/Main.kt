//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    greetings("Ada")
    greetings("Wanja")

    remainder(21,2)

    sum(13,7,22,34)

    fact()
}
fun greetings(name: String){
    println("Hello" + ' '+ name)
}
fun remainder(num1: Int,num2: Int){
    var result =num1 % num2
    println(result)
}
fun sum(num1: Int, num2: Int, num3: Int, num4: Int){
    var result = num1 + num2 + num3 + num4
    println (result)
}
fun fact(){
    var fact = "I love swimming"
    println(fact)
}