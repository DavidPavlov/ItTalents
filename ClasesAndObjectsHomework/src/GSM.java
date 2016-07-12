
public class GSM {

	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;

	void insertSimCard(String simNumber) {
		if (hasSimCard) {
			System.out.println("The phone already has a sim card");
		}
		if (simNumber.matches("^08[0-9]{8}$")) {
			hasSimCard = true;
			simMobileNumber = simNumber;
		}
	}

	void removeSimCard() {
		hasSimCard = false;
		simMobileNumber = null;
	}

	void call(GSM receiver, int duration) {
		if (duration < 1) {
			System.out.println("Invalid duration");
			return;
		}
		if (simMobileNumber.equals(receiver.simMobileNumber)) {
			System.out.println("The caller and the receiver are same");
			return;
		}
		if (!(receiver.hasSimCard && hasSimCard)) {
			return;
		}
		Call call = new Call();
		call.caller = simMobileNumber;
		call.receiver = receiver.simMobileNumber;
		call.duration = duration;

		outgoingCallsDuration += duration;
		lastOutgoingCall = call;
		receiver.lastIncomingCall = call;
	}

	double getSumForCalls() {
		return outgoingCallsDuration * Call.priceForMinute;
	}

	void printInfoForTheLastOutgoingCall() {
		System.out.printf("Caller: %s\nReceiver: %s\nDuration: %d\n", lastOutgoingCall.caller,
				lastOutgoingCall.receiver, lastOutgoingCall.duration);
	}

	void printInfoForTheLastIncomingCall() {
		System.out.printf("Caller: %s\nReceiver: %s\nDuration: %d\n", lastIncomingCall.caller,
				lastIncomingCall.receiver, lastIncomingCall.duration);
	}
}
