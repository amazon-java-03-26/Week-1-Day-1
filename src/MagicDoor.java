void main(String[] args) {

    String myWord = args[0];
    String magicWord = "1234";

    if (myWord.equals(magicWord)) {
        IO.println("You found the magic word");
    } else {
        IO.println("You didn't find the magic word");
    }


}
