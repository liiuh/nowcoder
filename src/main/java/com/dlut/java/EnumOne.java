package com.dlut.java;

/**
 * @author LiuHeng
 * @create 2022-06-27 19:57
 */
enum AccountType
{
    SAVING, FIXED, CURRENT;
    private AccountType()
    {
        System.out.println("It is a account type");
    }
}
public class EnumOne
{
    public static void main(String[]args)
    {
        System.out.println(AccountType.FIXED);
        byte b1=1,b2=2,b3,b6;
        final byte b4=4,b5=6;
        b6=b4+b5;
        b3= (byte) (b1+b2);
        System.out.println(b3+b6);
    }
}



