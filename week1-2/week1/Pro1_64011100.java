package week1;
class Pro1_64011100{
    public static void main(String[] args) {
        int current_people = 312032486 ;
        int numBirth = 31536000/7;
        int numDeath = 31536000/13;
        int numImmigrant = 31536000/45;

        for(int i = 0; i < 5; i++)
        {
            current_people = current_people + numBirth + numImmigrant - numDeath;
            System.out.printf("Year %d = %d people\n",i+1,current_people);
        }
        
    }
}