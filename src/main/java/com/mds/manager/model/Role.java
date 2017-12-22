package com.mds.manager.model;

import java.util.Date;

public class Role {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.id
     *
     * @mbggenerated Wed Aug 16 15:59:08 CST 2017
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.role
     *
     * @mbggenerated Wed Aug 16 15:59:08 CST 2017
     */
    private String role;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.role_name
     *
     * @mbggenerated Wed Aug 16 15:59:08 CST 2017
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.role_desc
     *
     * @mbggenerated Wed Aug 16 15:59:08 CST 2017
     */
    private String roleDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.status
     *
     * @mbggenerated Wed Aug 16 15:59:08 CST 2017
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.create_time
     *
     * @mbggenerated Wed Aug 16 15:59:08 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.role_type
     *
     * @mbggenerated Wed Aug 16 15:59:08 CST 2017
     */
    private Integer roleType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.id
     *
     * @return the value of t_role.id
     *
     * @mbggenerated Wed Aug 16 15:59:08 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.id
     *
     * @param id the value for t_role.id
     *
     * @mbggenerated Wed Aug 16 15:59:08 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.role
     *
     * @return the value of t_role.role
     *
     * @mbggenerated Wed Aug 16 15:59:08 CST 2017
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.role
     *
     * @param role the value for t_role.role
     *
     * @mbggenerated Wed Aug 16 15:59:08 CST 2017
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.role_name
     *
     * @return the value of t_role.role_name
     *
     * @mbggenerated Wed Aug 16 15:59:08 CST 2017
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.role_name
     *
     * @param roleName the value for t_role.role_name
     *
     * @mbggenerated Wed Aug 16 15:59:08 CST 2017
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.role_desc
     *
     * @return the value of t_role.role_desc
     *
     * @mbggenerated Wed Aug 16 15:59:08 CST 2017
     */
    public String getRoleDesc() {
        return roleDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.role_desc
     *
     * @param roleDesc the value for t_role.role_desc
     *
     * @mbggenerated Wed Aug 16 15:59:08 CST 2017
     */
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.status
     *
     * @return the value of t_role.status
     *
     * @mbggenerated Wed Aug 16 15:59:08 CST 2017
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.status
     *
     * @param status the value for t_role.status
     *
     * @mbggenerated Wed Aug 16 15:59:08 CST 2017
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.create_time
     *
     * @return the value of t_role.create_time
     *
     * @mbggenerated Wed Aug 16 15:59:08 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.create_time
     *
     * @param createTime the value for t_role.create_time
     *
     * @mbggenerated Wed Aug 16 15:59:08 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.role_type
     *
     * @return the value of t_role.role_type
     *
     * @mbggenerated Wed Aug 16 15:59:08 CST 2017
     */
    public Integer getRoleType() {
        return roleType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.role_type
     *
     * @param roleType the value for t_role.role_type
     *
     * @mbggenerated Wed Aug 16 15:59:08 CST 2017
     */
    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }
}