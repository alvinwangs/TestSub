package com.anda.persistence.db

import liquibase.Contexts
import liquibase.LabelExpression
import liquibase.Liquibase
import liquibase.database.DatabaseFactory
import liquibase.database.jvm.JdbcConnection
import liquibase.resource.ClassLoaderResourceAccessor
import org.slf4j.LoggerFactory
import java.sql.Connection

object LiquibaseStarter {
    private val logger = LoggerFactory.getLogger(LiquibaseStarter::class.java)

    fun startLiquibase(connection: Connection): Boolean {
        val database = DatabaseFactory.getInstance().findCorrectDatabaseImplementation(JdbcConnection(connection))
        try {
            val liquibase = Liquibase("src/main/resources/liquibase/changelog-master.xml", ClassLoaderResourceAccessor(LiquibaseStarter::class.java.classLoader), database)
            liquibase.update(Contexts(), LabelExpression())
            logger.info("startLiquibase() finished")
        } catch (e: Exception) {
            e.printStackTrace()
            return false
        }
        return true
    }
}