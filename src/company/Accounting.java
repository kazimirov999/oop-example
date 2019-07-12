package company;

public interface Accounting<T extends Currency, U extends Person > {
    int getSalary(U person);
    T getCurrency();

}