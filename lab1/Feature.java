
public class Feature {
	String description;
	int effortEstimate;
	int remainingWork;
	User developer;

	public User assignFeatureToDeveloper(User givenUser) {
		return givenUser;
	}

	public User revokeFeatureToDeveloper(User givenUser) {
		return givenUser;
	}
}
