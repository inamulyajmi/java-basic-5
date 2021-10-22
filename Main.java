class Main {
    public static void main(String[] args) {
      Hero hero = new Hero("Ina", 17);
  
      hero.player();
    
      for(int i = 1; i <=10; i++){
        hero.walk();
      }

      for(int i = 1; i <=6; i++){
          hero.run();
      }
      for(int i = 1; i <=30; i++){
          hero.walk();
      }
      for(int i = 1; i <=3; i++){
          hero.eat();
      }
      hero.drink();
      hero.drink();

      for(int i = 1; i <=6; i++){
        hero.jump();
      }
     for(int i = 1; i <=5; i++){
        hero.sit();
      }
      for(int i = 1; i <=2; i++){
        hero.attack();
    }

  
      /*
      Group 1: walk 20x, run 5x, eat 3x, drink 2x, walk 5x, jump 2x, sit 1x, attack 3x
      Group 2: walk 5x, run 2x, walk 35x, eat 4x, drink 3x, jump 3x, sit 1x, attack 2x
      Group 3: walk 7x, run 4x, eat 4x, drink 3x, jump 3x, sit 4x, walk 50x, attack 4x
      Group 4: walk 10x, run 6x, walk 30x, eat 3x, drink 2x, jump 6x, sit 5x, attack 2x
      Group 5: walk 10x, run 2x, eat 3x  walk 30x, drink 5x, jump 3x, sit 5x, attack 6x
      Group 6: walk 15x, run 1x, eat 4x, drink 2x, jump 6x, walk 12x, sit 5x, attack 1x
      Group 7: walk 2x, run 3x, eat 5x, drink 2x,  walk 50x, jump 6x, sit 5x, attack 3x
      Group 8: walk 1x, run 5x, eat 4x, drink 2x, walk 60x, jump x4, sit 2x, attack 4x
      Group 9: walk 7x, run 2x, eat 3x, drink 2x, jump 6x, sit 5x, walk 10x, attack 2x
      */
      
      hero.player();
   
    }
  }