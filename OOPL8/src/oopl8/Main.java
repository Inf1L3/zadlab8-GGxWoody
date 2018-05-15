package oopl8;

import produkt.*;
import figura.*;


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

        FiguraGeometryczna[] tabFig = new FiguraGeometryczna[15];
        tabFig[0] = new Romb(2, 12);
        tabFig[1] = new Kolo(9);
        tabFig[2] = new Kwadrat(7);
        tabFig[3] = new Szescian(2);
        tabFig[4] = new Kula(11);
        tabFig[5] = new Stozek(5, 2);
        tabFig[6] = new Romb(4, 2);
        tabFig[7] = new Trojkat(4, 5, 2, 4);
        tabFig[8] = new Trapez(3, 2, 52);
        tabFig[9] = new Walec(4, 7);
        tabFig[10] = new Rownoleglobok(3, 6, 12);
        tabFig[11] = new Kwadrat(12);
        tabFig[12] = new Kolo(8);
        tabFig[13] = new Szescian(8);
        tabFig[14] = new Kula(12);
        
        int i= 0;
        
        while(i<tabFig.length){
            System.out.println(tabFig[i].toString());
            i++;
        }
        

    }
}