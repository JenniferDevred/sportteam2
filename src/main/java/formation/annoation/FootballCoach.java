package formation.annoation;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "coure 10 km/jour ";
	}

	@Override
	public String getPlayer() {
		// TODO Auto-generated method stub
		return "Jennifer";
	}

}
