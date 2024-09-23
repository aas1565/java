package com.mod2;

public class Main {
    public static void main(String[] args){
        Player bot = new Player();
        Player alex = new Player(Player.variants.scissors, "Alex");
        System.out.println("Бот выбрал: " + bot.res); // Печатаем выбор бота
        System.out.println("Результат: " + bot.whoWins(alex)); // Печатаем результат игры
    }
}
