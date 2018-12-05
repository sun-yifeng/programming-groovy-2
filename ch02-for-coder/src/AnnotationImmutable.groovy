import groovy.transform.Immutable

@Immutable
class CreditCard {
    String cardNumber // final字段
    int creditLimit   // final字段
}

println new CreditCard("4000-1111-2222-3333", 10000)