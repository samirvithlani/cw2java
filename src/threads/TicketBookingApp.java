package threads;

class TicketCounter {

	int avaialbleSeat = 2;

	public void bookTicket(String name, int no) {
		if ((avaialbleSeat >= no) && (no > 0)) {
			System.out.println(name + " booking succes...");
			avaialbleSeat -= no;
		} else {
			System.out.println(name + "  no seats avaialable...");
		}
	}
}

public class TicketBookingApp extends Thread {

	TicketCounter tc;
	String name;
	int seats;

	public TicketBookingApp(TicketCounter tc, String name, int seats) {

		this.tc = tc;
		this.name = name;
		this.seats = seats;
	}

	@Override
	public void run() {
		synchronized (tc) {

			tc.bookTicket(name, seats);
		}

	}

	public static void main(String[] args) {
		TicketCounter tc = new TicketCounter();
		TicketBookingApp t1 = new TicketBookingApp(tc, "raj", 2);
		TicketBookingApp t2 = new TicketBookingApp(tc, "parth", 2);

		t1.start();
		t2.start();
	}

}
