package com.xyp.ujsweb.entity;

/**
 * Friend:
 *朋友关系的映射对象
 * @author XvYanPeng
 * @date 2019/5/1 21:41
 */
public class Friend {
    private String reference;
    private String referenced;

    @Override
    public String toString() {
        return "Friend{" +
                "reference='" + reference + '\'' +
                ", referenced='" + referenced + '\'' +
                '}';
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getReferenced() {
        return referenced;
    }

    public void setReferenced(String referenced) {
        this.referenced = referenced;
    }

    public Friend() {
    }

    public Friend(String reference, String referenced) {
        this.reference = reference;
        this.referenced = referenced;
    }
}
