package src.chapter1;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        if (audience.getBag().hashInvitation()) {
            Ticket ticket = ticketSeller.getTicketOffice().getTickets();
            audience.getBag().setTicket(ticket);
        } else {
            Ticket ticket = ticketSeller.getTicketOffice().getTickets();
            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}

/*
* 영화관에 관람객이 왔을 때, 교환권을 가지고 있으면 티켓을 교환해주고
* 없다면 티켓을 구매한다.
*
* 이를 해결하기 위한 협력 객체는 Ticket, TicketOffice, TicketSeller, Audience, Bag
* audiece의 역할이 뭐가 있을까... 관람객한테 티켓을 보내주고, 그 티켓에 대해서
* */