package BangunDatar;

/**
 *
 * @author ASUS
 */
public class PersegiPanjang implements BangunDatar {
    private final int panjang;
    private final int lebar;
    
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    /**
     *
     * @return
     */
    @Override
    public double luas() {
        return panjang * lebar;
    }
}