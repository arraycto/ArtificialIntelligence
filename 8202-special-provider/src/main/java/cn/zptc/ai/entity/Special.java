package cn.zptc.ai.entity;

import java.io.Serializable;
import java.util.Date;

public class Special implements Serializable {
    private Integer id;

    private String title;

    private String image;

    private String evaluateWork;

    private String majorStyle;

    private String studentStyle;

    private Integer createId;

    private String createName;

    private Date createTime;

    private Integer modifyId;

    private String modifyName;

    private Date modifyTime;

    private Integer states;

    private String context;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getEvaluateWork() {
        return evaluateWork;
    }

    public void setEvaluateWork(String evaluateWork) {
        this.evaluateWork = evaluateWork == null ? null : evaluateWork.trim();
    }

    public String getMajorStyle() {
        return majorStyle;
    }

    public void setMajorStyle(String majorStyle) {
        this.majorStyle = majorStyle == null ? null : majorStyle.trim();
    }

    public String getStudentStyle() {
        return studentStyle;
    }

    public void setStudentStyle(String studentStyle) {
        this.studentStyle = studentStyle == null ? null : studentStyle.trim();
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

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }
}