import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegX{

public static void main(String[] args){
String str = "var x = 100";
Pattern pattern = Pattern.compile("var");    /* important lines(this and next)*/
Matcher matcher = pattern.matcher(str);
if (matcher.find()){
System.out.println("Match found:" + matcher.group());
}
else{
System.out.println("Sorry, no match");
}
}

}