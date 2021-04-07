package dummy;

public class SplitEx {
    public static void main(String[] args) {
        String str = "Naveen12345!@#$%kumar";
        StringBuffer alpha = new StringBuffer(),
                     num =new StringBuffer(),
                     spcl = new StringBuffer();

        for(int i =0;i<str.length();i++)
        {
            if(Character.isAlphabetic(str.charAt(i)))
            {
                alpha.append(str.charAt(i));
            }
            else if(Character.isDigit(str.charAt(i)))

            {
             num.append(str.charAt(i));
            }
            else
                spcl.append(str.charAt(i));
        }

        System.out.println(alpha);
        System.out.println(num);
        System.out.println(spcl);


    }


}
