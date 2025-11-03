package com.delphos.starter.domain.entity;
import com.delphos.starter.domain.enums.EnrollmentStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "enrollments")
public class Enrollment {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "student_id", nullable = false)
  private Student student;

  @ManyToOne
  @JoinColumn(name = "discipline_id", nullable = false)
  private Discipline discipline;

  @Column(nullable = false)
  private String academicPeriod; // Ex: "2024.1"

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private EnrollmentStatus status = EnrollmentStatus.ENROLLED;

  private Double finalGrade;

  private Integer attendancePercentage;

  // Getters and Setters


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public Discipline getDiscipline() {
    return discipline;
  }

  public void setDiscipline(Discipline discipline) {
    this.discipline = discipline;
  }

  public String getAcademicPeriod() {
    return academicPeriod;
  }

  public void setAcademicPeriod(String academicPeriod) {
    this.academicPeriod = academicPeriod;
  }

  public EnrollmentStatus getStatus() {
    return status;
  }

  public void setStatus(EnrollmentStatus status) {
    this.status = status;
  }

  public Double getFinalGrade() {
    return finalGrade;
  }

  public void setFinalGrade(Double finalGrade) {
    this.finalGrade = finalGrade;
  }

  public Integer getAttendancePercentage() {
    return attendancePercentage;
  }

  public void setAttendancePercentage(Integer attendancePercentage) {
    this.attendancePercentage = attendancePercentage;
  }
}
