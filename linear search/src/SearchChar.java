public class SearchChar {
    public static void main(String[] args) {
        String name = "satyanarayan";
        char character = 'n';
        boolean ans = check(name,'u');
        System.out.println(ans);
    }

    static boolean check(String name,char character){
        if (name.length() != 0){
            for (int i = 0; i < name.length(); i++) {
                if(name.charAt(i) == character){
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    // method 2 -- using forEach loop
    static boolean check2(String name,char targetChar){
        if (name.length() != 0){
           for(char character : name.toCharArray()){
               if (character == targetChar){
                   return true;
               }
           }
        }
        return false;
    }

}
