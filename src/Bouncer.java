void main(String[] args) {
//    int age = 18;
//
//
//    if (age > 18) {
//        IO.println("You can drive the car");
//    } else if (age == 18){
//        IO.println("You can drive the car, but be careful");
//    } else {
//        IO.println("You can't drive the car");
//    }

    int shoesSize = Integer.parseInt(args[0]);

    if (shoesSize > 47){
        IO.println("Your shoes size equivalent is XL");
    } else if (shoesSize <= 47 && shoesSize > 38){
        IO.println("Your shoes size equivalent is L");
    } else if (shoesSize < 38 && shoesSize > 35){
        IO.println("Your shoes size equivalent is M");
    } else if (shoesSize < 35 && shoesSize > 33){
        IO.println("Your shoes size equivalent is S");
    } else {
        IO.println("You need to contact us for some custom sizes");
    }


}

