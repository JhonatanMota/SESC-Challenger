import model.CategoriaCliente;
import util.Util;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jhonatan
 * @since 18/02/2018
 *
 * Classe utilizada para mapear os dados do arquivo para objetos;
 */
public class ConversorEntradaDados {
    
    private CategoriaCliente categoria;
    private List<LocalDate> datas;
    private String row;
    
    public ConversorEntradaDados() {
        datas = new ArrayList<>();
    }

    /**
     * Método para converter as linhas de dados do arquivo lido para objeto;
     *
     * @param row
     * @return {@link ConversorEntradaDados}
     */
    public ConversorEntradaDados converter(String row) {
        ConversorEntradaDados conversor = new ConversorEntradaDados();
        String[] splitValues = row.split("[:,]");
        conversor.setRow(row);
        
        for (int i = 0; i < splitValues.length; i++) {
            if (splitValues[i].equalsIgnoreCase(CategoriaCliente.Usuario.getDescricao())) {
                conversor.categoria = CategoriaCliente.Usuario;
            } else if (splitValues[i].equalsIgnoreCase(CategoriaCliente.Comerciario.getDescricao())) {
                conversor.categoria = CategoriaCliente.Comerciario;
            } else {
                
                String month = splitValues[i].trim().substring(2, 5);
                LocalDate data = LocalDate.of(
                        Integer.parseInt(splitValues[i].trim().substring(5, 9)),
                        Util.convertStringToMonth(month),
                        Integer.parseInt(splitValues[i].trim().substring(0, 2)));
                conversor.datas.add(data);
            }
        }
        return conversor;
    }
    
    public CategoriaCliente getCategoria() {
        return categoria;
    }
    
    public void setCategoria(CategoriaCliente categoria) {
        this.categoria = categoria;
    }
    
    public List<LocalDate> getDatas() {
        return datas;
    }
    
    public void setDatas(List<LocalDate> datas) {
        this.datas = datas;
    }
    
    public String getRow() {
        return row;
    }
    
    public void setRow(String row) {
        this.row = row;
    }
    
    @Override
    public String toString() {
        return "ConversorEntradaDados{" + "categoria=" + categoria + ", datas=" + datas + '}';
    }
    
}
