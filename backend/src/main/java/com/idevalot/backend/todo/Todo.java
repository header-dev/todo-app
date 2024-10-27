package com.idevalot.backend.todo;

import java.time.LocalDate;

public class Todo {

  public Todo() {
		
	}

  public Todo(int id, String title, String description,LocalDate targetDate, boolean done) {
    super();
    this.id = id;
    this.username = title;
    this.description = description;
    this.targetDate = LocalDate.now();
    this.done = done;
  }

  private int id;
  private String username;
  private String description;
  private LocalDate targetDate;
  private boolean done;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "Todo [id="+ id + ", username="+ username + ", description="+ description + ", targetDate="+ targetDate + ", done="+ done + "]";
  }

}
