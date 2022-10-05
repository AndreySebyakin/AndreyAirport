package by.airport.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    @Column
    private String customerName;
    @Column
    private String customerSurname;
    @Column
    private String passport;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "roleId")
    private Role roleId;
//    @OneToOne
//    @PrimaryKeyJoinColumn
//    private Login login;
//    @OneToMany(mappedBy = "customerId", cascade = CascadeType.ALL)
//    private List<Ticket> tickets;
}
