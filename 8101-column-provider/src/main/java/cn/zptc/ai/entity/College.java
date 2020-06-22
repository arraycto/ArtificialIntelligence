package cn.zptc.ai.entity;

import java.io.Serializable;
import java.util.Date;

public class College implements Serializable {
    private Integer id;

    private String collageTitle;

    private String collageSynopsis;

    private String collageImage;

    private String honorSynopsis;

    private String honorImage;

    private String organization;

    private String teachers;

    private String major;

    private Integer createId;

    private String createName;

    private Date createTime;

    private Integer modifyId;

    private String modifyName;

    private Date modifyTime;

    private Integer states;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCollageTitle() {
        return collageTitle;
    }

    public void setCollageTitle(String collageTitle) {
        this.collageTitle = collageTitle == null ? null : collageTitle.trim();
    }

    public String getCollageSynopsis() {
        return collageSynopsis;
    }

    public void setCollageSynopsis(String collageSynopsis) {
        this.collageSynopsis = collageSynopsis == null ? null : collageSynopsis.trim();
    }

    public String getCollageImage() {
        return collageImage;
    }

    public void setCollageImage(String collageImage) {
        this.collageImage = collageImage == null ? null : collageImage.trim();
    }

    public String getHonorSynopsis() {
        return honorSynopsis;
    }

    public void setHonorSynopsis(String honorSynopsis) {
        this.honorSynopsis = honorSynopsis == null ? null : honorSynopsis.trim();
    }

    public String getHonorImage() {
        return honorImage;
    }

    public void setHonorImage(String honorImage) {
        this.honorImage = honorImage == null ? null : honorImage.trim();
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    public String getTeachers() {
        return teachers;
    }

    public void setTeachers(String teachers) {
        this.teachers = teachers == null ? null : teachers.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getModifyId() {
        return modifyId;
    }

    public void setModifyId(Integer modifyId) {
        this.modifyId = modifyId;
    }

    public String getModifyName() {
        return modifyName;
    }

    public void setModifyName(String modifyName) {
        this.modifyName = modifyName == null ? null : modifyName.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getStates() {
        return states;
    }

    public void setStates(Integer states) {
        this.states = states;
    }
}