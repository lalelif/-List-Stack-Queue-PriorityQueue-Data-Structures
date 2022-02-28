package datastructuresproject2;


import datastructuresproject2.Mahalle;
import java.util.ArrayList;
import java.util.List;


public class PriorityQueue 
    {
        public List<Mahalle> liste;

        public PriorityQueue()
        {
            liste = new ArrayList<Mahalle>();
        }

        public void ekle(Mahalle mahalle)
        {
            liste.add(mahalle);
        }

        public Mahalle sil(int max)
        {   
            Mahalle temp;
            temp = liste.get(max);
            liste.remove(max);
            return temp;
        }

        public boolean bosMu()
        {

            return (liste.size() == 0);
        }

        public int elemanSayısı()
        {
            return liste.size();
        }

    @Override
    public String toString() {
        return "PriorityQueue{" + "liste=" + liste + '}';
    }

        

    }