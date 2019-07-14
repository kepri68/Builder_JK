package pl.sda.builder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//3

        User user = new User.Builder().
                lastname("Jan").
                password("12345").
                name("Kowalski").build();
        //^6 .build()
        //9^ add .password
        //10 wyprintowanie:
        System.out.println(user);
    }
}

