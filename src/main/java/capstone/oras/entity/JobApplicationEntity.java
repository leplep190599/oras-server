package capstone.oras.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "JobApplication")
public class JobApplicationEntity {
    private int id;
    private Integer candidateId;
    private Integer jobId;
    private Double matchingRate;
    private String cv;
    private Date applyDate;
    private Integer talentPoolId;
    private String source;
    private String status;
    private String comment;
    private CandidateEntity candidateByCandidateId;
    private JobEntity jobByJobId;
    private TalentPoolEntity talentPoolByTalentPoolId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "candidateId", nullable = true)
    public Integer getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Integer candidateId) {
        this.candidateId = candidateId;
    }

    @Basic
    @Column(name = "jobId", nullable = true)
    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    @Basic
    @Column(name = "matchingRate", nullable = true, precision = 0)
    public Double getMatchingRate() {
        return matchingRate;
    }

    public void setMatchingRate(Double matchingRate) {
        this.matchingRate = matchingRate;
    }

    @Basic
    @Column(name = "cv", nullable = true, length = 2147483647)
    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    @Basic
    @Column(name = "applyDate", nullable = true)
    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    @Basic
    @Column(name = "talentPoolId", nullable = true)
    public Integer getTalentPoolId() {
        return talentPoolId;
    }

    public void setTalentPoolId(Integer talentPoolId) {
        this.talentPoolId = talentPoolId;
    }

    @Basic
    @Column(name = "source", nullable = true, length = 100)
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Basic
    @Column(name = "status", nullable = true, length = 50)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "comment", nullable = true, length = 2147483647)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobApplicationEntity that = (JobApplicationEntity) o;
        return id == that.id &&
                Objects.equals(candidateId, that.candidateId) &&
                Objects.equals(jobId, that.jobId) &&
                Objects.equals(matchingRate, that.matchingRate) &&
                Objects.equals(cv, that.cv) &&
                Objects.equals(applyDate, that.applyDate) &&
                Objects.equals(talentPoolId, that.talentPoolId) &&
                Objects.equals(source, that.source) &&
                Objects.equals(status, that.status) &&
                Objects.equals(comment, that.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, candidateId, jobId, matchingRate, cv, applyDate, talentPoolId, source, status, comment);
    }

    @ManyToOne
    @JoinColumn(name = "candidateId", referencedColumnName = "id")
    public CandidateEntity getCandidateByCandidateId() {
        return candidateByCandidateId;
    }

    public void setCandidateByCandidateId(CandidateEntity candidateByCandidateId) {
        this.candidateByCandidateId = candidateByCandidateId;
    }

    @ManyToOne
    @JoinColumn(name = "jobId", referencedColumnName = "id")
    public JobEntity getJobByJobId() {
        return jobByJobId;
    }

    public void setJobByJobId(JobEntity jobByJobId) {
        this.jobByJobId = jobByJobId;
    }

    @ManyToOne
    @JoinColumn(name = "talentPoolId", referencedColumnName = "id")
    public TalentPoolEntity getTalentPoolByTalentPoolId() {
        return talentPoolByTalentPoolId;
    }

    public void setTalentPoolByTalentPoolId(TalentPoolEntity talentPoolByTalentPoolId) {
        this.talentPoolByTalentPoolId = talentPoolByTalentPoolId;
    }
}
