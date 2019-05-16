package sub.model


open class Position : User() {
    var type = -1
    var id = -1L
    var sequenceId = -1L
    var walletId = -1L
    var portfolioId = -1L
    var positionId = -1L
    var settleCurrency = -1
    var contractId = -1

    var size: Double = -1.0
    var cost: Double = -1.0
    var realisedPnl: Double = -1.0
    var accruedInterest: Double = -1.0
    var settledInterest: Double = -1.0
    var interestFee: Double = -1.0
    var settledInterestFee: Double = -1.0
    var accruedTimestamp = -1L
    var status = ""
    var createTime = 0L
    var updateTime = 0L
    var triggerBy = -1
    var longSize: Double = -1.0
    var longCost: Double = -1.0
    var shortSize: Double = -1.0
    var shortCost: Double = -1.0
    var tradeFee: Double = -1.0
    var beforeSize: Double = -1.0
    var beforeCost: Double = -1.0
    var beforeRealisedPnl: Double = -1.0
    var beforeLongSize: Double = -1.0
    var beforeLongCost: Double = -1.0
    var beforeShortSize: Double = -1.0
    var beforeShortCost: Double = -1.0
    var beforeTradeFee: Double = -1.0
    var beforeAccruedTimestamp: Long = -1
    var beforeSettledInterest: Double = -1.0
    var beforeAccruedInterest: Double = -1.0
    var beforeSettledInterestFee: Double = -1.0
    var changeSize :Double = -1.0

}