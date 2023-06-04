//Mutiara Dolla Meitantya | 4405 | A11.2021.13745
package ponsel;

import java.lang.Math;
import java.util.ArrayList;

public class Cellphone implements Phone{
    String merk;
    String type;
    int batteryLevel;
    int status;
    int volume;
    int sisaPulsa;
    ArrayList<Contact> contacts = new ArrayList<Contact>();

    public Cellphone(String merk,String type)
    {
        this.merk = merk;
        this.type = type;
        this.batteryLevel = (int)(Math.random()*(100-0+1)+0);  
    }

    public void powerOn(){
        this.status = 1;
        System.out.println("Ponsel menyala");
    }
    
    public void powerOff(){
        this.status = 0;
        System.out.println("Ponsel mati");
    }

    //method jika ponsel mati, maka semua operasi tidak dapat dilakukan
    public void checkStatus(){
        if(this.status == 0){
            System.out.println("Ponsel mati. Tidak dapat melakukan operasi");
        }
    }

    public void volumeUp(){
        if(this.status == 0){
            System.out.println("Ponsel mati. Tidak dapat menaikkan volume");
        }
        else
        {
            this.volume++;
            if(this.volume>=100)
            {
                this.volume = 100;
            }
        }
    }

    public void volumeDown(){
        
        this.volume--;
    }

    public int getVolume(){
        return this.volume;
    }

    //method unutk melakukan top up pulsa
    public void topUp_pulsa(int pulsa){
        if(this.status == 0){
            System.out.println("Ponsel mati. Tidak dapat melakukan top up");
        }
        else
        {
            this.sisaPulsa = this.sisaPulsa + pulsa;
            System.out.println("Top up pulsa sebesar "+pulsa+" berhasil");
        }
    }

    //method untuk menampilkan sisa pulsa
    public void checkPulsa(){
        if (this.status == 0){
            System.out.println("Ponsel mati. Tidak dapat menampilkan sisa pulsa");
        }
        else
        {
            System.out.println("Sisa pulsa anda adalah "+this.sisaPulsa );
            System.out.println();
        }

    }

    //method untuk menambahkan contact
    public void tambahKontak(String nama, String nomor){
        if (this.status == 0){
            System.out.println("Ponsel mati. Tidak dapat menambahkan kontak");
        }
        else
        {
            Contact kontak = new Contact(nama,nomor); 
            contacts.add(kontak);
            for (Contact contact : contacts) {
                contact.getNama();
                contact.getNomor();
            }

            System.out.println("Kontak " + nama + " - " + nomor + " berhasil ditambahkan");
        }

    }

    //method untuk menampilkan daftar kontak
    public void viewAllContacts(){
        System.out.println();
        System.out.println("Daftar kontak : ");
        if (contacts.isEmpty()){
            System.out.println("Kontak kosong");
            System.out.println();
        }
        else
        {
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println(contacts.get(i).getNama()+" "+contacts.get(i).getNomor());           
            }
            System.out.println();
        }
    }

    //method untuk mencari kontak berdasarkan nama
    public void searchContact(String nama){
        if (this.status == 0){
            System.out.println("Ponsel mati. Tidak dapat mencari kontak");
        }
        else
        {
            int found = 0;
            for (int i = 0; i < contacts.size(); i++) {
                if (contacts.get(i).getNama().equals(nama)){
                    System.out.println("Kontak "+nama+" ditemukan");
                    System.out.println("Nomor "+nama+" adalah "+contacts.get(i).getNomor());
                    found = 1;
                    System.out.println();
                }
            }
            if (found == 0){
                System.out.println(nama+" tidak ditemukan");
                System.out.println();
            }
        }
    }


   

}
