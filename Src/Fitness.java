public class Fitness {
    public static void main(String[] args) {
        UserFitness user1=new UserFitness("Andrey",10,3,2000,"user-top@mail",
                "(098)1234567","Slavin",98,125,1500);


        UserFitness user2=new UserFitness("Nicolay",8,10,2010,"user-bin@mail",
                "(098)0123789","Brovko",100,140,1700);

        UserFitness user3=new UserFitness("Nika",10,9,2015,"user-state@mail",
                "(098)9516234","Lunina",30,120,1000);



        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();

        user1.setPhoneNum("(096)1239785");
        user2.setWeightAnInt(96);
        user3.setSurname("Pelipenko");

        System.out.println("Зі зміненою інформацією:");
        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();


    }

}
