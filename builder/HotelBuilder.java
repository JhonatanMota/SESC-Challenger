
import model.Hotel;
import model.Valor;
import util.Util;

/**
 *
 * @author Jhonatan
 *
 * Classe responsável por criar objetos de Hotel
 */
public class HotelBuilder {
    
    private static HotelBuilder builder;
    private static Hotel hotel;
    
    private HotelBuilder() {
    }
    
    public static HotelBuilder inicializaHotel() {
        builder = new HotelBuilder();
        hotel = new Hotel();
        return builder;
    }

    /**
     * @return Hotel caso nome e valores estejam preenchidos;
     */
    public Hotel build() {
        if (Util.isNullOrEmpty(hotel.getNome())
                || Util.isNullOrEmpty(hotel.getValores())) {
            return null;
        }
        return hotel;
    }
    
    public HotelBuilder comNome(String nome) {
        hotel.setNome(nome);
        return builder;
    }
    
    public HotelBuilder comValor(Valor valor) {
        hotel.addValor(valor);
        return builder;
    }
    
    public HotelBuilder comClassificacao(Integer classificacao) {
        hotel.setClassificacao(classificacao);
        return builder;
    }
}
