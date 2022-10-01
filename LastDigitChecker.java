public class LastDigitChecker {

    public static boolean hasSameLastDigit(int a, int b , int c){

        if (a>=10 && a<=1000 && b>=10 && b<=1000 && c>=10 && c<=1000){

            int lastofa = a%10;
            int lastofb = b%10;
            int lastofc = c%10;

            if (lastofa==lastofb || lastofa == lastofc || lastofb == lastofc){
                return true;
            }
        }
        return false;
    }
    public static boolean isValid (int number){

        if (number >=10 && number<=1000){
            return true;
        }
        return false;
    }
}
