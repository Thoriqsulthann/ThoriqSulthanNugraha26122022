import java.util.ArrayList;
import java.util.List;
public class AnggotaDaoImpl implements AnggotaDao {
    List<Anggota> data = new ArrayList<>();

    public AnggotaDaoImpl() {
        data.add(new Anggota("1111","Resti","Padang"));
        data.add(new Anggota("1112","Aulia","Solok"));
        data.add(new Anggota("1113","Sari","Padang"));
    }

    public void save(Anggota anggota){
        data.add(anggota);
    }
    public void update(int index,Anggota anggota){
        data.set(index, anggota);
    }
    public void delete(int index){
        data.remove(index);
    }
    public Anggota getAnggota(int index){
        return data.get(index);
    }
    public List<Anggota>getAll(){
        return data;
    }
}
