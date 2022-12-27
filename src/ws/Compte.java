package ws;

import java.time.LocalDate;
import java.util.Date;
import java.util.StringJoiner;

public class Compte {
  private int code;
  private double solde;
  private Date dateCreation = new Date();

  public Compte(int code, double solde) {
    this.code = code;
    this.solde = solde;
  }

  public Compte() {}

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public void setDateCreation(Date dateCreation) {
    this.dateCreation = dateCreation;
  }

  public double getSolde() {
    return solde;
  }

  public void setSolde(double solde) {
    this.solde = solde;
  }

  public Date getDateCreation() {
    return dateCreation;
  }


  @Override
  public String toString() {
    return new StringJoiner(", ", Compte.class.getSimpleName() + "[", "]")
        .add("code=" + code)
        .add("solde=" + solde)
        .add("dateCreation=" + dateCreation)
        .toString();
  }
}
