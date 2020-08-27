package com.example.calculator.model

public class FDat{
    private var num1: Double = 0.0;
    private var num2: Double = 0.0;
    private var ope: String = "";
    private var ans: Double = 0.0;

    public fun getNum1(): Double {
        return this.num1;
    }
    public fun setNum1(num1: Double): Unit {
        this.num1 = num1;
    }
    public fun getNum2(): Double {
        return this.num2;
    }
    public fun setNum2(num2: Double): Unit {
        this.num2 = num2;
    }
    public fun getOpe(): String {
        return this.ope;
    }
    public fun setOpe(ope: String): Unit {
        this.ope = ope;
    }
    public fun getAns(): Double {
        return this.ans;
    }
    public fun setAns(ans: Double) {
        this.ans = ans;
    }
}