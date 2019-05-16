package com.anda.persistence.db

import org.apache.ibatis.io.Resources
import org.apache.ibatis.session.ExecutorType
import org.apache.ibatis.session.SqlSession
import org.apache.ibatis.session.SqlSessionFactory
import org.apache.ibatis.session.SqlSessionFactoryBuilder

object MyBatisFactory {

    private var sqlSessionFactory: SqlSessionFactory? = null

    init {
        sqlSessionFactory = SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis.xml"))
    }


    fun getSqlSession(env: String = "prod", type: ExecutorType = ExecutorType.SIMPLE,
                      commit: Boolean = true): SqlSession {

        return this.sqlSessionFactory?.openSession(type, commit) ?: throw IllegalArgumentException("SqlSession is null")
    }


    fun getSqlSessionFactory(): SqlSessionFactory? {
        return this.sqlSessionFactory
    }


}