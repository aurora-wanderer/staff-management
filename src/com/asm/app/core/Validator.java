/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asm.app.core;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author MSI GL62
 */
public class Validator {

    public static boolean isRequired(Object... values) {
        return Arrays.asList(values).stream().anyMatch(item -> String.valueOf(item).trim().isEmpty());
    }

    public static boolean isEmail(String value) {
        final Pattern regex = Pattern.compile("^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$");
        Matcher matcher = regex.matcher(value);
        return matcher.find();
    }

    public static boolean isID(String value) {
        final Pattern regex = Pattern.compile("^(PS|ps){1}\\w+{5}$");
        Matcher matcher = regex.matcher(value);
        return matcher.find();
    }

    public static boolean isName(String value) {
        final Pattern regex = Pattern.compile("[a-z\\D_-]{2,}$"
                + "|[aàảãáạăằẳẵắặâầẩẫấậbcdđeèẻẽéẹêềểễếệfghiìỉĩíịjklmnoòỏõóọôồổỗốộơờởỡớợpqrstuùủũúụưừửữứựvwxyỳỷỹýỵz_]+");
        Matcher matcher = regex.matcher(value);
        return matcher.find();
    }

    public static boolean isAge(String value) {
        final Pattern regex = Pattern.compile("^\\d+$");
        Matcher matcher = regex.matcher(value);
        return matcher.find();
    }

    public static boolean isLuong(String value) {
        String regex = "\\d";
        double num = 0;
        try {
            num = Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return false;
        }
        return (!regex.matches(value)) && 5 < num;
    }

}
