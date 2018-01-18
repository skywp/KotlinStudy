/**
 *
 * 一个符号或单词，类似数学的 + - * ／ ，用于运算或者操作。
 *
 * 同时操作对象的数目，被称之为几元操作符
 *
 */
fun main(args: Array<String>){
    //一元操作符
    var a  = 3
    var b = -a
    val c = -b

    print("${b},${c}")

    //二元操作符2个目标，在两个目标之间，前后用空格分割
    println(2+3)
    println(3-2)
    println(3*2)
    println(12/4)
    println(8%3)
}