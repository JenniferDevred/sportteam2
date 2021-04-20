package formation.annoation;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTp {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("springbean2.xml");
		Team t1 = ctx.getBean("team", Team.class);
		t1.setNomEquipe("ManchesterUnited");
		t1.setNbJoueurs(4);
		
		Team t2 = ctx.getBean("team", Team.class);
		t2.setNomEquipe("ManchesterCity");
		t2.setNbJoueurs(5);
		
		Coach coach1 = ctx.getBean("baseballCoach", Coach.class);
		Coach coach2 = ctx.getBean("footballCoach", Coach.class);
		
		t1.getListeCoach().add(coach1);
		t1.getListeCoach().add(coach2);
		

		t2.getListeCoach().add(coach1);
		t2.getListeCoach().add(coach2);
		
		System.out.println("L'�quipe du " + t1.getNomEquipe() + " poss�de : " + t1.getNbJoueurs() + " joueurs ");
		System.out.println("L'�quipe du " + t2.getNomEquipe() + " poss�de : " + t2.getNbJoueurs() + " joueurs ");

		System.out.println("L'�quipe " + t1.getNomEquipe() + " s'entra�ne ");
		System.out.println("L'�quipe " + t2.getNomEquipe() + " s'entra�ne ");
		List<Coach> listCoach = t1.getListeCoach();

		for (Coach coach : listCoach) {

			System.out.println(coach.getDailyWorkout());
		}

		List<Coach> listCoachs = t2.getListeCoach();

		for (Coach coach : listCoachs) {

			System.out.println(coach.getDailyWorkout());
		}

	}
}
