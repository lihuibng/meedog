package com.macro.meedog.model;

import com.macro.meedog.common.geo.GeoPoint;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class WorldUniv implements Serializable {
    @ApiModelProperty(value = "学校ID")
    private Long id;

    @ApiModelProperty(value = "国家 ID")
    private Long countryId;

    @ApiModelProperty(value = "国家中文")
    private String countryName;

    @ApiModelProperty(value = "国家英文")
    private String enCountryName;

    @ApiModelProperty(value = "国内排名")
    private Integer countryRank;

    @ApiModelProperty(value = "世界排名")
    private Integer worldRank;

    @ApiModelProperty(value = "英文全称")
    private String englishFullName;

    @ApiModelProperty(value = "英文别名")
    private String alterEnglishName;

    @ApiModelProperty(value = "中文简称")
    private String chineseName;

    @ApiModelProperty(value = "英文简称")
    private String acronym;

    @ApiModelProperty(value = "logo")
    private String logo;

    @ApiModelProperty(value = "官方网站")
    private String website;

    @ApiModelProperty(value = "成立年份")
    private String founded;

    @ApiModelProperty(value = "校训")
    private String motto;

    @ApiModelProperty(value = "简介")
    private String introduction;

    @ApiModelProperty(value = "邮编")
    private String postcode;

    @ApiModelProperty(value = "电话")
    private String telephone;

    @ApiModelProperty(value = "学校类型 大学 小学 中学")
    private Integer type;

    @ApiModelProperty(value = "传真")
    private String fax;

    @ApiModelProperty(value = "是否211")
    private Integer is211;

    @ApiModelProperty(value = "是否985")
    private Integer is985;

    @ApiModelProperty(value = "是否自主招生")
    private Integer independentRecruit;

    @ApiModelProperty(value = "是否有研究生院")
    private Integer isGraduateSchool;

    @ApiModelProperty(value = "重点学科数量")
    private Integer keyDisciplineCount;

    @ApiModelProperty(value = "隶属于")
    private String subordinate;

    @ApiModelProperty(value = "博士点数量")
    private Integer docProgramCount;

    @ApiModelProperty(value = "硕士点数量")
    private Integer masterProgramCount;

    @ApiModelProperty(value = "院士数量")
    private Integer academicianCount;

    @ApiModelProperty(value = "招生电话")
    private String recruitPhone;

    @ApiModelProperty(value = "男性比例")
    private String malePercentage;

    @ApiModelProperty(value = "女性比例")
    private String femalePercentage;

    @ApiModelProperty(value = "电子邮件")
    private String email;

    @ApiModelProperty(value = "招生官网")
    private String recruitWebsite;

    @ApiModelProperty(value = "招生地址")
    private String recruitAddress;

    @ApiModelProperty(value = "QS 世界排名")
    private Integer qsRank;

    @ApiModelProperty(value = "地理位置")
    private GeoPoint location;

    @ApiModelProperty(value = "地址")
    private String address;

    @ApiModelProperty(value = "街道地址")
    private String streetAddress;

    @ApiModelProperty(value = "城市")
    private String addressLocality;

    @ApiModelProperty(value = "省")
    private String region;

    @ApiModelProperty(value = "州、省 ID")
    private Long regionId;

    @ApiModelProperty(value = "城市 ID")
    private Long cityId;

    @ApiModelProperty(value = "城市")
    private String city;

    @ApiModelProperty(value = "抓取连接")
    private String crawlLink;

    @ApiModelProperty(value = "当地本科学费")
    private String localStudentUndergraduate;

    @ApiModelProperty(value = "国际本科学费")
    private String interStudentUndergraduate;

    @ApiModelProperty(value = "当地研究生学费")
    private String localStudentPostgraduate;

    @ApiModelProperty(value = "国际研究生学费")
    private String interStudentPostgraduate;

    @ApiModelProperty(value = "学生规模")
    private String studentEnrollment;

    @ApiModelProperty(value = "老师规模")
    private String academicStaff;

    @ApiModelProperty(value = "学校类型")
    private String academicType;

    @ApiModelProperty(value = "私立公立")
    private String controlType;

    @ApiModelProperty(value = "公益非公益")
    private String entityType;

    @ApiModelProperty(value = "pics")
    private String pics;

    @ApiModelProperty(value = "数字简称")
    private Integer digitCode;

    @ApiModelProperty(value = "fb")
    private String fb;

    @ApiModelProperty(value = "fb_link")
    private String fbLink;

    @ApiModelProperty(value = "tw")
    private String tw;

    @ApiModelProperty(value = "fb_link")
    private String twLink;

    @ApiModelProperty(value = "ln")
    private String ln;

    @ApiModelProperty(value = "ln_link")
    private String lnLink;

    @ApiModelProperty(value = "ytb")
    private String ytb;

    @ApiModelProperty(value = "ytb_link")
    private String ytbLink;

    @ApiModelProperty(value = "ins")
    private String ins;

    @ApiModelProperty(value = "ins_link")
    private String insLink;

    @ApiModelProperty(value = "wiki")
    private String wiki;

    @ApiModelProperty(value = "wiki_link")
    private String wikiLink;

    @ApiModelProperty(value = "启用状态：0->禁用；1->启用")
    private Integer status;

    @ApiModelProperty(value = "活动创建时间")
    private Date createTime;

    @ApiModelProperty(value = "活动修改时间")
    private Date modifiedTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName == null ? null : countryName.trim();
    }

    public String getEnCountryName() {
        return enCountryName;
    }

    public void setEnCountryName(String enCountryName) {
        this.enCountryName = enCountryName == null ? null : enCountryName.trim();
    }

    public Integer getCountryRank() {
        return countryRank;
    }

    public void setCountryRank(Integer countryRank) {
        this.countryRank = countryRank;
    }

    public Integer getWorldRank() {
        return worldRank;
    }

    public void setWorldRank(Integer worldRank) {
        this.worldRank = worldRank;
    }

    public String getEnglishFullName() {
        return englishFullName;
    }

    public void setEnglishFullName(String englishFullName) {
        this.englishFullName = englishFullName == null ? null : englishFullName.trim();
    }

    public String getAlterEnglishName() {
        return alterEnglishName;
    }

    public void setAlterEnglishName(String alterEnglishName) {
        this.alterEnglishName = alterEnglishName == null ? null : alterEnglishName.trim();
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName == null ? null : chineseName.trim();
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym == null ? null : acronym.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    public String getFounded() {
        return founded;
    }

    public void setFounded(String founded) {
        this.founded = founded == null ? null : founded.trim();
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto == null ? null : motto.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public Integer getIs211() {
        return is211;
    }

    public void setIs211(Integer is211) {
        this.is211 = is211;
    }

    public Integer getIs985() {
        return is985;
    }

    public void setIs985(Integer is985) {
        this.is985 = is985;
    }

    public Integer getIndependentRecruit() {
        return independentRecruit;
    }

    public void setIndependentRecruit(Integer independentRecruit) {
        this.independentRecruit = independentRecruit;
    }

    public Integer getIsGraduateSchool() {
        return isGraduateSchool;
    }

    public void setIsGraduateSchool(Integer isGraduateSchool) {
        this.isGraduateSchool = isGraduateSchool;
    }

    public Integer getKeyDisciplineCount() {
        return keyDisciplineCount;
    }

    public void setKeyDisciplineCount(Integer keyDisciplineCount) {
        this.keyDisciplineCount = keyDisciplineCount;
    }

    public String getSubordinate() {
        return subordinate;
    }

    public void setSubordinate(String subordinate) {
        this.subordinate = subordinate == null ? null : subordinate.trim();
    }

    public Integer getDocProgramCount() {
        return docProgramCount;
    }

    public void setDocProgramCount(Integer docProgramCount) {
        this.docProgramCount = docProgramCount;
    }

    public Integer getMasterProgramCount() {
        return masterProgramCount;
    }

    public void setMasterProgramCount(Integer masterProgramCount) {
        this.masterProgramCount = masterProgramCount;
    }

    public Integer getAcademicianCount() {
        return academicianCount;
    }

    public void setAcademicianCount(Integer academicianCount) {
        this.academicianCount = academicianCount;
    }

    public String getRecruitPhone() {
        return recruitPhone;
    }

    public void setRecruitPhone(String recruitPhone) {
        this.recruitPhone = recruitPhone == null ? null : recruitPhone.trim();
    }

    public String getMalePercentage() {
        return malePercentage;
    }

    public void setMalePercentage(String malePercentage) {
        this.malePercentage = malePercentage == null ? null : malePercentage.trim();
    }

    public String getFemalePercentage() {
        return femalePercentage;
    }

    public void setFemalePercentage(String femalePercentage) {
        this.femalePercentage = femalePercentage == null ? null : femalePercentage.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getRecruitWebsite() {
        return recruitWebsite;
    }

    public void setRecruitWebsite(String recruitWebsite) {
        this.recruitWebsite = recruitWebsite == null ? null : recruitWebsite.trim();
    }

    public String getRecruitAddress() {
        return recruitAddress;
    }

    public void setRecruitAddress(String recruitAddress) {
        this.recruitAddress = recruitAddress == null ? null : recruitAddress.trim();
    }

    public Integer getQsRank() {
        return qsRank;
    }

    public void setQsRank(Integer qsRank) {
        this.qsRank = qsRank;
    }

    public GeoPoint getLocation() {
        return location;
    }

    public void setLocation(GeoPoint location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress == null ? null : streetAddress.trim();
    }

    public String getAddressLocality() {
        return addressLocality;
    }

    public void setAddressLocality(String addressLocality) {
        this.addressLocality = addressLocality == null ? null : addressLocality.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCrawlLink() {
        return crawlLink;
    }

    public void setCrawlLink(String crawlLink) {
        this.crawlLink = crawlLink == null ? null : crawlLink.trim();
    }

    public String getLocalStudentUndergraduate() {
        return localStudentUndergraduate;
    }

    public void setLocalStudentUndergraduate(String localStudentUndergraduate) {
        this.localStudentUndergraduate = localStudentUndergraduate == null ? null : localStudentUndergraduate.trim();
    }

    public String getInterStudentUndergraduate() {
        return interStudentUndergraduate;
    }

    public void setInterStudentUndergraduate(String interStudentUndergraduate) {
        this.interStudentUndergraduate = interStudentUndergraduate == null ? null : interStudentUndergraduate.trim();
    }

    public String getLocalStudentPostgraduate() {
        return localStudentPostgraduate;
    }

    public void setLocalStudentPostgraduate(String localStudentPostgraduate) {
        this.localStudentPostgraduate = localStudentPostgraduate == null ? null : localStudentPostgraduate.trim();
    }

    public String getInterStudentPostgraduate() {
        return interStudentPostgraduate;
    }

    public void setInterStudentPostgraduate(String interStudentPostgraduate) {
        this.interStudentPostgraduate = interStudentPostgraduate == null ? null : interStudentPostgraduate.trim();
    }

    public String getStudentEnrollment() {
        return studentEnrollment;
    }

    public void setStudentEnrollment(String studentEnrollment) {
        this.studentEnrollment = studentEnrollment == null ? null : studentEnrollment.trim();
    }

    public String getAcademicStaff() {
        return academicStaff;
    }

    public void setAcademicStaff(String academicStaff) {
        this.academicStaff = academicStaff == null ? null : academicStaff.trim();
    }

    public String getAcademicType() {
        return academicType;
    }

    public void setAcademicType(String academicType) {
        this.academicType = academicType == null ? null : academicType.trim();
    }

    public String getControlType() {
        return controlType;
    }

    public void setControlType(String controlType) {
        this.controlType = controlType == null ? null : controlType.trim();
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType == null ? null : entityType.trim();
    }

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics == null ? null : pics.trim();
    }

    public Integer getDigitCode() {
        return digitCode;
    }

    public void setDigitCode(Integer digitCode) {
        this.digitCode = digitCode;
    }

    public String getFb() {
        return fb;
    }

    public void setFb(String fb) {
        this.fb = fb == null ? null : fb.trim();
    }

    public String getFbLink() {
        return fbLink;
    }

    public void setFbLink(String fbLink) {
        this.fbLink = fbLink == null ? null : fbLink.trim();
    }

    public String getTw() {
        return tw;
    }

    public void setTw(String tw) {
        this.tw = tw == null ? null : tw.trim();
    }

    public String getTwLink() {
        return twLink;
    }

    public void setTwLink(String twLink) {
        this.twLink = twLink == null ? null : twLink.trim();
    }

    public String getLn() {
        return ln;
    }

    public void setLn(String ln) {
        this.ln = ln == null ? null : ln.trim();
    }

    public String getLnLink() {
        return lnLink;
    }

    public void setLnLink(String lnLink) {
        this.lnLink = lnLink == null ? null : lnLink.trim();
    }

    public String getYtb() {
        return ytb;
    }

    public void setYtb(String ytb) {
        this.ytb = ytb == null ? null : ytb.trim();
    }

    public String getYtbLink() {
        return ytbLink;
    }

    public void setYtbLink(String ytbLink) {
        this.ytbLink = ytbLink == null ? null : ytbLink.trim();
    }

    public String getIns() {
        return ins;
    }

    public void setIns(String ins) {
        this.ins = ins == null ? null : ins.trim();
    }

    public String getInsLink() {
        return insLink;
    }

    public void setInsLink(String insLink) {
        this.insLink = insLink == null ? null : insLink.trim();
    }

    public String getWiki() {
        return wiki;
    }

    public void setWiki(String wiki) {
        this.wiki = wiki == null ? null : wiki.trim();
    }

    public String getWikiLink() {
        return wikiLink;
    }

    public void setWikiLink(String wikiLink) {
        this.wikiLink = wikiLink == null ? null : wikiLink.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", countryId=").append(countryId);
        sb.append(", countryName=").append(countryName);
        sb.append(", enCountryName=").append(enCountryName);
        sb.append(", countryRank=").append(countryRank);
        sb.append(", worldRank=").append(worldRank);
        sb.append(", englishFullName=").append(englishFullName);
        sb.append(", alterEnglishName=").append(alterEnglishName);
        sb.append(", chineseName=").append(chineseName);
        sb.append(", acronym=").append(acronym);
        sb.append(", logo=").append(logo);
        sb.append(", website=").append(website);
        sb.append(", founded=").append(founded);
        sb.append(", motto=").append(motto);
        sb.append(", introduction=").append(introduction);
        sb.append(", postcode=").append(postcode);
        sb.append(", telephone=").append(telephone);
        sb.append(", type=").append(type);
        sb.append(", fax=").append(fax);
        sb.append(", is211=").append(is211);
        sb.append(", is985=").append(is985);
        sb.append(", independentRecruit=").append(independentRecruit);
        sb.append(", isGraduateSchool=").append(isGraduateSchool);
        sb.append(", keyDisciplineCount=").append(keyDisciplineCount);
        sb.append(", subordinate=").append(subordinate);
        sb.append(", docProgramCount=").append(docProgramCount);
        sb.append(", masterProgramCount=").append(masterProgramCount);
        sb.append(", academicianCount=").append(academicianCount);
        sb.append(", recruitPhone=").append(recruitPhone);
        sb.append(", malePercentage=").append(malePercentage);
        sb.append(", femalePercentage=").append(femalePercentage);
        sb.append(", email=").append(email);
        sb.append(", recruitWebsite=").append(recruitWebsite);
        sb.append(", recruitAddress=").append(recruitAddress);
        sb.append(", qsRank=").append(qsRank);
        sb.append(", location=").append(location);
        sb.append(", address=").append(address);
        sb.append(", streetAddress=").append(streetAddress);
        sb.append(", addressLocality=").append(addressLocality);
        sb.append(", region=").append(region);
        sb.append(", regionId=").append(regionId);
        sb.append(", cityId=").append(cityId);
        sb.append(", city=").append(city);
        sb.append(", crawlLink=").append(crawlLink);
        sb.append(", localStudentUndergraduate=").append(localStudentUndergraduate);
        sb.append(", interStudentUndergraduate=").append(interStudentUndergraduate);
        sb.append(", localStudentPostgraduate=").append(localStudentPostgraduate);
        sb.append(", interStudentPostgraduate=").append(interStudentPostgraduate);
        sb.append(", studentEnrollment=").append(studentEnrollment);
        sb.append(", academicStaff=").append(academicStaff);
        sb.append(", academicType=").append(academicType);
        sb.append(", controlType=").append(controlType);
        sb.append(", entityType=").append(entityType);
        sb.append(", pics=").append(pics);
        sb.append(", digitCode=").append(digitCode);
        sb.append(", fb=").append(fb);
        sb.append(", fbLink=").append(fbLink);
        sb.append(", tw=").append(tw);
        sb.append(", twLink=").append(twLink);
        sb.append(", ln=").append(ln);
        sb.append(", lnLink=").append(lnLink);
        sb.append(", ytb=").append(ytb);
        sb.append(", ytbLink=").append(ytbLink);
        sb.append(", ins=").append(ins);
        sb.append(", insLink=").append(insLink);
        sb.append(", wiki=").append(wiki);
        sb.append(", wikiLink=").append(wikiLink);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}