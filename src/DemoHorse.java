
public class DemoHorse {
	public static void main(String [] args) {
	Horse horse1 = new Horse();
	
	RaceHorse horse2 = new RaceHorse();
	
	horse1.setName("Bob");
	horse1.setColor("Roting Red");
	horse1.setBirthYear(43);
	
	horse2.setName("Faster Bob");
	horse2.setColor("FireTruch red");
	horse2.setBirthYear(22);
	horse2.setRaces(77);
	
	System.out.println(horse1.getBirthYear()+ horse1.getColor() + horse1.getName());
	System.out.println(horse2.getRaces() + horse2.getColor() + horse2.getName() + horse2.getBirthYear());
	
	}

}
