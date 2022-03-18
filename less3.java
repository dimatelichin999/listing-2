class less3 {

    public static void main(String[] args) {

        String test = "Підрахунок букв, пробілів, чисел, та іншого в  цій програмі";
        count(test);

    }
    public static void  count (String x ) {
        char[] ch = x.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        for (int i = 0 ; i<x.length(); i++){
            if(Character.isLetter(ch[i])){
                letter++;
            }
            else if (Character.isDigit(ch[i])){
                num++;
            }
            else if (Character.isSpaceChar(ch[i])){
                space++;
            }
            else  {
                other++;
            }
        }
        System.out.println("Підрахунок букв, пробілів, чисел, та іншого в  цій програмі");
        System.out.println("letter" + letter);
        System.out.println("num" + num);
        System.out.println("space" + space);
        System.out.println("other" + other);
    }

}
