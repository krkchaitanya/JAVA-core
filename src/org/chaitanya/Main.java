package org.chaitanya;


import org.chaitanya.AutoBoxingAndUnboxing.IntClass;
import org.chaitanya.LinkedList.Customer;
import org.chaitanya.ListArray.GroceryList;
import org.chaitanya.Account.Account;
import org.chaitanya.Account.Car;
import org.chaitanya.composition.*;
import org.chaitanya.encapsulation.EnhancedPlayer;
import org.chaitanya.inherit.Animal;
import org.chaitanya.inherit.Dog;


import java.util.Scanner;
import java.util.ArrayList;



public class Main {


    private static GroceryList groceryList=new GroceryList();
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {





//        Car class
        org.chaitanya.Account.Car porsche=new org.chaitanya.Account.Car();
        org.chaitanya.Account.Car holden=new Car();
        porsche.setModel("someModel");
//        System.out.println("model gonna be--"+porsche.getModel());


//        Account class
        Account oneAcc=new Account("1234",0.00,"chaitanya","chai@email.com","12341231234");

        oneAcc.deposit(220.00);
//        System.out.println(oneAcc.getBalance());
        oneAcc.withdraw(220.00);
//        System.out.println(oneAcc.getBalance());





//        Animal class
        Animal animal=new Animal("Animal",1,1,5,5);

        Dog dog=new Dog("Yorkie",8,20,2,4,1,4,20,20,"long silky");

//        System.out.println("dog coat--"+dog.getCoat());
//        System.out.println("animal name  "+animal.getName());

        dog.chewing();


//        folder data ..case
        Dimensions dimensions=new Dimensions(22,44,11);
        Case theCase=new Case("220B","dell","240",dimensions);

        Monitor theMonitor=new Monitor("27inch beast","acer",27,new Resolution(2540,1440));

        Motherboard theMotherboard=new Motherboard("BJ-200","Asus",4,4,"v2.44");

        PC thePc=new PC(theCase,theMonitor,theMotherboard);

        thePc.getMonitor().drawPixelAt(1500,1200,"red");
        thePc.getMotherboard().loadProgram("windows10");
        thePc.getTheCase().pressPowerButton();



//        ENCAPSULATION .................

//        Player player=new Player();
//        player.name="mike";
//        player.health=20;
//        player.weapon="sword";
//
//        int damage=10;
//        player.loseHealth(damage);
//        System.out.println("........Encapsulation__Remaining health--"+player.healthRemaining());
//


        EnhancedPlayer enhancedPlayer=new EnhancedPlayer("tim",200,"knife");
//        System.out.println("encapsulation.....gettingHealth---"+enhancedPlayer.getHealth());





//        ---------------------MOVIES------------------------MOVIES-----------------------
//
//
//
//        public static Movie randomMovie{
//
//            int randomNumber=(int) (Math.random()*5)+1;
//            System.out.println("random no generated is ---"+randomNumber);
//
//            switch (randomNumber){
//                case 1:{
//                    return new Jaws();
//                }
//            }
//
//
//        }


//        .........................ARRAYS --------------------------

        int[] myIntarray=new int[10];
        myIntarray[5]=50;

        double[] myDoublearray=new double[5];
        myDoublearray[4]=40;

        System.out.println("intarray-- "+myIntarray[5] +" mydoublearray-- "+myDoublearray[4]);


        int[] myArrayInt={1,2,3,4,5,6,7};
        System.out.println("myArrayInt-- "+myArrayInt[4]);

        int[] myDynArr=new int[10];

        for (int i=0;i<myDynArr.length;i++){
            myDynArr[i]=i*10;
        }

        printArray(myDynArr);




//-----------JAVA  _______  Array ---------------




            int[] myIntegers = getIntegers(5);
            for (int i = 0; i < myIntegers.length; i++) {
                System.out.println("Element " + i + "types was" + myIntegers[i]);
            }
//        System.out.println("average of array gonna be_______ "+getAvg(myIntegers));



//list array package/////////////////////////////////////////////
//
//
//        GroceryList groceryList=new GroceryList();
//
//        boolean quit=false;
//        int choice=0;
//        printInstructions();
//        while (!quit){
//            System.out.println("---enter ur choice----");
//            choice=scanner.nextInt();
//            scanner.nextLine();
//            switch(choice){
//                case 0:{
//                    printInstructions();
//                    break;
//                }
//                case 1:{
//                    groceryList.printItems();
//                    break;
//                }
//                case 2:{
//                    addItem();
//                    break;
//                }
//                case 3:{
//                    modifyItem();
//                    break;
//                }
//                case 4:{
//                    removeItem();
//                    break;
//                }
//                case 5:{
//                    searchFotItem();
//                    break;
//                }
//                case 6:
//                    quit=true;
//                    break;
//            }
//        }




//--------------AUTOBOXING AND UNBOXING--------------

        String[] strArray=new String[10];
        int[] intArray=new int[10];

        ArrayList<String> strArrayList=new ArrayList<String>();
        strArrayList.add("tim bulchik");

        ArrayList<IntClass> intClassArrayList=new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
//        System.out.println("strArraylist----"+strArrayList);
//        System.out.println("intClassArrayList======"+intClassArrayList.getClass());





        ArrayList<Integer> intArrLi=new ArrayList<Integer>();
        for (int i=0;i<=10;i++){
            intArrLi.add(Integer.valueOf(i));
        }

        for (int i=0;i<intArrLi.size();i++){
            //System.out.println("auto boxing and unboxing......"+intArrLi.get(i).intValue());
        }



        ArrayList<Double> doubleArrLi=new ArrayList<Double>();
        for (double i=0.0;i<=10.0;i+=0.5){
            doubleArrLi.add(Double.valueOf(i));
        }

        for (int i=0;i<doubleArrLi.size();i++){
            //System.out.println("double array list------data---"+doubleArrLi.get(i).doubleValue());
        }




//------------------------------LINKEDlIST---------------------

        Customer customer=new Customer("Tim", 142.0);
        Customer anotherCustomer;
        anotherCustomer=customer;
        anotherCustomer.setBalance(12.99);

        System.out.println("customer name is  "+customer.getName() +"  and his bal is  "+customer.getBalance());


        ArrayList<Integer> linkArrLi=new ArrayList<Integer>();

        linkArrLi.add(10);
        linkArrLi.add(11);
        linkArrLi.add(12);
        linkArrLi.add(13);

        for (int i=0;i<linkArrLi.size();i++){
            System.out.println("link array list -->> "+linkArrLi.get(i).intValue());
        }

        linkArrLi.add(2,33);
        for (int i=0;i<linkArrLi.size();i++){
            System.out.println("updated link array list -->> "+linkArrLi.get(i).intValue());
        }






















    }



/*
---------------Methods-----------------Methods-----------Methods--------------------------------------------------------------------------------------
................................................................................................................................................
print instructions--listArray package-----------------------
*/

