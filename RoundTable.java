import java.util.Arrays;

public class RoundTable {
    public static void main(String[] args) {
        int people[] = new int[26];
        Arrays.fill(people, 1);
        int counter = 0, index = 0;
        char person = 0, winner = 0;
        
        while (howMany(people) > 1) {
            if (people[index % 26] == 1) 
                counter++;

            if (counter % 10 == 0 && people[index % 26] == 1) {
                people[index % 26] = 0;
                person = (char)(index % 26 + 65);
                System.out.printf("%c counted %d and has been taken out.\n", 
                        person, counter);
            }

            index++;
        }

        for (int i = 0; i < people.length; i++)
            if (people[i] == 1) 
                winner = (char)(i + 65);

        System.out.printf("=====================================\n");
        System.out.printf("The winner of the game is %c\n", winner);
    }
    
    
    static int howMany(int array[]) {
        int count = 0;
        for (int i : array)
            if (i == 1) count++;
        return count;     
    }
}
