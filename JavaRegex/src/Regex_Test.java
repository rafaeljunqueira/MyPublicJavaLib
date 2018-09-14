import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex_Test {

    public void checker(String Regex_Pattern){
    
        Scanner in = new Scanner(System.in);
        String Test_String = in.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
        in.close();
    }   
    
}