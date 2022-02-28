
package datastructuresproject2;

public class Teslimat {
    private String yemekAdi;
    private int adet;
    public Teslimat(String yemekAdi,int adet){
        this.yemekAdi=yemekAdi;
        this.adet=adet;
        
    }

    /**
     * @return the yemekAdi
     */
    public String getYemekAdi() {
        return yemekAdi;
    }

    /**
     * @param yemekAdi the yemekAdi to set
     */
    public void setYemekAdi(String yemekAdi) {
        this.yemekAdi = yemekAdi;
    }

    /**
     * @return the adet
     */
    public int getAdet() {
        return adet;
    }

    /**
     * @param adet the adet to set
     */
    public void setAdet(int adet) {
        this.adet = adet;
    }

    @Override
    public String toString() {
        return "yemekAdi=" + yemekAdi + ",adet=" + adet+" , ";
    }
        
}
