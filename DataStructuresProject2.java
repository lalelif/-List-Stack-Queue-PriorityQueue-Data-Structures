
package datastructuresproject2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataStructuresProject2 {
    
    public static void main(String[] args) {
        Random rand = new Random();
        String[] mahalleAdi={ "Özkanlar", "Evka 3", "Atatürk", "Erzene", "Kazımdirik", "Mevlana", "Doğanlar", "Ergene" };
        int mahalleSay=mahalleAdi.length;
        int[] teslimatSayisi = { 5, 2, 7, 2, 7, 3, 0, 1 }; 
        String[] yemekAdlari ={"pizza","pilav","simit","kızartma","börek","türlü","musakka","hamburger","döner","sarma"};
        int yemekSayisi=yemekAdlari.length;
         //0-10 arası adet sayısı verir düzelt sonra
        int listeSay=0;
        int teslimatSay=0;
        ArrayList<Mahalle> al = new ArrayList<Mahalle>();
        for (int j =0; j<mahalleSay;j++)
        {
            List<Teslimat> genericList = new ArrayList<Teslimat>();
            listeSay++;
            for (int k =0; k<teslimatSayisi[j];k++)
            {
                String rdmYemekAdi=yemekAdlari[rand.nextInt(yemekSayisi)];
                int adet =rand.nextInt(100);        
                genericList.add(new Teslimat(rdmYemekAdi,adet));
                teslimatSay++;   
            }
            Mahalle mahalle = new Mahalle(mahalleAdi[j],genericList);
            al.add(mahalle);
            List<Teslimat> teslimats=mahalle.getTeslimat();
            System.out.println(mahalle.getMahalleAdi());
            for (Teslimat alItem:teslimats)
            {
                System.out.print(alItem);                        
            }
            System.out.println("");
        }
        System.out.println("Liste sayısı:"+listeSay);
        System.out.println("Toplam teslimat sayısı:"+teslimatSay);
        
        //------------------------ stack section
        Stack stck = new Stack(mahalleSay);
        for(int i=0; i<mahalleSay;i++){
            stck.push(al.get(i));
        }
        
        int y=mahalleSay-1;
        System.out.println("Yığıt için");
        while( !stck.isEmpty() ) // until it’s empty,
        { // delete item from stack
            Mahalle value = stck.pop();
            
            System.out.println(value+" Mahallesi Teslimat bilgileri:"+value.getTeslimat()); // display it
            y--;
            System.out.print(" ");
        } // end while
        System.out.println(" ");
         
        //--------------------------queue section
        Queue theQueue = new Queue(mahalleSay);
        for(Mahalle mhl2:al){
            theQueue.insert(mhl2);
        }
        int x=0;
        System.out.println("Kuyruk için");
        while( !theQueue.isEmpty() ) // remove and display
        { // all items
            Mahalle n = theQueue.remove(); // (40, 50, 60, 70, 80)
            
            System.out.println(n+" Mahallesi Teslimat Bilgileri:"+n.getTeslimat());
            x++;
            System.out.print(" ");
        }
        System.out.println(" "); 
        
        System.out.println("Öncelik kuyruğu için:");
        PriorityQueue pq = new PriorityQueue();
        for(int i =0; i<mahalleSay;i++){
           pq.ekle(al.get(i));
        }
     
        while(!pq.bosMu()){
            int max=0;
            int maxIndex=0;
            for(int i =0;i<pq.liste.size();i++){ 
                int teslimat=pq.liste.get(i).getTeslimat().size();
                if(teslimat>max){
                    max=teslimat;
                    maxIndex=i;
                }
                          
            }
            System.out.println(pq.sil(maxIndex));
        
            
        }
        int[] dizi={6, 7, 2, 1, 12, 5, 3, 7, 4, 2}; 
        IntQueue iq =new IntQueue() ;
        for(int i=0;i<dizi.length;i++){
            iq.ekle(dizi[i]);
        }
        List<Integer> iqList= new ArrayList<Integer>();
        for(int j=iq.liste.size();j>0;j--){
            iqList.add(iq.sil());
        }
        System.out.println("Queue için");
        ortSureHesapla(3, iqList);
         
        IntPriorityQueue ipq =new IntPriorityQueue() ;
        for(int i=0;i<dizi.length;i++){
            ipq.ekle(dizi[i]);
        }
        List<Integer> ipqList= new ArrayList<Integer>();
        
        
        while(!ipq.bosMu()){
            int min=ipq.liste.get(0);
            int minIndex=0;
            for(int i =0;i<ipq.liste.size();i++){ 
                if(ipq.liste.get(i)<min){
                    min=ipq.liste.get(i);
                    minIndex=i;                    
                }
                
            }
            ipqList.add(ipq.sil(minIndex));
        }    
        System.out.println("Priority queue için");
        ortSureHesapla(3, ipqList);
        
    }
    public static void ortSureHesapla(int islemSuresi,List<Integer> liste){
            int topIslem=0;
            int musteriIslem=0;
            int topUrun=0;
            int topMusteri=liste.size();
            for(int item=0;item<topMusteri;item++){
                topUrun+=liste.get(item);
                musteriIslem=topUrun*islemSuresi;
                topIslem+=musteriIslem;
                System.out.println((item+1)+". müşterinin işlem tamamlanma süresi:"+musteriIslem);
            }                            
            System.out.println(topIslem/topMusteri);
   
        }
}

    
