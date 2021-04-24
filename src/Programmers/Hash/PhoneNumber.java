package Programmers.Hash;

public class PhoneNumber {
    public static Boolean solution(String[] phone_book) {
        for(int i=0; i<phone_book.length-1; i++){
            int hashPhone = phone_book[i].hashCode();
            int len = phone_book[i].length();
            for(int j=i+1; j<phone_book.length; j++){

                if(phone_book[j].length() >= len
                && hashPhone == (phone_book[i].substring(0,len).hashCode())){
                    return false;
                }
                /*이 부분이 이해가 가지 않는다.
                 * */
                else if(phone_book[j].length() < len
                        && phone_book[i].substring(0,phone_book[j].length()).hashCode()==phone_book[j].hashCode()){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        String[] phone_number = {"119","97674223","1195524421"};
        System.out.println(solution(phone_number));
    }
}
