/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package market.model;

import javax.swing.text.html.parser.Entity;

/**
 *
 * @author Luki
 */
@Entity
@Table(name = "uzytkownicy")
public class Uzytkownicy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idStudent")
}
