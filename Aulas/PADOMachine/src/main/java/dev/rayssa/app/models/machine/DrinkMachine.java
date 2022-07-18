package dev.rayssa.app.models.machine;

import dev.rayssa.app.models.products.Coffee;
import dev.rayssa.app.models.products.HotDrink;
import dev.rayssa.app.models.products.Tea;
//import javassist.tools.reflect.Reflection;
//import org.reflections.Reflections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class DrinkMachine {

    private final List<HotDrinkMachine> machines = List.of(
            new CoffeeMachine(),
            new ChocolateMachine(),
            new TeaMachine());
    public DrinkMachine() {
    }

    public void prepare() throws IOException {
        System.out.println("Escolha sua Bebida!");
        for (int i = 0; i < machines.size(); i++) {
            System.out.println(i + ". " + machines.get(i).getClass().getSimpleName().replace("Machine", ""));
        }
        System.out.print("Escolha: ");

        while (true)
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int valor = Integer.parseInt(reader.readLine());
            System.out.println("Valor informado pelo usuário: " + valor);
            if(valor < machines.size() && valor >= 0) {
                HotDrink hotDrink = this.machines.get(valor).makeDrink();
                System.out.println(hotDrink);
                System.out.println("///////////////////////////////////////////////////");
                System.out.print("Escolha: ");
            }else {
                System.out.println("Opção não disponivel, tente novamente!");
            }
        }
    }
//    private List<HotDrinkMachine> machine = new ArrayList<>();
//
//    public DrinkMachine() {
//
////         Set<Class<? extends HotDrinkMachine >> classes = new Reflections("dev.rayssa.app").getSubTypesOf(HotDrinkMachine.class);
////        classes.forEach(aClass -> {
////            System.out.println(aClass.getSimpleName());
////        });
//
//        CoffeeMachine coffeeMachine = new CoffeeMachine();
//        TeaMachine teaMachine = new TeaMachine();
//        machine.add(coffeeMachine);
//        machine.add(teaMachine);
//
//    }
//
//    public void prapare() throws IOException {
//        System.out.println("Escolha sua bebida");
//        System.out.println("0. Coffee");
//        System.out.println("1. Tea");
//        System.out.println("Escolha: ");
//
////        for (int i = 0; i < machine.size(); i++) {
////
////            System.out.println(machine.get(i).ge);
////
////        }
//
//        while (true) {
//
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            int valor = Integer.parseInt(reader.readLine());
//            System.out.println("Valor informado pelo usaário:" + valor);
//
//            if(valor <= machine.size() && valor >= 0) {
//                HotDrink hotDrink = this.machine.get(valor).makeDrink();
//                System.out.println(hotDrink);
//                System.out.println("#########################################");
//            }else {
//                System.out.println("Opção não disponivel, tente novamente!");
//                System.out.println("0. Coffee");
//                System.out.println("1. Tea");
//                System.out.println("Escolha: ");
//            }
//        }
//
////        for (int i = 0; i < this.machine.size(); i++) {
////            HotDrink hotDrink = machine.get(i).makeDrink();
////
////            System.out.println(hotDrink);
//// }
//    }
}
