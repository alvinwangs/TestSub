package com.anda.sub.db

import com.alibaba.druid.pool.DruidDataSource
import com.anda.sub.config.Properties
import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory


class DruidDataSourceFactory : PooledDataSourceFactory() {
    init {
        val druidDataSource = DruidDataSource()
        druidDataSource.username = Properties.mysqlUserName
        druidDataSource.password = Properties.mysqlUserPassword
        druidDataSource.url = Properties.mysqlUrl
        druidDataSource.driverClassName = "com.mysql.jdbc.Driver"
        this.dataSource = druidDataSource
    }
}