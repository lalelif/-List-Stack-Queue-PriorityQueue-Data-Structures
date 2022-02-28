package datastructuresproject2;

import java.util.List;

public class Mahalle {

    private String mahalleAdi;
    private List<Teslimat> teslimat;

    public Mahalle(String mahalleAdi, List<Teslimat> teslimat) {
        this.mahalleAdi = mahalleAdi;
        this.teslimat = teslimat;
    }

    /**
     * @return the mahalleAdi
     */
    public String getMahalleAdi() {
        return mahalleAdi;
    }

    /**
     * @param mahalleAdi the mahalleAdi to set
     */
    public void setMahalleAdi(String mahalleAdi) {
        this.mahalleAdi = mahalleAdi;
    }

    @Override
    public String toString() {
        return "Mahalle{" + "mahalleAdi=" + mahalleAdi + ", teslimat=" + getTeslimat() + '}';
    }

    /**
     * @return the teslimat
     */
    public List<Teslimat> getTeslimat() {
        return teslimat;
    }

    /**
     * @param teslimat the teslimat to set
     */
    public void setTeslimat(List<Teslimat> teslimat) {
        this.teslimat = teslimat;
    }

}
