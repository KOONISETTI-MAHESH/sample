public class Variable_functions {
    static void add(int...nums)
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        System.out.println(sum);
    }
    static String concatFirstChars(String...strings)
   {
            String resultString="";
            for(int i=0;i<strings.length;i++)
            {
                resultString+=strings[i].charAt(0);;
            }
            return resultString;
    }
    static void lcm(int...nums)
    {
        int x=5;
    }
    public static void main(String[] args)
    {
       add(10,20);
       add(10,20,30);
       add(10,20,0,40);
       System.out.println(concatFirstChars("ab","bc","cd"));
    }
}
