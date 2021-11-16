package basics;
import java.util.Locale;
import java.util.Scanner;

/* This code was made as a small project
for review some concepts of Java.We are aiming creating
a system that don't allow you pass until you fulfill the prerequisites of
a strong password.

 */
class PasswordCriteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean validationSpace = false;
        boolean validationNum = false;
        boolean validationLetter = false;
        boolean validationUpper = false;
        boolean validationSpecial = false;
        boolean validationSeq = false;
        String Password = "AAAAAAAAA";


        //Main Code
        while (!validationLetter && !validationNum && !validationSeq && !validationSpace && !validationSpecial && !validationUpper){
            System.out.println("Digite Uma senha forte! ela precisa ser desse jeito:");
            System.out.println("Não pode haver espaços");
            System.out.println("Tem que haver pelo menos 1 letra e 1 número");
            System.out.println("Pelo menos 1 letra Maiúscula:");
            System.out.println("Pelo menos 1 caractere especial @,#,$,% :");
            System.out.println("Não pode ter 3 ou mais caracteres em sequência!:");
            Password = sc.nextLine();
            validationLetter = checkLetter(Password);
            validationNum = checkNumber(Password);
            validationSeq = checkSeq(Password);
            validationSpace = checkSpaces(Password);
            validationSpecial = checkSpecialChar(Password);
            validationUpper = checkUpperCase(Password);
        } ;


        // 1. Não pode haver espaços --------->       feito
    }
         static boolean checkSpaces(String pass) {
        String result = pass.replaceAll("\\s+", "");
        if (result == pass) {
            return true;
        } else {
            return false;
        }
    }

    /// 2. Tem q haver 1 numero pelo menos  --------->       feito
     static boolean checkNumber(String pass) {
        boolean containsNum = false;
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (int i = 0; i <= 9; i++) {
            if (pass.contains(num[i])) {
                containsNum = true;
            }
        }
        return containsNum;
    }

    ///- 2.5 Tem q haver 1 letra pelo menos  --------->       feito
     static boolean checkLetter(String pass) {
        boolean containsLetter = false;
        String[] letter = {"a", "z", "x", "s", "w", "q", "c", "d", "e", "v", "f", "r", "b", "g", "t", "n", "h", "y", "m", "j", "u", "k", "i", "l", "o", "ç", "p"};
        for (int i = 0; i < letter.length; i++) {
            if (pass.contains(letter[i])) {
                containsLetter = true;
            }
        }
        return containsLetter;
    }

    //// 3 Tem q haver pelo menos 1 letra maiúscula  --------->       feito
     static boolean checkUpperCase(String pass) {
        if (pass == pass.toLowerCase(Locale.ROOT)) {
            return false;
        } else {
            return true;
        }
    }

    ///// 4. Pelo menos 1 caractere especial  --------->       feito
     static boolean checkSpecialChar(String pass) {
        boolean containsSpecialChar = false;
        String[] SpecialChar = {"@", "#", "$", "%", "&"};
        for (int i = 0; i < 5; i++) {
            if (pass.contains(SpecialChar[i])) {
                containsSpecialChar = true;
            }
        }
        return containsSpecialChar;
    }

    // 5. Sem caracteres repetidos em sequencia de 3 --------->       feito
     static boolean checkSeq(String pass) {
        int SeqSize = 0;
        char lastChar = '.';
        for (int i = 0; i < pass.length(); i++) {
            char c = pass.charAt(i);
            try {
                if (c == lastChar) {
                    SeqSize++;
                }
            } finally {
                lastChar = c;
            }
        }
        if (SeqSize >= 3) {
            return false;
        } else {
            return true;
        }
    }



        static boolean checkAll(String pass){
            boolean notOk = true;
                notOk = !checkLetter(pass);
                notOk = !checkNumber(pass);
                notOk = !checkSeq(pass);
                notOk = !checkUpperCase(pass);
                notOk = !checkSpaces(pass);
                notOk = !checkSpecialChar(pass);
                if(!notOk){return true;}else{return false;}

        }
    }

