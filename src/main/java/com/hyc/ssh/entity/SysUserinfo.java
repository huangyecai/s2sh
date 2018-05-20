package com.hyc.ssh.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "sys_userinfo", schema = "ssh", catalog = "")
public class SysUserinfo {
    private String id;
    private String familyName;
    private String firstName;
    private String fullName;
    private String enterpriseId;
    private String organizationId;
    private String mobile;
    private String photo;
    private String sex;
    private String email;
    private String weixin;
    private String qq;
    private String officeAddress;
    private String job;
    private String jobNumber;
    private String education;
    private String school;
    private String major;
    private String graduationDate;
    private String natives;
    private String nation;
    private String identity;
    private String passport;
    private String social;
    private String bankAccount;
    private String birthday;
    private String marriage;
    private String address;
    private String emergencyContact;
    private String emergencyPhone;
    private String linkList;
    private String telPhone;
    private String createBy;
    private Timestamp createDate;
    private String updateBy;
    private Timestamp updateDate;
    private Byte isUpload;
    private Byte isDelete;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "family_name")
    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @Basic
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "full_name")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Basic
    @Column(name = "enterprise_id")
    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    @Basic
    @Column(name = "organization_id")
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    @Basic
    @Column(name = "mobile")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "photo")
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "weixin")
    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    @Basic
    @Column(name = "qq")
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Basic
    @Column(name = "office_address")
    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    @Basic
    @Column(name = "job")
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Basic
    @Column(name = "job_number")
    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    @Basic
    @Column(name = "education")
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Basic
    @Column(name = "school")
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Basic
    @Column(name = "major")
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Basic
    @Column(name = "graduation_date")
    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    @Basic
    @Column(name = "natives")
    public String getNatives() {
        return natives;
    }

    public void setNatives(String natives) {
        this.natives = natives;
    }

    @Basic
    @Column(name = "nation")
    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Basic
    @Column(name = "identity")
    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    @Basic
    @Column(name = "passport")
    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    @Basic
    @Column(name = "social")
    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    @Basic
    @Column(name = "bank_account")
    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Basic
    @Column(name = "birthday")
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "marriage")
    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "emergency_contact")
    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    @Basic
    @Column(name = "emergency_phone")
    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    public void setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone;
    }

    @Basic
    @Column(name = "link_list")
    public String getLinkList() {
        return linkList;
    }

    public void setLinkList(String linkList) {
        this.linkList = linkList;
    }

    @Basic
    @Column(name = "tel_phone")
    public String getTelPhone() {
        return telPhone;
    }

    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }

    @Basic
    @Column(name = "create_by")
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Basic
    @Column(name = "create_date")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "update_by")
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Basic
    @Column(name = "update_date")
    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    @Basic
    @Column(name = "is_upload")
    public Byte getIsUpload() {
        return isUpload;
    }

    public void setIsUpload(Byte isUpload) {
        this.isUpload = isUpload;
    }

    @Basic
    @Column(name = "is_delete")
    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysUserinfo that = (SysUserinfo) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (familyName != null ? !familyName.equals(that.familyName) : that.familyName != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (fullName != null ? !fullName.equals(that.fullName) : that.fullName != null) return false;
        if (enterpriseId != null ? !enterpriseId.equals(that.enterpriseId) : that.enterpriseId != null) return false;
        if (organizationId != null ? !organizationId.equals(that.organizationId) : that.organizationId != null)
            return false;
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;
        if (photo != null ? !photo.equals(that.photo) : that.photo != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (weixin != null ? !weixin.equals(that.weixin) : that.weixin != null) return false;
        if (qq != null ? !qq.equals(that.qq) : that.qq != null) return false;
        if (officeAddress != null ? !officeAddress.equals(that.officeAddress) : that.officeAddress != null)
            return false;
        if (job != null ? !job.equals(that.job) : that.job != null) return false;
        if (jobNumber != null ? !jobNumber.equals(that.jobNumber) : that.jobNumber != null) return false;
        if (education != null ? !education.equals(that.education) : that.education != null) return false;
        if (school != null ? !school.equals(that.school) : that.school != null) return false;
        if (major != null ? !major.equals(that.major) : that.major != null) return false;
        if (graduationDate != null ? !graduationDate.equals(that.graduationDate) : that.graduationDate != null)
            return false;
        if (natives != null ? !natives.equals(that.natives) : that.natives != null) return false;
        if (nation != null ? !nation.equals(that.nation) : that.nation != null) return false;
        if (identity != null ? !identity.equals(that.identity) : that.identity != null) return false;
        if (passport != null ? !passport.equals(that.passport) : that.passport != null) return false;
        if (social != null ? !social.equals(that.social) : that.social != null) return false;
        if (bankAccount != null ? !bankAccount.equals(that.bankAccount) : that.bankAccount != null) return false;
        if (birthday != null ? !birthday.equals(that.birthday) : that.birthday != null) return false;
        if (marriage != null ? !marriage.equals(that.marriage) : that.marriage != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (emergencyContact != null ? !emergencyContact.equals(that.emergencyContact) : that.emergencyContact != null)
            return false;
        if (emergencyPhone != null ? !emergencyPhone.equals(that.emergencyPhone) : that.emergencyPhone != null)
            return false;
        if (linkList != null ? !linkList.equals(that.linkList) : that.linkList != null) return false;
        if (telPhone != null ? !telPhone.equals(that.telPhone) : that.telPhone != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (updateBy != null ? !updateBy.equals(that.updateBy) : that.updateBy != null) return false;
        if (updateDate != null ? !updateDate.equals(that.updateDate) : that.updateDate != null) return false;
        if (isUpload != null ? !isUpload.equals(that.isUpload) : that.isUpload != null) return false;
        if (isDelete != null ? !isDelete.equals(that.isDelete) : that.isDelete != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (familyName != null ? familyName.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + (enterpriseId != null ? enterpriseId.hashCode() : 0);
        result = 31 * result + (organizationId != null ? organizationId.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (weixin != null ? weixin.hashCode() : 0);
        result = 31 * result + (qq != null ? qq.hashCode() : 0);
        result = 31 * result + (officeAddress != null ? officeAddress.hashCode() : 0);
        result = 31 * result + (job != null ? job.hashCode() : 0);
        result = 31 * result + (jobNumber != null ? jobNumber.hashCode() : 0);
        result = 31 * result + (education != null ? education.hashCode() : 0);
        result = 31 * result + (school != null ? school.hashCode() : 0);
        result = 31 * result + (major != null ? major.hashCode() : 0);
        result = 31 * result + (graduationDate != null ? graduationDate.hashCode() : 0);
        result = 31 * result + (natives != null ? natives.hashCode() : 0);
        result = 31 * result + (nation != null ? nation.hashCode() : 0);
        result = 31 * result + (identity != null ? identity.hashCode() : 0);
        result = 31 * result + (passport != null ? passport.hashCode() : 0);
        result = 31 * result + (social != null ? social.hashCode() : 0);
        result = 31 * result + (bankAccount != null ? bankAccount.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (marriage != null ? marriage.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (emergencyContact != null ? emergencyContact.hashCode() : 0);
        result = 31 * result + (emergencyPhone != null ? emergencyPhone.hashCode() : 0);
        result = 31 * result + (linkList != null ? linkList.hashCode() : 0);
        result = 31 * result + (telPhone != null ? telPhone.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        result = 31 * result + (updateDate != null ? updateDate.hashCode() : 0);
        result = 31 * result + (isUpload != null ? isUpload.hashCode() : 0);
        result = 31 * result + (isDelete != null ? isDelete.hashCode() : 0);
        return result;
    }
}
