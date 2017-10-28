/**
 * Copyright © 2017 DHCC. All rights reserved.
 *
 * Project: KotlinStudy
 * Package:
 * Created by WangPeng on 2017/10/28.
 */
/**
 值的类型
 3这样的整数，在Kotlin中称为Int类型的值
 形式：var 变量名 : Int = 3;
 由于Kotlin有类型推断，类型可以忽略不写。
 */
var run : Int = 5;
var run1 = 5;
/**
 * 浮点型（小数）
 * Kotlin中默认的浮点型是Double（双精度）
 */
val pi : Double = 3.141592657532123456

/**
 * 类型安全：变量一旦定义，其类型不可更改。
 * 即：不能给变量一个类型不同的值。
 */
var count = 3.5

/**
 * 布尔型：Boolean
 * 表示逻辑上的"真"或"假"
 * 只有2个值，true和false
 * */

/**
 * 元组数据类型(Tuple)
 * 给多个变量同时赋值，分二元(Pair)和三元(Triple)
 */

/**
 * 可空类型（据说这个发明价值$100,000,000）
 * 代表变量可能没有值的情况
 * 如:用户资料的选填部分，如住址/性别等辅助信息
 * 形式:var 变量:类型 ? ,无值则是null
 */
fun main(args: Array<String>) {
    print("每天都跑${run}公里\n")
    print("圆周率${pi}")
    var vip = true
    if (vip){
        print("您是vip会员\n")
    } else {
        print("小伙子，充钱吧\n")
    }
    //元组
    val (day,method,course) = Triple(3,"Learning","Kotlin Programming");
    val fee = Pair("学费",0)
    print("${day}天${method}${course}${fee.first}${fee.second}\n")
}
