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
fun main(args: Array<String>) {
    print("每天都跑${run}公里")
}