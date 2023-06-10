fun main() {

    val premiumCustomer: Boolean = true
    var summ = 15_000_00
    var check = 0

   if (summ <= 1000_99) {
        check = summ
   } else if (summ >= 1001_00 && summ <= 10_000_99){
       check = summ-100_00
   } else {
       check = (summ*0.95).toInt()
   }

    if(premiumCustomer) {
        println("Сумма к оплате ${check*0.99/100} руб")
    }else{
        println("Сумма к оплате ${check/100} руб")
    }
}