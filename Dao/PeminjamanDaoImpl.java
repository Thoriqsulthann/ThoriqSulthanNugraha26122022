import ThoriqSulthanNugraha.model.Peminjaman;
import java.util.ArrayList;
import java.util.List;
public class PeminjamanDaoImpl implements PeminjamanDao{
     List<Peminjaman> data = new ArrayList<>();

    public PeminjamanDaoImpl() {
    }

    public void save(Peminjaman peminjaman){
         data.add(peminjaman);
    }
    public void update(int index, Peminjaman peminjaman){
        data.set(index, peminjaman);
    }
    public void delete (int index){
         data.remove(index);
    }
    public Peminjaman getPeminjaman(int index){
          return data.get(index);
    }
    public List<Peminjaman> getAll(){
         return data;
    }
}
