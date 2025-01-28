public abstract class abstractFactory {
    public  abstract maincourse getMaincourse();
    public  abstract desserts getdesserts();
    public  abstract appetizers getappetizers();

    public static abstractFactory getFactory(String cuisine)
    {
         if(cuisine.equalsIgnoreCase("Indian"))
         {
            return new indianFactory();
         }
         else
         {
            return new chineseFactory();
         }
         
    }
}
