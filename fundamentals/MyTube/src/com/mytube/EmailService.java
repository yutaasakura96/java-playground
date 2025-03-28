package com.mytube;

public class EmailService implements NotifacationService {
  @Override
  public void notify(User user) {
    System.out.println("Notifying " + user.getEmail() + "...");
    System.out.println("Done!\n");
  }
}
