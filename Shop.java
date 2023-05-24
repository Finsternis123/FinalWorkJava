package JavaWork.JavaHomeWork.FinalWorkJava;

import java.util.*;

public class Shop {
    public static void main(String[] args) {
        Notebooks nt1 = new Notebooks("Pear", "White", "MAC", "500G", "4G");
        Notebooks nt2 = new Notebooks("Asas", "Black", "Linyx", "300G", "8G");
        Notebooks nt3 = new Notebooks("MSA", "Red", "Hindows", "200G", "32G");
        Notebooks nt4 = new Notebooks("Pear", "Grey", "MAC", "200G", "16G");
        Notebooks nt5 = new Notebooks("MSA", "Red", "Hindows", "300G", "16G");
        Notebooks nt6 = new Notebooks("Pear", "White", "MAC","300G", "4G");
        Notebooks nt7 = new Notebooks("Asas", "Black", "Hindows", "400G", "16G");
        Notebooks nt8 = new Notebooks("MSA", "Black", "Hindows", "300G", "32G");
        Notebooks nt9 = new Notebooks("Pear", "Grey", "MAC", "400G", "16G");
        Notebooks nt10 = new Notebooks("MSA", "White", "Linyx", "200G", "32G");
        
        Set<Notebooks> nt = new HashSet<>();
        nt.add(nt1); nt.add(nt2); nt.add(nt3); nt.add(nt4); nt.add(nt5);
        nt.add(nt6); nt.add(nt7); nt.add(nt8); nt.add(nt9); nt.add(nt10);

        Scanner sc = new Scanner(System.in);
        System.out.println("---Введите критерий поиска или выведите полный список ноутбуков командой All");
        System.out.println("---Color, Memory, Brend, RAM, OC---");
        
        switch (sc.next().toUpperCase()){
            case "COLOR":
                System.out.println("Выберите цвет: White, Red, Black, Grey");
                switch (sc.next().toUpperCase()){
                    case "RED":
                        for (Notebooks notebooks: nt){
                            if (notebooks.getColor() == "Red"){System.out.println(notebooks);}
                }
                break;
                    case "BLACK":
                        for (Notebooks notebooks: nt){
                            if (notebooks.getColor() == "Black"){System.out.println(notebooks);}
                }
                break;
                    case "WHITE":
                        for (Notebooks notebooks: nt){
                            if (notebooks.getColor() == "White"){System.out.println(notebooks);}
                }
                break;
                    case "GREY":
                        for (Notebooks notebooks: nt){
                            if (notebooks.getColor() == "Grey"){System.out.println(notebooks);}
                }
                break;
                    default:
                        System.out.println("Такого цвета нет!");
                }
                break;
            case "BREND":
                System.out.println("Выберите название бренда: Pear, MSA, Asas: ");
                switch (sc.next().toUpperCase()){
                    case "PEAR":
                        for (Notebooks notebooks: nt){
                            if (notebooks.getBrand() == "Pear"){System.out.println(notebooks);}
                }
                break;
                    case "MSA":
                        for (Notebooks notebooks: nt){
                            if (notebooks.getBrand() == "MSA"){System.out.println(notebooks);}
                }
                break;
                    case "ASAS":
                        for (Notebooks notebooks: nt){
                            if (notebooks.getBrand() == "Asas"){System.out.println(notebooks);}
                }
                break;
                    default:
                        System.out.println("Такого бренда нет!");
                }
                break;
            case "MEMORY":
                System.out.println("Выберите размер диска: 200G, 300G, 400G, 500G");
                switch (sc.next().toUpperCase()){
                    case "200G":
                        for (Notebooks notebooks: nt){
                            if (notebooks.getMemory() == "200G"){System.out.println(notebooks);}
                }
                break;
                    case "300G":
                        for (Notebooks notebooks: nt){
                            if (notebooks.getMemory() == "300G"){System.out.println(notebooks);}
                }
                break;
                    case "400G":
                        for (Notebooks notebooks: nt){
                            if (notebooks.getMemory() == "400G"){System.out.println(notebooks);}
                }
                break;
                    case "500G":
                        for (Notebooks notebooks: nt){
                            if (notebooks.getMemory() == "500G"){System.out.println(notebooks);}
                }
                break;
                    default:
                        System.out.println("Такого размера нет!");
                }
                break;
            case "RAM":
                System.out.println("Выберите размер RAM: 4G, 8G, 16G, 32G");
                switch (sc.next().toUpperCase()){
                    case "4G":
                        for (Notebooks notebooks: nt){
                            if (notebooks.getRAM() == "4G"){System.out.println(notebooks);}
                }
                break;
                    case "8G":
                        for (Notebooks notebooks: nt){
                            if (notebooks.getRAM() == "8G"){System.out.println(notebooks);}
                }
                break;
                    case "16G":
                        for (Notebooks notebooks: nt){
                            if (notebooks.getRAM() == "16G"){System.out.println(notebooks);}
                }
                break;
                    case "32G":
                        for (Notebooks notebooks: nt){
                            if (notebooks.getRAM() == "32G"){System.out.println(notebooks);}
                }
                break;
                    default:
                        System.out.println("Такого размера нет!");
                }
                break;
            case "OC":
                System.out.println("Выберите OC: Hindows, MAC, Linyx");
                switch (sc.next().toUpperCase()){
                    case "HINDOWS":
                        for (Notebooks notebooks: nt){
                            if (notebooks.getOC() == "Hindows"){System.out.println(notebooks);}
                }
                break;
                    case "MAC":
                        for (Notebooks notebooks: nt){
                            if (notebooks.getOC() == "MAC"){System.out.println(notebooks);}
                }
                break;
                    case "LINYX":
                        for (Notebooks notebooks: nt){
                            if (notebooks.getOC() == "Linyx"){System.out.println(notebooks);}
                }
                break;
                    default:
                        System.out.println("Такой OC нет!");
                }
                break;
            case "ALL":
                for (Notebooks notebooks: nt){
                    System.out.println(notebooks);
                }
                break;
                    default:
                        System.out.println("Такого критерия нет!");
        }
        sc.close();
    }
}