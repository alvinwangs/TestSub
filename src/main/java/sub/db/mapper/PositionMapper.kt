package sub.db.mapper

import sub.model.Position

interface PositionMapper {
    fun insert(position: Position): Int
    fun insertList(list: List<Position>): Int
    fun update(bean: Position): Int
    fun find(id: Long): Position?
}