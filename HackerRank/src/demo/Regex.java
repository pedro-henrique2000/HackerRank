package demo;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {
    public static void main(String[] args) {
//        String regex = "\\w";
//        String text = "s";
//
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(text);
//
//        boolean result = matcher.matches();
//
//        System.out.println(result);

        String regexCep = "\\d{5}-\\d{3}";
        String cep = "12345-000";

        Pattern pattern = Pattern.compile(regexCep);
        Matcher matcher = pattern.matcher(cep);

//        System.out.println(matcher.matches());

        String regexCpf = "\\d{3}.\\d{3}.\\d{3}-\\d{2}";
        String cpf = "123.456.7a9-10";

        Pattern pattern2 = Pattern.compile(regexCpf);
        Matcher matcher2 = pattern2.matcher(cpf);

        System.out.println(matcher2.matches());


    }
}
