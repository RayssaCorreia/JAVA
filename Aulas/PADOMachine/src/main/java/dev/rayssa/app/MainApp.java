package dev.rayssa.app;

import dev.rayssa.app.models.machine.CoffeeMachine;
import dev.rayssa.app.models.machine.DrinkMachine;
import dev.rayssa.app.models.machine.TeaMachine;
import dev.rayssa.app.models.products.Coffee;
import dev.rayssa.app.models.products.Tea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.security.Signature;

public class MainApp {

    public static void main(String[] args) throws IOException {
        DrinkMachine drinkMachine = new DrinkMachine();
        drinkMachine.prepare();
    }

//        while (true){
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            int valor = Integer.parseInt(reader.readLine());
//            System.out.println("Valor informado pelo usaário:" + valor);
//
//            if(valor == 0){
//                CoffeeMachine coffeeMachine = new CoffeeMachine();
//                Coffee coffee = coffeeMachine.makeCoffee();
//                System.out.println(coffee);
//            }
//            if(valor == 1){
//                TeaMachine teaMachine = new TeaMachine();
//                Tea tea = teaMachine.makeTea();
//                System.out.println(tea);
//            }
//        }

//    CoffeeMachine coffeeMachine = new CoffeeMachine();
//    Coffee coffee = coffeeMachine.makeCoffee();
//    System.out.println(coffee);
//
//    CoffeeMachine coffeeMachine = new CoffeeMachine();
//    Coffee coffee = coffeeMachine.makeCoffee();
//    System.out.println(coffee);

    }

