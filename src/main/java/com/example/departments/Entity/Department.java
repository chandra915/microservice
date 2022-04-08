package com.example.departments.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long departmentId;
    String departmentName;
    String departmentAddress;
    String departmentCode;



}
