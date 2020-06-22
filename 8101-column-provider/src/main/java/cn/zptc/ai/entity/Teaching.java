package cn.zptc.ai.entity;

import java.io.Serializable;
import java.util.Date;

public class Teaching implements Serializable {
    private Integer id;

    private String teachingWork;

    private String teachingImage;

    private String scientificSynopsis;

    private String scientificImage;

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

    public String getTeachingWork() {
        return teachingWork;
    }

    public void setTeachingWork(String teachingWork) {
        this.teachingWork = teachingWork == null ? null : teachingWork.trim();
    }

    public String getTeachingImage() {
        return teachingImage;
    }

    public void setTeachingImage(String teachingImage) {
        this.teachingImage = teachingImage == null ? null : teachingImage.trim();
    }

    public String getScientificSynopsis() {
        return scientificSynopsis;
    }

    public void setScientificSynopsis(String scientificSynopsis) {
        this.scientificSynopsis = scientificSynopsis == null ? null : scientificSynopsis.trim();
    }

    public String getScientificImage() {
        return scientificImage;
    }

    public void setScientificImage(String scientificImage) {
        this.scientificImage = scientificImage == null ? null : scientificImage.trim();
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