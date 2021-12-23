class BankAccount(deposited: Long, withdrawn: Long) {
    val deposited = deposited
    val withdrawn = withdrawn
    val balance = this.deposited - this.withdrawn
}