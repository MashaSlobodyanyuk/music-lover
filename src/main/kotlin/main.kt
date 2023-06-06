fun main() {

    val premiumCustomer: Boolean = true
    var summ = 1_500_000
    var check = 0

   if (summ <= 100_000) {
        check = summ
   } else if (summ >= 100_100 && summ <= 1_000_000){
       check = summ-10_000
   } else {
       check = (summ*0.95).toInt()
   }

    if(premiumCustomer) {
        println("Сумма к оплате ${check*0.99/100} руб")
    }else{
        println("Сумма к оплате ${check/100} руб")
    }
}