package oopl8;

import produkt.*;


public class Main {

    public static void main(String[] args) {
        Product[] tab = new Product[10];
        tab[0] = new Book(15, "Book 1", "Ksiazka");
        tab[1] = new Chocolate(5, "Chocolate 1", "Czekolada");
        tab[2] = new Book(10, "Book 2", "Ksiazka");
        tab[3] = new Pen(2, "Pen 1", "Dlugopis");
        tab[4] = new Jam(7, "Jam 1", "Dzem");
        tab[5] = new Polopiryna(20, "Polopiryna 1", "Polopiryna");
        tab[6] = new Jam(9, "Jam 2", "Dzem");
        tab[7] = new Chocolate(9, "Chocolate 2", "Czekolada");
        tab[8] = new Pen(1, "Pen 2", "Dlugopis");
        tab[9] = new Book(85, "Book 3", "Ksiazka");

        for (int i = 0; i < 10; i++) {
            tab[i].buy();
            tab[i].showInfo();
            //Proram uruchamia wszystkie metody dla klas w tablicy i wyswietla wyniki na ekran
        }

    }
}