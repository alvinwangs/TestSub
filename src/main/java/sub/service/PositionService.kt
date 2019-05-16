package sub.service

import com.anda.persistence.db.MyBatisFactory
import sub.db.mapper.PositionMapper
import sub.model.Position
import org.slf4j.LoggerFactory


class PositionService {
    private val logger = LoggerFactory.getLogger(PositionService::class.java)

    fun save(position: Position): Int {
        val session = MyBatisFactory.getSqlSession()
        val mapper = session.getMapper(PositionMapper::class.java)

        return try {
            val result = mapper.insert(position)
            session.commit()
            result
        } catch (e: Exception) {
            logger.error("msg:${e.printStackTrace()}")
            0
        } finally {
            session.close()
        }
    }

    fun update(position: Position): Int {
        val session = MyBatisFactory.getSqlSession()
        val mapper = session.getMapper(PositionMapper::class.java)

        return try {
            val result = mapper.update(position)
            session.commit()
            result
        } catch (e: Exception) {
            logger.error("msg:${e.printStackTrace()}")
            0
        } finally {
            session.close()
        }
    }

    fun findById(positionId: Long): Position? {
        val session = MyBatisFactory.getSqlSession()
        val mapper = session.getMapper(PositionMapper::class.java)

        return try {
            val result = mapper.find(positionId)
            session.commit()
            result
        } catch (e: Exception) {
            logger.error("msg:${e.printStackTrace()}")
            null
        } finally {
            session.close()
        }
    }
}