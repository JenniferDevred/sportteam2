package formation.annoation;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "s'entraîne 8h/jour et 5 jours/semaine ";
	}

	@Override
	public String getPlayer() {
		// TODO Auto-generated method stub
		return "aaa";
	}
	
	

}
