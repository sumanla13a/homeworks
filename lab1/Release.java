import java.util.ArrayList;

public class Release {
	private ArrayList<Feature> features;
	private ArrayList<Sprint> sprints;
	
	public int getCompletedWork() {
		return 0;
	}
	
	public int getRemainingWork() {
		return 0;
	}
	public boolean addFeatureToRelease() {
		return true;
	}

	public boolean removeFeatureFromRelease() {
		return true;
	}
}
