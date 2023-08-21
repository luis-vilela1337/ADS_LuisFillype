public class Main {
    public static void main(String[] args) {
    Animal[] animais = new Animal[4];

    animais[0]= new Animal(1L, "Tartaruga");
    animais[1]= new Animal(2L, "Coelho");
    animais[2]= new Animal(3L, "Cachorro");
    animais[3]= new Animal(4L, "Gato");


        System.out.println("Arrays");
//        for (int i =0; i< animais.length; i++) {
//            System.out.println(animais[i].getNome());
//        }
        for (Animal animal: animais) {
            System.out.println(animal.getNome());
        }
    }
}
