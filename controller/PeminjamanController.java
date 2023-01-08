import RestiAuliaSari.view.FormPeminjaman;
import RestiAuliaSari.model.*;
import RestiAuliaSari.Dao.*;
import javax.swing.table.DefaultTableModel;
public class PeminjamanController {
    private FormPeminjaman formPeminjaman;
    private PeminjamanDao peminjamanDao;
    private Peminjaman peminjaman;

   public PeminjamanController (FormPeminjaman formPeminjaman){
        this.formPeminjaman = formPeminjaman;
        peminjamanDao = new PeminjamanDaoImpl();
    }
    public void bersihForm(){
        formPeminjaman.getTxtNobp().setText("");
        formPeminjaman.getTxtKodebuku().setText("");
        formPeminjaman.getTxtTglpeminjaman().setText("");
        formPeminjaman.getTxtKembali().setText("");

    }
    public void savePeminjaman(){
        peminjaman = new Peminjaman();
        peminjaman.setNobp( formPeminjaman.getTxtNobp().getText());
        peminjaman.setKodebuku( formPeminjaman.getTxtKodebuku().getText());
        peminjaman.setTglpinjam( formPeminjaman.getTxtTglpeminjaman().getText());
        peminjaman.setTglkembali( formPeminjaman.getTxtKembali().getText());
        peminjamanDao.save(peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman,"Entri Ok");
    }
    public void getPeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if (peminjaman != null){
            formPeminjaman.getTxtNobp().setText(peminjaman.getNobp());
            formPeminjaman.getTxtKodebuku().setText(peminjaman.getKodebuku());
            formPeminjaman.getTxtTglpeminjaman().setText(peminjaman.getTglpinjam());
            formPeminjaman.getTxtKembali().setText(peminjaman.getTglkembali());
        }
    }
    public void updatePeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman.setNobp( formPeminjaman.getTxtNobp().getText());
        peminjaman.setKodebuku( formPeminjaman.getTxtKodebuku().getText());
        peminjaman.setTglpinjam( formPeminjaman.getTxtTglpeminjaman().getText());
        peminjamanDao.update(index,peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman,"Update Ok");
    }
    public void deletePeminjaman(){
         int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
         peminjamanDao.delete(index);
         javax.swing.JOptionPane.showMessageDialog(formPeminjaman,"Delete Ok");
    }
    public void tampilData(){
        DefaultTableModel tabelModel = 
                (DefaultTableModel)formPeminjaman.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Peminjaman> list = peminjamanDao.getAll();
        for (Peminjaman peminjaman : list){
            Object[] data = {
                peminjaman.getNobp(),
                peminjaman.getKodebuku(),
                peminjaman .getTglpinjam(),
                peminjaman.getTglkembali()
            };
            tabelModel.addRow(data);
        }
    }
}
