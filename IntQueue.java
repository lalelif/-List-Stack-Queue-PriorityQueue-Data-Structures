/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresproject2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lalee
 */
public class IntQueue {
    
        public List<Integer> liste;

        public IntQueue()
        {
            liste = new ArrayList<Integer>();
        }

        public void ekle(Integer integer)
        {
            liste.add(integer);
        }

        public Integer sil()
        {
            Integer temp = liste.get(0);
            liste.remove(0);
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
        
}

