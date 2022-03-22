package src.chapter1;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }

    public boolean hashInvitation() {
        return bag.hashInvitation();
    }

    public void buy(Ticket ticket) {
        bag.buy(ticket);
    }

    public void changeInvitation(Ticket tickets) {
        bag.changeInvitation(tickets);
    }
}
