package com.example.simplejni;

/**
 * Created with IntelliJ IDEA.
 * User: stainoftime
 * Date: 11.11.13
 * Time: 13:20
 * To change this template use File | Settings | File Templates.
 */
public class NativeUtils {
    static {
        System.loadLibrary("tinymath");
    }

    /**
     * Статический нативный метод суммирования
     *
     * @param arg0 первое слагаемое
     * @param arg1 второе слагаемое
     * @return сумма
     */
    public static native double nativeSum(double arg0, double arg1);

    /**
     * Статический экземплярный метод проверки числа на простоту
     *
     * @param candidate число, которое нужно проверить на простоту
     * @return true если число простое, иначе false
     */
    public native boolean nativeIsPrime(int candidate);

    /**
     * Получение информации о возможностях CPU
     *
     *
     * @return строку, с поддерживаемы системой технологиями
     */
    public native String getCpuInfo();

}
