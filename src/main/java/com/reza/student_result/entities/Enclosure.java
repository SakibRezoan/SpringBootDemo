package com.reza.student_result.entities;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ENCLOSURE")
public class Enclosure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ENCLOSURE_ID")
    private Long id;
    @Column(name = "ENCLOSURE_NAME")
    private String name;

    @Column(name = "ENCLOSURE_URL")
    private String url;
}
