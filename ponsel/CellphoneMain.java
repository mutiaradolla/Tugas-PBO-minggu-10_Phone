//Mutiara Dolla Meitantya | 4405 | A11.2021.13745
package ponsel;

public class CellphoneMain {
    public static void main(String[] args){
        Cellphone cp = new Cellphone("Nokia", "3310");
        cp.powerOn();
        cp.topUp_pulsa(100000);
        cp.checkPulsa();
        cp.topUp_pulsa(50000);
        cp.checkPulsa();
        cp.tambahKontak("Sinta", "08123456789");
        cp.tambahKontak("Nia", "081233219000");
        cp.viewAllContacts();
        cp.searchContact("Sinta");
        cp.searchContact("Nia");
        cp.searchContact("Rina");
        
    }
}
