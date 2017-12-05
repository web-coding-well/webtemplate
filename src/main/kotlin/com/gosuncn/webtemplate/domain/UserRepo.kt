package com.gosuncn.webtemplate.domain

import com.gosuncn.webtemplate.bean.TestResult
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

/**
 * 此接口仅作为示例
 */
@Repository
interface UserRepo : JpaRepository<UserEntity, Long> {

    /**
     * 多表联合查询示例
     */
    @Query("select new com.gosuncn.webtemplate.bean.TestResult(u.id,u.name,u.age,r.name)" +
            " from UserEntity u ,RoleEntity r,UserRoleEntity ur " +
            "where u.id=ur.userId and ur.roleId=r.id")
    fun getUserRoles(): List<TestResult>
}