    public static void printInstructions(){
        System.out.println("0--choose some no");
        System.out.println("1--list of items");
        System.out.println("2--add item");
        System.out.println("3--modify itemmmm");
        System.out.println("4--remove item");
        System.out.println("5--serch for item in list");
        System.out.println("6--quit pplication");
    }


    public static void addItem(){
        System.out.println("please enter the grocery item----");
        groceryList.addItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("please enter the position and the newItem");
        int posi=scanner.nextInt();
        System.out.println("enter replacement item..");
        String newItem=scanner.nextLine();
        groceryList.modifyItem(posi,newItem);
    }

    public static void removeItem(){
        System.out.println("enter item no");
        int no=scanner.nextInt();
        groceryList.removeItem(no);
    }

    public static void searchFotItem(){
        System.out.println("search for the item...");
        String ite=scanner.nextLine();
        if(groceryList.findItem(ite)!=null){
            System.out.println("found-"+ite+" item");
        }else{
            System.out.println(ite+"item not found--");
        }
    }








//    get integers method

    public static int[] getIntegers(int number){
        System.out.println("enter "+ number+" integer values \r");
        int[] values=new int[number];
        for (int i=0;i<values.length;i++){
            values[i]=scanner.nextInt();
        }
        return values;
    }



//    print array method

    public static void printArray(int[] Array){
        for (int i=0;i<Array.length;i++){
            System.out.println("hey printarray method------ "+Array[i]);
        }
    }



//    get average method

    public static double getAvg(int[] array){
        int sum=0;
        for (int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return (double) sum/ (double)array.length;
    }



}


