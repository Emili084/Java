class Decipherer {
    public static String decipher(String message) {

        int key = message.length() /2;

        String sousChaine = message.substring(5, 5 + key);

        String decode = sousChaine.replaceAll("@#\\?", " ");

        decode = new StringBuilder(decode).reverse().toString();

        return decode;

    }

    public static void main(String[] args) {
        System.out.println(decipher("0@sn9sirppa@#?ia'jgtvryko1"));
        System.out.println(decipher("q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj"));
        System.out.println(decipher("aopi?sedohtém@#?sedhtmg+p9l!"));
    }
}