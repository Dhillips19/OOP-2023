package ie.tudublin;

public class Cat 
{
    String name;
    private int numLives;

    public Cat()
    {
    }
    
    public Cat(String name)
    {
        this.name = name;
        this.numLives = 9;
    }
    
    public void speak()
    {
        System.out.println("Meow");
    }

    public void changeLives(int numLives)
    {
        this.numLives = numLives - 1;
    }

    public int currentLives()
    {
        return numLives;
    }

    public Cat(int lives)
    {   
        lives = 9; 
        numLives = lives;
    }

    public void kill()
    {   
        if(currentLives() > 0) 
        {
            changeLives(numLives);
            System.out.println("Ouch!");
        }

        if (currentLives() == 0)
        {
            System.out.println("Dead");
        }               
    }
}