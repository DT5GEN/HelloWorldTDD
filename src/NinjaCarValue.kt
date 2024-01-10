var brokerageServicesRegistration: Int = 0
var finalPrice: Double = 0.0
var japanMoney: Float = 0.0f
var rusMoney: Int = 0
var FOB2: Int = 0
var banksСommissionRusMoney: Float = 0.9f
var customsFee: Float = 0.0f
var yena: Float = 0.633f
var euro: Float = 96.19f
var customsClearance: Float = 1550.0f
var flatRate: Float = 0.0f


interface NinjaCarValue: {


    fun sumJapanMoney(): Double
    fun sumRussianMoney(): Double
    fun sumFinalMoney(): Double


//   public class GlobalVar {
//        private var brokerageServicesRegistration: Int = 0
//        private var finalPrice: Double = 0.0
//        private var japanMoney: Float = 0.0f
//        private var rusMoney: Int = 0
//        var FOB2: Int = 0
//        private var banksСommissionRusMoney: Float = 0.9f
//        private var customsFee: Float = 0.0f
//        private var yena: Float = 0.633f
//        private var euro: Float = 96.19f
//        private var customsClearance: Float = 1550.0f
//        private var flatRate: Float = 0.0f
//    }


    class BaseUntil3to5(
        private val carPrice: Int,
        private val engineCapacity: Int,
        private val freightVL: Int,
        private val FOB: Int,
        private val util: Int,
        private val SBKTS: Int,
        private val SVH: Int,
        private val lab: Int,
        private val transfertTK: Int,
        private val broker: Int,
        private val glonas: Int,
        private val registr: Int,
        private val myFee: Int,
        private var buttonComission: Int,
        private val fastBid: Int,
        private val transfertCar: Int,
        private val nego: Int,
        private val customsCoefficient: Float,
        private val deliveryСity: Int,
        private val addServices: Int,
        private val newCustomer: Int,

        ) : NinjaCarValue {
        override fun sumJapanMoney(): Double {
            FOB2 = (carPrice + FOB + fastBid + transfertCar + nego + newCustomer + (buttonComission) + freightVL)
            japanMoney = (FOB2 + ((FOB2 / 100) * banksСommissionRusMoney)) * yena
            return japanMoney.toDouble()
        }

        override fun sumRussianMoney(): Double {
            flatRate = (engineCapacity * customsCoefficient * euro)
            customsFee = customsClearance + util + flatRate
            brokerageServicesRegistration = (SBKTS) + (SVH) + (lab) + (transfertTK) + (broker) + (glonas) +
                    (registr) + (myFee) + addServices + deliveryСity
            rusMoney = brokerageServicesRegistration + customsFee.toInt()
            return rusMoney.toDouble()
        }

        override fun sumFinalMoney(): Double {
            finalPrice = (japanMoney + rusMoney).toDouble()
            return finalPrice
        }


    }




    }


