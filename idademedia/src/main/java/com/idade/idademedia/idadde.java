package com.idade.idademedia;

import java.util.Scanner;

public class idadde {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade;

        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();

        if(idade >= 10 & idade <= 14)
            System.out.println("Sua idade é: " + idade + " anos e você está na categoria: Infantil");
        else if (idade >= 15 & idade <= 17)
            System.out.println("Sua idade é: " + idade + " anos e você está na categoria: Juvenil");
        else if (idade >= 18 & idade <= 25)
            System.out.println("Sua idade é: " + idade + " anos e você está na categoria: Adulto");
        else
            System.out.println("Você ainda não pode participar!");

    }
}

