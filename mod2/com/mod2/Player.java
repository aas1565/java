package com.mod2;
import java.util.Random;

public class Player {
    public enum variants{
        rock,
        paper,
        scissors
    }
    public String name;
    public variants var;// Это будет хранить выбор игрока
    public variants res;// Это будет хранить выбор бота
    public Player(variants var, String name){
        this.var=var;
        this.name=name;
    }

    public variants goTo(){
        Random random = new Random();
        int index = random.nextInt(variants.values().length); // Генерация случайного индекса
        return variants.values()[index]; // Возврат случайного варианта
    }


    public Player(){
        name="bot";
        res=goTo();
    }

    public String whoWins(Player player){
        variants bot1=res;
        if(bot1==variants.paper && player.var == variants.rock){
            return "победил робот";
        }
        if(bot1==variants.paper && player.var == variants.paper){
            return"ничья";
        }
        if(bot1==variants.paper && player.var == variants.scissors){
            return"победил пользователь";
        }
        if(bot1==variants.rock && player.var == variants.paper){
            return "победил пользователь";
        }
        if(bot1==variants.rock && player.var == variants.rock){
            return "ничья";
        }
        if(bot1==variants.rock && player.var == variants.scissors){
            return "победил робот";
        }
        if(bot1==variants.scissors && player.var == variants.rock){
            return "победил пользователь";
        }
        if(bot1==variants.scissors && player.var == variants.paper){
            return "победил робот";
        }
        if(bot1==variants.scissors && player.var == variants.scissors){
            return "ничья";
        }
        else{
            return "неверные данные";
        }
    }
}
