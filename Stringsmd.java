import java.util.Scanner;
import java.util.*;
public class Stringsmd{
public static void main(String[] args)
{
    String[][] seriesList={{"a","b","c"},{"d","e","f"},{"g","h","i"}};
    for(String[] eachSeries: seriesList)
    {
        for(String eachCharacter:eachSeries)
        {
            System.out.println(eachCharacter);
        }
    }

}}