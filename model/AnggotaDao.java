import java.util.List;
public interface AnggotaDao {
    void save(Anggota anggota);
    void update(int index, Anggota anggota);
    void delete (int index); 
    Anggota getAnggota(int index);
    List<Anggota>getAll();
}
