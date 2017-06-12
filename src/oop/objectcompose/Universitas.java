package oop.objectcompose;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class Universitas {
    
    private String name;
    private String alamat;
    private Jurusan[] jurusan;

    public Universitas(String name, String alamat) {
        this.name = name;
        this.alamat = alamat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Jurusan[] getJurusan() {
        return jurusan;
    }

    public void setJurusan(Jurusan[] jurusan) {
        this.jurusan = jurusan;
    }            
    
}
