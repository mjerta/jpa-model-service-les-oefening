package nl.mpdev.les_oefening.models;

import jakarta.persistence.*;

@Entity
@Table(name = "todos")
public class Todo {

  private  String title;
  private  String description;


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  public Todo() {
  }

  public Todo(String title, String description) {
    this.title = title;
    this.description = description;
  }

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }

  public long getId() {
    return id;
  }
}
