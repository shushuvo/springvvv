package com.example.school2.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Document(collection="tasks")
public class Task {
  @Id
  private Integer Id;
  private String name;
  private double price;
  private Integer quantity;
}
