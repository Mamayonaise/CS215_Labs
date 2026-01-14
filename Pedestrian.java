package Lab1Prob1;

public class Pedestrian implements IsMobile {
	public Pedestrian() {}
	
	@Override
	public double travelFlat(double distkm) {
		return distkm/5;
	}
	
	@Override
	public double travelElevated(double distkm, double angleDegrees) {
	double basetime = distkm/5;
	return basetime * (1 + angleDegrees / 15);
	}
  
}
