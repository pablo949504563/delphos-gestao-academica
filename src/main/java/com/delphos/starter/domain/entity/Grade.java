package com.delphos.starter.domain.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Grade {
  private Double grade1;
  private Double grade2;
  private Double grade3;
  private Double finalGrade;

  // Getters and Setters


  public Double getGrade1() {
    return grade1;
  }

  public void setGrade1(Double grade1) {
    this.grade1 = grade1;
  }

  public Double getGrade2() {
    return grade2;
  }

  public void setGrade2(Double grade2) {
    this.grade2 = grade2;
  }

  public Double getGrade3() {
    return grade3;
  }

  public void setGrade3(Double grade3) {
    this.grade3 = grade3;
  }

  public Double getFinalGrade() {
    return finalGrade;
  }

  public void setFinalGrade(Double finalGrade) {
    this.finalGrade = finalGrade;
  }
}
