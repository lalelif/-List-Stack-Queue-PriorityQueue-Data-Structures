
package datastructuresproject2;

import java.util.ArrayList;
import java.util.List;

public class IntPriorityQueue {
    public List<Integer> liste;
        public IntPriorityQueue()
        {
            liste = new ArrayList<Integer>();
        }

        public void ekle(Integer integer)
        {
            liste.add(integer);
        }

        public Integer sil(int min)
        {
            Integer temp;
            temp = liste.get(min);
            liste.remove(min);
            return temp;
            /*for(int i =0;i<pq.liste.size();i++){ 
                int teslimat=pq.liste.get(i).getTeslimat().size();
                if(teslimat>max){
                    max=teslimat;
                    maxIndex=i;
                }
                          
            }*/
        }

        public boolean bosMu()
        {

            return (liste.size() == 0);
        }

        public int elemanSayısı()
        {
            return liste.size();
        }
        
}
